package name.griffeth.sebastian.MCGameMaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Spliterator;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import name.griffeth.sebastian.MCGameMaker.Command.SupportedEvent;
import name.griffeth.sebastian.MCGameMaker.entity.WintapPlayer;
import name.griffeth.sebastian.MCGameMaker.inventory.Inventory;
import name.griffeth.sebastian.MCGameMaker.inventory.Inventory.Type;
import name.griffeth.sebastian.MCGameMaker.inventory.MagicStack;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.ClickEvent.Action;

public class Main extends JavaPlugin implements Listener {
	
	private static String NAME=null;
	
	private static DataManager data;
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		data=new DataManager(this);
		NAME=ChatColor.GRAY + "[" + ChatColor.WHITE + getName() + ChatColor.GRAY + "]" + ChatColor.WHITE + " ";
		//Loading HashMaps
		data.saveDefaultConfig(); // Create data.yml
		load();
		info(getName() + " has been enabled");
	}
	 
	@Override
	public void onDisable() {
		//Saving HashMaps
		save();
	}
	
	public static void save() {
		if(!Command.COMMANDS.isEmpty())
			for(Map.Entry<SupportedEvent,List<String>> entry : Command.COMMANDS.entrySet()) {
				info("Saving commands : " + "key : " + entry.getKey().toString() + ", value : " + entry.getValue().toString());
				Iterator<String> it = entry.getValue().iterator();
				String fff = "";
				while(it.hasNext()) {
					String next = it.next();
					if(next != null)
					fff=fff + "," + next;
				}
				info("String is : " + fff);
				data.getConfig().set("commands." + entry.getKey().toString(), fff);
				data.saveConfig();
			}
	}
	
	public static void load() {
		//info("Loading maps");
		if(data.getConfig().contains("commands")) {
			//info("data.getConfig.contains=commands");
			data.getConfig().getConfigurationSection("commands").getKeys(false).forEach(key -> {
				/*
				//
				info(data.getConfig().get("commands." + key).toString() + " is value argument");
				//
				info("Loading : key : " + SupportedEvent.valueOf(key) + ", value : " + data.getConfig()
				.getStringList(data.getConfig().get("commands." + key).toString()));
				//
				Command.COMMANDS.put(SupportedEvent.valueOf(key), data.getConfig()
				.getStringList(data.getConfig().get("commands." + key).toString()));
				*/
				
				//
				//info(data.getConfig().get("commands." + key) + " is value argument");
				//
				//info("Loading : key : " + SupportedEvent.valueOf(key) + ", value : " + data.getConfig().get("commands." + key));
				String aa = data.getConfig().get("commands." + key).toString();
				String[] sff = aa.split(",");
				List<String> vb = new ArrayList<String>();
				for(String ef : sff) {
					if(ef == null) continue;
					//info("its : " + ef);
					vb.add(ef);
				}
				//
				Command.COMMANDS.put(SupportedEvent.valueOf(key), vb);
				
			});
		}
	}
	
	public static String getString(String[] args) {
		String args2 = "";
		for(String arg : args) {
			args2 = args2 + " " + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	public static String getFancyName() {
		return NAME;
	}
	
	protected static void info(String str) {
		//Tired of writing Bukkit.getLogger().info()
		Bukkit.getLogger().info(str);
	}
	
	@Override
	public boolean onCommand(CommandSender sender,org.bukkit.command.Command command,String label,String[] args) {
		if(!(sender instanceof Player)) return true;
		Player p = (Player) sender;
		WintapPlayer wp = new WintapPlayer(p);
		//info("Command that player is doing is : " + command.getName());
		/*String args2 = "";
		for(String arg : args) {
			args2 = args2 + " " + arg;
		}
		info(args2 + " is the arguments yay");*/
		String args2 = getString(args);
		info(label + " is the command YAYAYY");
		info(label + args2 + " is the args + the command AYy");
		wp.setCommand(label + args2);
		name.griffeth.sebastian.MCGameMaker.Command cmd = new name.griffeth.sebastian.MCGameMaker.Command(label);
		name.griffeth.sebastian.MCGameMaker.inventory.Inventory inv = new name.griffeth.
		sebastian.MCGameMaker.inventory.Inventory(Bukkit.createInventory(null, 54, ""));
		switch(label.toLowerCase()) {
		case "mob":
			info("mob command!");
			if(args.length == 1) { 
				info("mob command args=1");
				switch(args[0]) { 
				case "create":
					info("mob command args1=create");
					//p.openInventory(inv.newInventory(Type.MOB_INVENTORY));  <-- Not dealing with inventory's yet
				}
			}else if(args.length == 0) {
				info("args=0");
				List<Message> msgs = new ArrayList<Message>();
				msgs.add(new Message("Hey, the mob command is not finished yet",ChatMessageType.CHAT));
				msgs.add(new Message("Sorry",ChatMessageType.CHAT));
				wp.sendTutorial(msgs);
			}
			wp.sendMessage("mob is not done");
			return true;
		case "item":
			info("item command!");
			if(args.length == 1) {
				info("item command args=1");
				switch(args[0]) {
				case "create": 
					info("item command args1=create");
					//p.openInventory(inv.newInventory(Type.ITEM_INVENTORY));  <-- Not dealing with inventory's yet
					
				}
			}else if(args.length == 0) {
				info("args=0");
				List<Message> msgs = new ArrayList<Message>();
				msgs.add(new Message("Hey, the item command is not finished yet",ChatMessageType.CHAT));
				msgs.add(new Message("Sorry",ChatMessageType.CHAT));
				wp.sendTutorial(msgs);
			}
			wp.sendMessage("item is not done");
			return true;
		case "block":
			info("block command!");
			if(args.length == 1) {
				info("block command args=1");
				switch(args[0]) {
				case "create":
					info("block command args1=create");
					//p.openInventory(inv.newInventory(Type.BLOCK_INVENTORY)); <-- Not dealing with inventory's yet
				}
			}else if(args.length == 0) {
				info("args=0");
				List<Message> msgs = new ArrayList<Message>();
				msgs.add(new Message("Hey, the block command is not finished yet",ChatMessageType.CHAT));
				msgs.add(new Message("Sorry",ChatMessageType.CHAT));
				wp.sendTutorial(msgs);
			}
			wp.sendMessage("block is not done");
			return true;
		case "command":
			//info("command is being run");
			//The amount of arguments must be at least 2 /command configure "<Command>"
			if(args.length >= 2) {
				//info("args are at least 2");
				switch(args[0]) {
				/*
				 * The first argument is configure meaning the player is selecting a command
				 */
				case "configure":
					//info("args[0] is configure");
					//if(args[1] == null) break; <-- Dont think we need this
					//info("args[1] is not null");
					//If the second argument is help lets tell them what to do
					if(args[1].equalsIgnoreCase("help")){
						wp.sendMessage("This command selects a command which you can later schedule with /command event or /command schedule"
								+ "\n/command configure correct usage is : /command configure \"<TheCommandYouWantToSelect>\"");
						break;
					}else if(args[1].equalsIgnoreCase("null")) {
						wp.setSelectedCommand(null);
						wp.sendMessage("Set the selected command to null do /command event");
						break;
					}
					//info("args[1] is not help");
					//See onPlayerCommandPreprocessEvent the rest of the command is executed there
					break;
				case "event":
					info("args[0] is event");
					//if(args[1] == null) break; <-- I dont think we need this
					info("args[1] is not null");
					//If the second argument is help lets tell them what to do
					if(args[1].equals("help")) {
						//Give them a list of events
						wp.sendMessage("Here is a list of supported events :");
						for(SupportedEvent e : SupportedEvent.values()) {
							p.sendMessage(e.toString());
						}
						//Tell them how to list all events
						wp.sendMessage(new Message("You can always show this list with /command event list or clicking here",new ClickEvent(Action.RUN_COMMAND, "/command event list"),new HoverEvent(
						HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create(/**/))));
						//Explain what a event is
						List<Message> msgs = new ArrayList<Message>();
						msgs.add(new Message("This command allows you to schedule commands to run on any event for example you could very easily send any player who joins a message saying : Hello, Welcome to the Server!"));
						
						msgs.add(new Message("The correct usage is /command event <A Event from the list above>/list list/clear"));
						
						msgs.add(new Message("For example the PlayerJoinEvent is called\nwhenever a player joins." + "\n\nScheduling a command takes only two steps"
						+ " :" + "\n1. /command configure \"say Please welcome @p to the Server\"" + "\n2. /command event PlayerJoinEvent\n"));
						
						msgs.add(new Message("\nNow when a player joins it should run the command /say Please welcome @p to the Server and output \"Please welcome \"WhatEverThePlayersNameIs\" to the Server\""));
						
						/*wp.sendMessage("Events can normally only be used with minecraft plugins not in game commands or datapacks.\n"
						+ " However this plugin enables you to schedule a command to run whenever a ceirtain event is called (There is a list of events above). For"
						+ " example the PlayerJoinEvent is called whenever a player joins." + "\nScheduling a command takes only two steps"
						+ " :" + "\n1. /command configure \"say Hello\"" + "\n2. /command event PlayerJoinEvent");
						p.sendMessage("\nNow when a player joins it should run the command /say Hello");
						wp.sendMessage("\nThis command schedules a selected command to run when a specified event is called select a command with : \n/command configure \"<TheCommandYouWantToSelect>\""
								+ "\n/command event correct usage is : \n/command event <Event> list/help");*/
						wp.sendTutorial(msgs);
						break;
					}
					info("args[1] is not help");
					//If they have not selected a command via /command configure tell them to do /command configure "<Command>"
					if(args[1].equalsIgnoreCase("list")) {
						wp.sendMessage("Here is a list of supported events :");
						for(SupportedEvent e : SupportedEvent.values()) {
							p.sendMessage(e.toString());
						}
						//Tell them how to list all events
						wp.sendMessage(new Message("You can always show this list with /command event list or clicking here",new ClickEvent(Action.RUN_COMMAND, "/command event list"),new HoverEvent(
								HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create(/**/))));
						break;
					}else if(args[1].equalsIgnoreCase("clear")) {
						wp.sendMessage("Cleared all commands from : ");
						for(SupportedEvent e : SupportedEvent.values()) {
							Command.setCommands(e, new ArrayList<String>());
							p.sendMessage("Cleared " + Command.getCommands(e).size() + " commands from " + e.toString());
						}
					}
					try {
						SupportedEvent ev = SupportedEvent.valueOf(args[1]);
						if(args.length >= 3) {
							if(args[2].equalsIgnoreCase("list")) {
								Iterator<String> it = Command.getCommands(ev).iterator();
								int i = 0;
								wp.sendMessage(args[1] + " will run the following commands when called : ");
								for(String next;it.hasNext();i++) {
									next=it.next();
									p.sendMessage("(" + i + ")" + " " + next);
								}
								break;
							}else if(args[2].equalsIgnoreCase("clear")) {
								if(wp.getAction() == true) {
									wp.sendMessage("Guess what= THIS IS NOT DONE!");
									wp.setAction(false);
									break;
								}  
								wp.sendMessage("Are you sure you want to do this? all the commands you scheduled for the " + ev.toString() + " will be gone");
								wp.sendMessage(new Message("NO",new ClickEvent(Action.RUN_COMMAND,"/action confirm no"),
										new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPPE").create())));
								wp.sendMessage(new Message("YES",new ClickEvent(Action.RUN_COMMAND,"/action confirm yes"),
								new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPP").create())));
								/*if(wp.getConfirmed() == null) {
									wp.sendMessage(new Message("NO",new ClickEvent(Action.RUN_COMMAND,"/action confirm no"),
											new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPPE").create())));
									wp.sendMessage(new Message("YES",new ClickEvent(Action.RUN_COMMAND,"/action confirm yes"),
									new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPP").create())));
								}*/
								/*if(wp.getAction() == true) {
									Command.setCommands(ev, new ArrayList<String>());
									wp.sendMessage("Cleared " + Command.getCommands(ev).size() + " commands from " + ev.toString());
									wp.setAction(null);
								}else if(wp.getAction() == false) {
									wp.sendMessage("Ok!");
									wp.setAction(null);
								}else if(wp.getAction() == null) {
									wp.sendMessage(new Message("NO",new ClickEvent(Action.RUN_COMMAND,"/action confirm no"),
											new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPPE").create())));
									wp.sendMessage(new Message("YES",new ClickEvent(Action.RUN_COMMAND,"/action confirm yes"),
									new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPP").create())));
								}*/
								break;
							}
						}
						info("args[1] is not get");
						if(wp.getSelectedCommand() == null) {
							wp.sendMessage("Do /command configure \"<Command>\" first");
							break;
						}
						info("selected command is not null");
						if(Command.getCommands(ev).contains(wp.getSelectedCommand())) {
							Command.getCommands(ev).remove(wp.getSelectedCommand());
							wp.sendMessage(wp.getSelectedCommand() + " will no longer run when " + ev + " is called");
						}else {
							Command.getCommands(ev).add(wp.getSelectedCommand());
							wp.sendMessage(wp.getSelectedCommand() + " will run when " + ev + " is called");
						}
						Command.setCommands(ev, Command.getCommands(ev));
					
					}catch(IllegalArgumentException e) {
						wp.sendMessage("It seems we couldnt recognize " + args[1] + " do /command event help to see a list of recognized events");
						break;
					}
					//try { <-- I don't remember why i had this don't think i need it.
					/*
						Command.getCommands(SupportedEvent.PlayerJoinEvent).add(wp.getSelectedCommand());
						info("Here : " + Command.getCommands(SupportedEvent.PlayerJoinEvent));
						Command.setCommands(SupportedEvent.PlayerJoinEvent, Command.getCommands(SupportedEvent.PlayerJoinEvent));
						info("Here again : " + Command.getCommands(SupportedEvent.PlayerJoinEvent));
						wp.sendMessage(wp.getSelectedCommand() + " will run when " + args[1] + " is called");
						info("no exception catched");
						*/
					/*}catch(IllegalArgumentException e) {
						wp.sendMessage(args[1] + " is not a recognized event do /command event help for a list of events");
					}*/
					
					break;
				case "schedule":
					break;
				}
			}
			return true;
		/*
		 * This is very dangerous it would cause a loop each time it is run we will use it onPlayerCommandPreprocessEvent instead
		 * case "action":
			if(args.length >= 2) {
				switch(args[0]) {
				case "confirm":
					if(args[1].equalsIgnoreCase("yes")) {
						wp.setAction(true);
						Bukkit.dispatchCommand(p, wp.getCommand());
					}else if(args[1].equalsIgnoreCase("no")) {
						wp.setAction(false);
						Bukkit.dispatchCommand(p, wp.getCommand());
					}
					break;
				}
			}
			return true;*/
		case "tutorial":
			if(args.length >= 1) {
				switch(args[0]) {
				/*case "1":
					break;
				case "2":
					break;*/
				case "next":
					//WintapPlayer.PREVIOUS_MSG.put(p.getUniqueId().toString(), WintapPlayer.MESSAGES.get(p.getUniqueId().toString()));
					wp.setMessage(wp.getMessage()+1);
					//
					wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                ",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
					//
					wp.sendMessage("" + wp.getMessages().get(wp.getMessage()).getMessage() + "                                ");
					wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
					break;
				case "back":
					wp.setMessage(wp.getMessage()-1);
					//
					wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
					//
					wp.sendMessage("" + wp.getMessages().get(wp.getMessage()).getMessage() + "                                ");
					wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
					break;
				}
			}else {
				List<Message> msgs = new ArrayList<Message>();
				msgs.add(new Message("Msg1",ChatMessageType.CHAT));
				msgs.add(new Message("Msg2",ChatMessageType.CHAT));
				msgs.add(new Message("Msg3",ChatMessageType.CHAT));
				wp.sendTutorial(msgs);
			}
			return true;
		}
		return true;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		/*Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
			public void run(){
				    
			}
		}, 40L);*/
		//Command.executeCommands(e);
		Player p = e.getPlayer();
		String[] args = e.getClass().getName().split("\\."); //org.bukkit.event.player.PlayerCommandPreprocessEvent
		String name = args[4];
		info("The class would be : " + name);
		Iterator<String> it = Command.getCommands(SupportedEvent.valueOf(name)).iterator();
		while(it.hasNext()) {
			String next = it.next();
			info("Next one is : " + next);
			Bukkit.dispatchCommand(p, next);
		}
		/*
		 * Execute all the commands that are scheduled for the PlayerJoinEvent see MCGameMaker.Command.java
		 */
		//Command.executeCommands(SupportedEvent.PlayerJoinEvent,p);
		WintapPlayer wp = new WintapPlayer(p);
		List<Message> msgs = new ArrayList<Message>();
		msgs.add(new Message("H"));
		//wp.sendTutorial(null);
		//When a player joins ask them what they would like to do
		/*p.sendMessage(ChatColor.GOLD + "What would you like to do?");
		//The constructor HoverEvent is deprecated i don't know what to use instead
		wp.sendMessage(new Message(ChatColor.GREEN + "(A)" + ChatColor.WHITE + " Create a new mob",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mob create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create())));
		
		wp.sendMessage(new Message(ChatColor.GREEN + "(B)" + ChatColor.WHITE + " Create a new item",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/item create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create())));
		
		wp.sendMessage(new Message(ChatColor.GREEN + "(C)" + ChatColor.WHITE + " Create a new block",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/block create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create())));
		
		wp.sendMessage(new Message(ChatColor.GREEN + "(D)" + ChatColor.WHITE + " Configure a command",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/command configure help")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create())));
		
		wp.sendMessage(new Message(ChatColor.GREEN + "(E)" + ChatColor.WHITE + " I dont know help me!",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create())));*/
		/*clickableChat(p,ChatColor.GREEN + "(A)" + ChatColor.WHITE + " Create a new mob",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mc-gamemaker:mob create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create()));
		clickableChat(p,ChatColor.GREEN + "(B)" + ChatColor.WHITE + " Create a new item",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mc-gamemaker:item create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create()));
		clickableChat(p,ChatColor.GREEN + "(C)" + ChatColor.WHITE + " Create a new block",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mc-gamemaker:block create")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create()));
		clickableChat(p,ChatColor.GREEN + "(D)" + ChatColor.WHITE + " Configure a command",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mc-gamemaker:command configure help")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create()));
		clickableChat(p,ChatColor.GREEN + "(E)" + ChatColor.WHITE + " I dont know, help me!",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/mc-gamemaker:tutorial")
				,new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(ChatColor.WHITE).italic(true).create()));*/
	}
	
	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent e) {
		Command.executeCommands(e);
		Player p = e.getEntity();
		//Command.executeCommands(SupportedEvent.PlayerDeathEvent,p); 
	}
	
	@EventHandler
	public void onPlayerRespawnEvent(PlayerRespawnEvent e) {
		Command.executeCommands(e);
		Player p = e.getPlayer();
		//Command.executeCommands(SupportedEvent.PlayerRespawnEvent,p);
	}
	
	@EventHandler
	public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {
		Command.executeCommands(e);
		WintapPlayer p = new WintapPlayer(e.getPlayer());
		String cmd = e.getMessage().substring(1);
		String[] args = cmd.split(" ");
		if(e.getMessage().length() >= 18) {
			info("Look : " + e.getMessage().substring(1,18));
			if(e.getMessage().substring(1,18).equals("command configure")) {
				info("the command starts with command configure");
				String cmd2 = cmd.substring(18);
				int length = cmd2.length();
				if(cmd2.startsWith("\"") && cmd2.endsWith("\"")) {
					info("the command starts and ends with \"");
					cmd2 = cmd2.substring(1, length-1);
					p.setSelectedCommand(cmd2);
					p.sendMessage(cmd2 + " Selected");
					info("Hello yes the command that you selected is : " + cmd2);
				}
			}
		}
		if(cmd.equalsIgnoreCase("save")) {
			save();
			p.sendMessage("Saved");
		}else if(cmd.equalsIgnoreCase("load")) { 
			load();
			p.sendMessage("Load");
		}
	//case "action":
		if(args.length >= 3) {
			info("YES ASYNC AND ARGS ARE 3");
			switch(args[1]) {
			case "confirm":
				info("YES ASYNC AND confirm is 2");
				if(args[2].equalsIgnoreCase("yes")) {
					info("YES ASYNC AND yes is 3");
					p.setAction(true);
					Bukkit.dispatchCommand(p.getPlayer(), p.getCommand());
				}else if(args[2].equalsIgnoreCase("no")) {
					info("YES ASYNC AND no is 3");
					p.setAction(false);
					Bukkit.dispatchCommand(p.getPlayer(), p.getCommand());
				}
				break;
			}
		}
		//return true;
	}
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent e) {
		//Command.executeCommands(e);
		//We wont be using inventory's yet
		/*
		if(!(e.getWhoClicked() instanceof Player)) return;
		info("is player");
		ItemStack item = e.getCurrentItem();
		if(item == null) return;
		info("item is not null");
		//MagicStack item = new MagicStack(e.getCurrentItem());
		ItemMeta im = item.getItemMeta();
		Player p = (Player) e.getWhoClicked();
		org.bukkit.inventory.Inventory inv = e.getClickedInventory();
		//See MCGameMaker.inventory.Inventory.getOrder() and MCGameMaker.inventory.Inventory.newInventory(Type type)
		switch(new Inventory(inv).getOrder()) {
		case 0:
			info("order 0 clicked");
			e.setCancelled(true);
			break;
		case 1:
			info("order 1 clicked");
			e.setCancelled(true);
			break;
		case 2:
			info("order 2 clicked");
			e.setCancelled(true);
			break;
		case 3:
			info("order 3 clicked");
			e.setCancelled(true);
			break;
		case 4:
			info("order 4 clicked");
			e.setCancelled(true);
			break;
		case 5:
			info("order 5 clicked");
			e.setCancelled(true);
			break;
			default:
				info("unknow order clicked");
				break;
		}
		//If the item has CustomModelData
		if(im != null) {
			info("ItemMeta is not null");
			if(im.hasCustomModelData()) {
				info("has custom model data");
				int data = im.getCustomModelData();
			}
		}
	*/}
	
}
