package name.sgriffeth.MCGameMaker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFertilizeEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockShearEntityEvent;
import org.bukkit.event.block.CauldronLevelChangeEvent;
import org.bukkit.event.block.FluidLevelChangeEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.MoistureChangeEvent;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.block.SpongeAbsorbEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;
import org.bukkit.event.entity.BatToggleSleepEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.entity.EntityEnterBlockEvent;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;
import org.bukkit.event.entity.EntityExhaustionEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.EntityPlaceEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityPoseChangeEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntitySpellCastEvent;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.entity.EntityToggleSwimEvent;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FireworkExplodeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.HorseJumpEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PigZombieAngerEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.entity.SpawnerSpawnEvent;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.event.entity.VillagerCareerChangeEvent;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;
import org.bukkit.event.inventory.BrewingStandFuelEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.event.inventory.TradeSelectEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChannelEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerItemMendEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerLocaleChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerRiptideEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTakeLecternBookEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.TimeSkipEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.event.entity.EntityDismountEvent;
import org.spigotmc.event.entity.EntityMountEvent;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

import name.sgriffeth.MCGameMaker.Command.SupportedEvent;
import name.sgriffeth.MCGameMaker.entity.WintapPlayer;
/*import name.sgriffeth.MCGameMaker.inventory.Inventory;
import name.sgriffeth.MCGameMaker.inventory.MagicStack;
import name.sgriffeth.MCGameMaker.inventory.Inventory.Type;*/  
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ClickEvent.Action;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

public class Main/*<PiglinBarterEvent, PlayerAnimationEvent>*/ extends JavaPlugin implements Listener {
	
	public static Plugin instance;
	
	private static String NAME=null;
	
	private static DataManager data;
	
	@Override
	public void onEnable() {
		//new Main<Integer,Double>();
		getServer().getPluginManager().registerEvents(this, this);
		instance=this;
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
		if(!Command.getCommands().isEmpty()) {
			info("The hash");
			for(Map.Entry<SupportedEvent,List<String>> entry : Command.getCommands().entrySet()) {
				info("Saving commands : " + "key : " + entry.getKey().toString() + ", value : " + entry.getValue().toString());
				Iterator<String> it = entry.getValue().iterator();
				String commands = "";
				if(it.hasNext()) {
					commands = it.next();
				}
				while(it.hasNext()) {
					//String next = it.next();
					commands = commands + "," + it.next();
					/*if(commands != "") {
						commands=commands + "," + next;
					}else {
						commands=next;
						//"string".split(","); returns {"string"}?
					}*/
				}
				info("String is : " + commands);
				data.getConfig().set("commands." + entry.getKey().toString(), commands);
				data.saveConfig();
			}
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
				Command.getCommands().put(SupportedEvent.valueOf(key), vb);
				
			});
		}
	}
	
	@Deprecated
	public static String getString(String[] args) {
		String args2 = "";
		for(String arg : args) {
			args2 = args2 + " " + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	@Deprecated
	public static String getString(List<String> args) {
		String args2 = "";
		for(String arg : args) {
			args2 = args2 + " " + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	public static String getString(String[] args,String regex) {
		String args2 = "";
		for(String arg : args) {
			args2 = args2 + regex + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	public static String getString(List<String> args,String regex) {
		String args2 = "";
		for(String arg : args) {
			args2 = args2 + regex + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	/*public static String getString(Object[] args,String regex) {
		String args2 = "";
		for(Object arg : args) {
			arg = arg.toString();
			args2 = args2 + regex + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}
	
	public static String getString(List<Object> args,String regex) {
		String args2 = "";
		for(Object arg : args) {
			arg = arg.toString();
			args2 = args2 + regex + arg;
		}
		info("Created a string from a array : " + args2);
		return args2;
	}*/
	
	public static String getFancyName() {
		return NAME;
	}
	
	//Tired of writing Bukkit.getLogger().info()
	public static void info(String str) {
		Bukkit.getLogger().info(str);
	}
	
	@Override
	public boolean onCommand(CommandSender sender,org.bukkit.command.Command command,String label,String[] args) {
		//TODO Allow consoles to run commands and make events cancelable, and make it possible to delay Events 
		if(!(sender instanceof Player)) return true;
		Player p = (Player) sender;
		WintapPlayer wp = new WintapPlayer(p);
		//info("Command that player is doing is : " + command.getName());
		/*String args2 = "";
		for(String arg : args) {
			args2 = args2 + " " + arg;
		}
		info(args2 + " is the arguments yay");*/
		String args2 = getString(args," ");
		/*info(label + " is the command YAYAYY");
		info(label + args2 + " is the args + the command AYy");*/
		//This is a way of keeping track of the last command the player run
		wp.setCommand(label + args2);
		name.sgriffeth.MCGameMaker.Command cmd = new name.sgriffeth.MCGameMaker.Command(label);
		//name.sgriffeth.MCGameMaker.inventory.Inventory inv = new name.sgriffeth.MCGameMaker.inventory.Inventory(Bukkit.createInventory(null, 54, ""));
		switch(label.toLowerCase()) {
		/*case "mob":
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
			return true;*/
		case "command":
			//info("command is being run");
			//The amount of arguments must be at least 2 /command configure "<Command>"
			if(args.length >= 2) {
				//info("args are at least 2");
				switch(args[0]) {
				/*
				 * The first argument is configure meaning the player is selecting a command
				 */
					// /command configure selects a command which can later be configured and scheduled
				case "configure":
					if(args[1].equalsIgnoreCase("help")){
						wp.sendMessage("This command selects a command which you can later schedule with /command event or /command schedule"
								+ "\n/command configure correct usage is : /command configure \"<TheCommandYouWantToSelect>\"");
						break;
					}else if(args[1].equalsIgnoreCase("null")) {
						wp.setSelectedCommand(null);
						wp.sendMessage("Set the selected command to null do /command event");
						break;
					}
					//See onPlayerCommandPreprocessEvent the rest of the command is executed there
					break;
					// /command event allows you to schedule a selected command to run whenever a event is called
				case "event":
					// /command event help ->
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
						
						wp.sendTutorial(msgs);
						break;
					}
					info("args[1] is not help");
					// /command event list
					if(args[1].equalsIgnoreCase("list")) {
						//This command gives them a list of events they can use
						wp.sendMessage("Here is a list of supported events :");
						for(SupportedEvent e : SupportedEvent.values()) {
							p.sendMessage(e.toString());
						}
						//Remind them how to list events
						wp.sendMessage(new Message("You can always show this list with /command event list or clicking here",new ClickEvent(Action.RUN_COMMAND, "/command event list"),new HoverEvent(
								HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create(/**/))));
						break;   
					}
					// /command event clear
					if(args[1].equalsIgnoreCase("clear")) {
						if(wp.getAction() == true) {
							//Clear all the commands from all the events
							List<String> msgs = new ArrayList<String>();
							for(SupportedEvent e : SupportedEvent.values()) {
								if(Command.getCommands().get(e) == null) {
									msgs.add(e.toString() + " has no commands set");
									continue;
								}
								msgs.add(e.toString() + "(" + Command.getCommands().get(e).size() + ")");
								/*HashMap<SupportedEvent,List<String>> m = new HashMap<SupportedEvent,List<String>>();
								m.put(e, new ArrayList<String>());*/
								Command.setCommands(e,new ArrayList<String>());
							}
							wp.sendList(msgs, "Cleared commands from :\n");
							wp.setAction(false);
						}else {
							wp.sendMessage("Are you sure you want to do this? all the commands you scheduled for any event " + " will be gone");
							wp.sendMessage(new Message("NO",new ClickEvent(Action.RUN_COMMAND,"/action confirm no"),
									new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPPE").create())));
							wp.sendMessage(new Message("YES",new ClickEvent(Action.RUN_COMMAND,"/action confirm yes"),
							new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPP").create())));
						}
						break;
					}
					try {
						SupportedEvent ev = SupportedEvent.valueOf(args[1]);
						if(args.length >= 3) {
							if(args[2].equalsIgnoreCase("list")) {
								if(Command.getCommands().get(ev) != null) {
									Iterator<String> it = Command.getCommands().get(ev).iterator(); 
									int i = 0;
									wp.sendMessage(args[1] + " will run the following commands when called : ");
									for(String next;it.hasNext();i++) {
										next=it.next();
										p.sendMessage("(" + i + ")" + " " + next);
									}
								}
								break;
							}else if(args[2].equalsIgnoreCase("clear")) {
								if(wp.getAction() == true) {
									if(Command.getCommands().get(ev) == null) {
										wp.sendMessage("There are no tasks scheduled for the PlayerJoinEvent");
										break;
									}
									int count = Command.getCommands().size();
									Command.setCommands(ev, new ArrayList<String>());
									/*for(String e : Command.getCommands().get(ev)) {
										
									}*/
									wp.sendMessage("Cleared " + count + " tasks from " + ev.toString());
									wp.setAction(false);
									break;
								}else {
									wp.sendMessage("Are you sure you want to do this? all the commands you scheduled for the " + ev.toString() + " will be gone");
									wp.sendMessage(new Message("NO",new ClickEvent(Action.RUN_COMMAND,"/action confirm no"),
											new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPPE").create())));
									wp.sendMessage(new Message("YES",new ClickEvent(Action.RUN_COMMAND,"/action confirm yes"),
									new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("WASSSUPPP").create())));
								}
								break;
							}
						}
						info("args[1] is not get");
						if(wp.getSelectedCommand() == null) {
							wp.sendMessage("Do /command configure \"<Command>\" first");
							break;
						}
						info("selected command is not null");
						List<String> cmds = Command.getCommands().get(ev);
						/*if(cmds == null) {
							Command.setCommands(ev, new ArrayList<String>());
							cmds = Command.getCommands().get(ev);
							cmds.add(wp.getSelectedCommand());
							wp.sendMessage(wp.getSelectedCommand() + " will run when " + ev + " is called");
						}*/
						if(cmds == null) {
							List<String> list = new ArrayList<String>();
							list.add(wp.getSelectedCommand());
							Command.setCommands(ev, list);
							wp.sendMessage(wp.getSelectedCommand() + " will run when " + ev + " is called");
							break;
							/*cmds = Command.getCommands().get(ev);
							cmds.add(wp.getSelectedCommand());*/
						}
						if(cmds/*Command.getCommands().get(ev)*/.contains(wp.getSelectedCommand())) {
							/*List<String> commands = Command.getCommands().get(ev);
							commands.remove(wp.getSelectedCommand());
							HashMap<SupportedEvent,List<String>> map = new HashMap<SupportedEvent,List<String>>();
							map.put(ev, commands);
							Command.setCommands(map);*/
							//Command.getCommands(ev).remove(wp.getSelectedCommand());
							cmds.remove(wp.getSelectedCommand());
							wp.sendMessage(wp.getSelectedCommand() + " will no longer run when " + ev + " is called");
						}else {
							/*List<String> commands = Command.getCommands().get(ev);
							commands.add(wp.getSelectedCommand());
							HashMap<SupportedEvent,List<String>> map = new HashMap<SupportedEvent,List<String>>();
							map.put(ev, commands);
							Command.setCommands(map);*/
							//Command.getCommands(ev).add(wp.getSelectedCommand());
							cmds.add(wp.getSelectedCommand());
							wp.sendMessage(wp.getSelectedCommand() + " will run when " + ev + " is called");
						}
						Command.setCommands(ev, cmds);
					
					}catch(IllegalArgumentException e) {
						wp.sendMessage("It seems we couldnt recognize " + args[1] + " do /command event help to see a list of recognized events");
						break;
					}
					return true;
				case "schedule":
					if(args.length >= 2) {
						if(args[1].equalsIgnoreCase("help")) {
							List<Message> msgs = new ArrayList<Message>();
							msgs.add(new Message("Hey"));
							msgs.add(new Message("This is not done sorry"));
							wp.sendTutorial(msgs);
							
						}else if(args[1].equalsIgnoreCase("list")) {
							List<String> cmds = new ArrayList<String>();
							Iterator<Command> it = Command.getScheduled().iterator();
							while(it.hasNext()) {
								String next = it.next().toString();
								cmds.add(next);
							}
							wp.sendList(cmds, "Here is a list of scheduled commands :");
							//wp.sendList(Command.getScheduled().forEach(null);, "");
						}
						if(args.length >= 4) { 
							try {
								long delay = Long.valueOf(args[1]);
								long period = Long.valueOf(args[2]);
								//Command selected = new Command(wp.getSelectedCommand(),delay,period,false);
								Iterator<Command> it = Command.getScheduled().iterator();
								if(args[3].equalsIgnoreCase("run")) {
									new Command(wp.getSelectedCommand()).runTaskTimer(instance, delay, period);
									wp.sendMessage(wp.getSelectedCommand() + " is scheduled with " + delay + " delay " + " and a " + period + " period");
								}else if(args[3].equalsIgnoreCase("cancel")) {
									Command next = null;
									while(it.hasNext()) {
										next = it.next();
										if(next.getDelay() == delay && next.getPeriod() == period) {
											wp.sendMessage("Canceled the task for " + next + "" + delay + "" + period);
											break;
										}
									}
									next.cancel();
								}
								/*Command cmd1 = new Command(wp.getSelectedCommand());
								List<Command> scheduled = Command.getScheduled();*/
								
								/*Iterator<Command> it = scheduled.iterator();
								while(it.hasNext()) {
									Command next = it.next();
									if(next.getDelay() == delay && next.getPeriod() == period) {
										next.cancel();
										scheduled.remove(next);
										Command.setScheduled(scheduled);
										break;
									}
									//if(next.getCommand())
								}
								cmd1.setSchedule(delay, period);*/
								//cmd1.runTaskTimer(main, delay, period);
								//new CommandRunner(cmd1.getCommand()).runTaskTimer(this, delay, period);
							}catch(java.lang.NumberFormatException e) {
								wp.sendMessage("Oh oh thats not a long!");
							}
						}
						return true;
					}
					//break;
				}
				return true;
			}
			List<Message> msgs = new ArrayList<Message>();
			msgs.add(new Message("Most important command :O"));
			msgs.add(new Message("Sorry, im not done with it"));
			wp.sendTutorial(msgs);
			return true;
			// /tutorial sends players tutorials
		case "tutorial":
			if(args.length >= 1) {
				switch(args[0]) {
					// /command next goes forward one message in the tutorial
				case "next":
					wp.setMessage(wp.getMessage()+1);
					//
					/*wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                ",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));*/
					wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                ",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").create())));
					//
					wp.sendMessage("" + wp.getMessages().get(wp.getMessage()).getMessage() + "                                ");
					/*wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));*/
					wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
							+ ChatColor.YELLOW + "\n-----------------------------------------------------",
							new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").create())));
					break;
					// /command next goes forward one message in the tutorial
				case "back":
					wp.setMessage(wp.getMessage()-1);
					//
					/*wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));*/
					wp.sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").create())));
					//
					wp.sendMessage("" + wp.getMessages().get(wp.getMessage()).getMessage() + "                                ");
					/*wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(
					net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));*/
					wp.sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
					+ ChatColor.YELLOW + "\n-----------------------------------------------------",
					new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").create())));
					break;
				}
			}else { 
				// /tutorial sends the player instructions on how to use this plugin
				List<Message> msgs1 = new ArrayList<Message>();
				msgs1.add(new Message("Welcome, if you are reading this its because you want to learn how to use " + getFancyName() + " well where to start...",ChatMessageType.CHAT));
				msgs1.add(new Message("Msg2",ChatMessageType.CHAT));
				msgs1.add(new Message("Msg3",ChatMessageType.CHAT));
				wp.sendTutorial(msgs1);
			}
			return true;
		case "save":
			save();
			wp.sendMessage("saved data");
			return true;
		case "load":
			load();
			wp.sendMessage("loaded data");
			return true;
		}
		return true;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String[] args = e.getClass().getName().split("\\."); //org.bukkit.event.player.PlayerCommandPreprocessEvent
		String name = args[4];
		info("The class would be : " + name);
		if(Command.getCommands().get(SupportedEvent.valueOf(name)) != null) {
			Iterator<String> it = Command.getCommands().get(SupportedEvent.valueOf(name)).iterator();
			while(it.hasNext()) {
				String next = it.next();
				info("Next one is : " + next);
				Bukkit.dispatchCommand(p, next);
			}
		}
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
	
	/*@EventHandler
	public void onHoverEvent(HoverEvent e) {
		
	}
	
	@EventHandler
	public void onClickEvent(ClickEvent e) {
		
	}*/
	
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
		// Checking if the command is as long as /command configure
		if(e.getMessage().length() >= 18) {
			info("Look : " + e.getMessage().substring(1,18));
			// Since the length is 18 I can check if the command starts with command configure
			if(e.getMessage().substring(1,18).equals("command configure")) {
				info("the command starts with command configure");
				String cmd2 = cmd.substring(18);
				int length = cmd2.length();
				// the player is running /command configure with two apostrofe's something like this : /command configure "Starts and ends with " <- "
				if(cmd2.startsWith("\"") && cmd2.endsWith("\"")) {
					info("the command starts and ends with \"");
					// Setting cmd2 to the String in between the two apostrofe's in this example that string is : Starts and ends with " <- 
					cmd2 = cmd2.substring(1, length-1);
					p.setSelectedCommand(cmd2);
					// Now the player's selected command is : Starts and ends with " <- 
					p.sendMessage(cmd2 + " Selected");
					info("Hello yes the command that you selected is : " + cmd2);
				}
			}
		}
		//This saves all the plugins data in MC-GameMaker/data.yml
		if(cmd.equalsIgnoreCase("save")) {
			save();
			p.sendMessage("Saved");
		}//This loads all the plugins data from MC-GameMaker/data.yml
		else if(cmd.equalsIgnoreCase("load")) { 
			load();
			p.sendMessage("Load");
		}
		info("DELETE ME PLS");
		//if(cmd.equalsIgnoreCase("action")) {
			info("DELTE me");
			if(args.length >= 3) {
				info("YES ASYNC AND ARGS ARE 3");
				switch(args[1]) {
				case "confirm":
					info("YES ASYNC AND confirm is 2");
					if(args[2].equalsIgnoreCase("yes")) {
						info("YES ASYNC AND yes is 3");
						p.setAction(true);
						if(p.getCommand() != null)
						Bukkit.dispatchCommand(p.getPlayer(), p.getCommand());
						p.sendMessage("Ok! confirmed");
					}else if(args[2].equalsIgnoreCase("no")) {
						info("YES ASYNC AND no is 3");
						p.setAction(false);
						//Bukkit.dispatchCommand(p.getPlayer(), p.getCommand());
						p.sendMessage("Ok!");
					}
					break;
				}
			}
		}
	//}
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent e) {
		Command.executeCommands(e);
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
	
	/*@EventHandler
	public void onAsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent e) {
		Command.executeCommands(e);
	}
	
	@EventHandler
	public void onBlockBurnEvent(BlockBurnEvent e) {
		Command.executeCommands(e);
	}
	
	@EventHandler
	public void onBlockCanBuildEvent(BlockCanBuildEvent e) {
		Command.executeCommands(e);
	}
	
	@EventHandler
	public void onBlockCookEvent(BlockCookEvent e) {
		Command.executeCommands(e);
	}
	
	@EventHandler
	public void onBlockDamageEvent(BlockDamageEvent e) {
		
	}
	
	@EventHandler
	public void onBlockDispenseEvent(BlockDispenseEvent e) {
		Command.executeCommands(e);
	}
	
	@EventHandler
	public void onBlockDropItemEvent(BlockDropItemEvent e) {
		
	}
	
	@EventHandler
	public void onBlockExpEvent(BlockExpEvent e) {
		
	}
	
	@EventHandler
	public void onBlockExplodeEvent(BlockExplodeEvent e) {
		
	}
	
	@EventHandler
	public void onBlockFadeEvent(BlockFadeEvent e) {
		
	}*/
	


@EventHandler public void AsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent e) {Command.executeCommands(e);}

//@EventHandler public void (BlockEvent e) {Command.executeCommands(e);}

@EventHandler public void BlockBurnEvent(BlockBurnEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockCanBuildEvent(BlockCanBuildEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockCookEvent(BlockCookEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDamageEvent(BlockDamageEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDispenseEvent(BlockDispenseEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDropItemEvent(BlockDropItemEvent e) {Command.executeCommands(e);}

@ParentEvent(isAbstract = false)
@EventHandler public void BlockExpEvent(BlockExpEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.BlockExpEvent)
@EventHandler public void BlockBreakEvent(BlockBreakEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.BlockExpEvent)
@EventHandler public void BlockBreakEvent(FurnaceExtractEvent e) {Command.executeCommands(e);}

@EventHandler public void BlockExplodeEvent(BlockExplodeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFadeEvent(BlockFadeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFertilizeEvent(BlockFertilizeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFromToEvent(BlockFromToEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockGrowEvent(BlockGrowEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockIgniteEvent(BlockIgniteEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockPhysicsEvent(BlockPhysicsEvent e) {Command.executeCommands(e);}
//@EventHandler public void BlockPistonEvent(BlockPistonEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void BlockPlaceEvent(BlockPlaceEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockRedstoneEvent(BlockRedstoneEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockShearEntityEvent(BlockShearEntityEvent e) {Command.executeCommands(e);}
//@EventHandler public void BrewEvent(BrewEvent e) {Command.executeCommands(e);}
@EventHandler public void BrewingStandFuelEvent(BrewingStandFuelEvent e) {Command.executeCommands(e);}
@EventHandler public void CauldronLevelChangeEvent(CauldronLevelChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void FluidLevelChangeEvent(FluidLevelChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void FurnaceBurnEvent(FurnaceBurnEvent e) {Command.executeCommands(e);}
@EventHandler public void LeavesDecayEvent(LeavesDecayEvent e) {Command.executeCommands(e);}
@EventHandler public void MoistureChangeEvent(MoistureChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void NotePlayEvent(NotePlayEvent e) {Command.executeCommands(e);}
@EventHandler public void SignChangeEvent(SignChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void SpongeAbsorbEvent(SpongeAbsorbEvent e) {Command.executeCommands(e);}

//TODO @EventHandler public void EntityEvent(EntityEvent e) {Command.executeCommands(e);}

@EventHandler public void AreaEffectCloudApplyEvent(AreaEffectCloudApplyEvent e) {Command.executeCommands(e);}
@EventHandler public void ArrowBodyCountChangeEvent(ArrowBodyCountChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void BatToggleSleepEvent(BatToggleSleepEvent e) {Command.executeCommands(e);}
@EventHandler public void CreeperPowerEvent(CreeperPowerEvent e) {Command.executeCommands(e);}
@EventHandler public void EnderDragonChangePhaseEvent(EnderDragonChangePhaseEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityAirChangeEvent(EntityAirChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityBreedEvent(EntityBreedEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityChangeBlockEvent(EntityChangeBlockEvent e) {Command.executeCommands(e);}

@ParentEvent(isAbstract = false)
@EventHandler public void EntityCombustEvent(EntityCombustEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntityCombustEvent)
@EventHandler public void EntityCombustByEntityEvent(EntityCombustByEntityEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntityCombustEvent)
@EventHandler public void EntityCombustByBlockEvent(EntityCombustByBlockEvent e) {Command.executeCommands(e);}

//TODO @EventHandler public void EntityCreatePortalEvent(EntityCreatePortalEvent e) {Command.executeCommands(e);} abstract

@ParentEvent(isAbstract = false)
@EventHandler public void EntityDamageEvent(EntityDamageEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntityDamageEvent)
@EventHandler public void EntityDamagebyBlockEvent(EntityDamageByBlockEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntityDamageEvent)
@EventHandler public void EntityDamageByEntityEvent(EntityDamageByEntityEvent e) {Command.executeCommands(e);}

@EventHandler public void EntityDeathEvent(EntityDeathEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityDismountEvent(EntityDismountEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityDropItemEvent(EntityDropItemEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityEnterBlockEvent(EntityEnterBlockEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityEnterLoveModeEvent(EntityEnterLoveModeEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityExhaustionEvent(EntityExhaustionEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityExplodeEvent(EntityExplodeEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityInteractEvent(EntityInteractEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityMountEvent(EntityMountEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityPickupItemEvent(EntityPickupItemEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityPlaceEvent(EntityPlaceEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityPortalEnterEvent(EntityPortalEnterEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityPoseChangeEvent(EntityPoseChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityPotionEffectEvent(EntityPotionEffectEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityRegainHealthEvent(EntityRegainHealthEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityResurrectEvent(EntityResurrectEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityShootBowEvent(EntityShootBowEvent e) {Command.executeCommands(e);}

@ParentEvent(isAbstract = false)
@EventHandler public void EntitySpawnEvent(EntitySpawnEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntitySpawnEvent)
@EventHandler public void CreatureSpawnEvent(CreatureSpawnEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntitySpawnEvent)
@EventHandler public void ItemSpawnEvent(ItemSpawnEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntitySpawnEvent)
@EventHandler public void ProjectileLaunchEvent(ProjectileLaunchEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.EntitySpawnEvent)
@EventHandler public void SpawnerSpawnEvent(SpawnerSpawnEvent e) {Command.executeCommands(e);}

@EventHandler public void EntitySpellCastEvent(EntitySpellCastEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityTameEvent(EntityTameEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityTargetEvent(EntityTargetEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityTeleportEvent(EntityTeleportEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityToggleGlideEvent(EntityToggleGlideEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityToggleSwimEvent(EntityToggleSwimEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityTransformEvent(EntityTransformEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityUnleashEvent(EntityUnleashEvent e) {Command.executeCommands(e);}
@EventHandler public void ExplosionPrimeEvent(ExplosionPrimeEvent e) {Command.executeCommands(e);}
@EventHandler public void FireworkExplodeEvent(FireworkExplodeEvent e) {Command.executeCommands(e);}
@EventHandler public void FoodLevelChangeEvent(FoodLevelChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void HorseJumpEvent(HorseJumpEvent e) {Command.executeCommands(e);}
@EventHandler public void ItemDespawnEvent(ItemDespawnEvent e) {Command.executeCommands(e);}
@EventHandler public void ItemMergeEvent(ItemMergeEvent e) {Command.executeCommands(e);}
//TODO @EventHandler public void PiglinBarterEvent(PiglinBarterEvent e) {Command.executeCommands((e));} figure out why this doesnt work
@EventHandler public void PigZombieAngerEvent(PigZombieAngerEvent e) {Command.executeCommands(e);}
@EventHandler public void ProjectileHitEvent(ProjectileHitEvent e) {Command.executeCommands(e);}
@EventHandler public void SheepDyeWoolEvent(SheepDyeWoolEvent e) {Command.executeCommands(e);}
@EventHandler public void SheepRegrowWoolEvent(SheepRegrowWoolEvent e) {Command.executeCommands(e);}
@EventHandler public void SlimeSplitEvent(SlimeSplitEvent e) {Command.executeCommands(e);}
@EventHandler public void StriderTemperatureChangeEvent(StriderTemperatureChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerAcquireTradeEvent(VillagerAcquireTradeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerCareerChangeEvent(VillagerCareerChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerReplenishTradeEvent(VillagerReplenishTradeEvent e) {Command.executeCommands(e);}

//TODO @EventHandler public void HangingEvent(HangingEvent e) {Command.executeCommands(e);} (abstract)
//TODO @EventHandler public void BlockEvent(BlockEvent e) {} abstract
@EventHandler public void InventoryEvent(InventoryEvent e) {Command.executeCommands(e);}
@EventHandler public void EnchantItemEvent(EnchantItemEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryCloseEvent(InventoryCloseEvent e) {Command.executeCommands(e);}

@ParentEvent(isAbstract = true)
@EventHandler public void InventoryInteractEvent(InventoryInteractEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.InventoryInteractEvent)
@EventHandler public void InventoryClickEvent(InventoryClickEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.InventoryInteractEvent)
@EventHandler public void InventoryDragEvent(InventoryDragEvent e) {Command.executeCommands(e);}

@ChildEvent(parent = Command.SupportedEvent.InventoryInteractEvent)
@EventHandler public void TradeSelectEvent(TradeSelectEvent e) {Command.executeCommands(e);}

@EventHandler public void InventoryOpenEvent(InventoryOpenEvent e) {Command.executeCommands(e);}

@EventHandler public void PrepareAnvilEvent(PrepareAnvilEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareItemCraftEvent(PrepareItemCraftEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareItemEnchantEvent(PrepareItemEnchantEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareSmithingEvent(PrepareSmithingEvent e) {Command.executeCommands(e);}

@EventHandler public void InventoryMoveItemEvent(InventoryMoveItemEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryPickupItemEvent(InventoryPickupItemEvent e) {Command.executeCommands(e);}


//@EventHandler public void PlayerEvent(PlayerEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void AsyncPlayerChatEvent(AsyncPlayerChatEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent e) {Command.executeCommands(e);}
//@EventHandler public void PlayerAnimationEvent(PlayerAnimationEvent e) {Command.executeCommands((PlayerEvent) e);}
@EventHandler public void PlayerBedEnterEvent(PlayerBedEnterEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBedLeaveEvent(PlayerBedLeaveEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBucketEmptyEvent(PlayerBucketEmptyEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBucketFillEvent(PlayerBucketFillEvent e) {Command.executeCommands(e);}
//TODO @EventHandler public void PlayerBucketEvent(PlayerBucketEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void PlayerChangedMainHandEvent(PlayerChangedMainHandEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerChangedWorldEvent(PlayerChangedWorldEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerChannelEvent(PlayerChannelEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerChatEvent(PlayerChatEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerChatTabCompleteEvent(PlayerChatTabCompleteEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerCommandSendEvent(PlayerCommandSendEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerDropItemEvent(PlayerDropItemEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerEditBookEvent(PlayerEditBookEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerEggThrowEvent(PlayerEggThrowEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerExpChangeEvent(PlayerExpChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerFishEvent(PlayerFishEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerGameModeChangeEvent(PlayerGameModeChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerHarvestBlockEvent(PlayerHarvestBlockEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerInteractEntityEvent(PlayerInteractEntityEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerInteractEvent(PlayerInteractEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerItemBreakEvent(PlayerItemBreakEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerItemConsumeEvent(PlayerItemConsumeEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerItemDamageEvent(PlayerItemDamageEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerItemHeldEvent(PlayerItemHeldEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerItemMendEvent(PlayerItemMendEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerJoinEvent(PlayerJoinEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerKickEvent(PlayerKickEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerLevelChangeEvent(PlayerLevelChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerLocaleChangeEvent(PlayerLocaleChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerLoginEvent(PlayerLoginEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerMoveEvent(PlayerMoveEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerPickupItemEvent(PlayerPickupItemEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerQuitEvent(PlayerQuitEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerResourcePackStatusEvent(PlayerResourcePackStatusEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerRespawnEvent(PlayerRespawnEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerRiptideEvent(PlayerRiptideEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerShearEntityEvent(PlayerShearEntityEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerSpawnLocationEvent(PlayerSpawnLocationEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerStatisticIncrementEvent(PlayerStatisticIncrementEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerTakeLecternBookEvent(PlayerTakeLecternBookEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerToggleFlightEvent(PlayerToggleFlightEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerToggleSneakEvent(PlayerToggleSneakEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerToggleSprintEvent(PlayerToggleSprintEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerVelocityEvent(PlayerVelocityEvent e) {Command.executeCommands(e);}

@EventHandler public void PlayerLeashEntityEvent(PlayerLeashEntityEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerPreLoginEvent(PlayerPreLoginEvent e) {Command.executeCommands(e);}


//@EventHandler public void ServerEvent(ServerEvent e) {Command.executeCommands(e);}
@EventHandler public void BroadcastMessageEvent(BroadcastMessageEvent e) {Command.executeCommands(e);}
@EventHandler public void MapInitializeEvent(MapInitializeEvent e) {Command.executeCommands(e);}
//@EventHandler public void PluginEvent(PluginEvent e) {Command.executeCommands(e);}
@EventHandler public void ServerCommandEvent(ServerCommandEvent e) {Command.executeCommands(e);}
@EventHandler public void ServerListPingEvent(ServerListPingEvent e) {Command.executeCommands(e);}
@EventHandler public void ServerLoadEvent(ServerLoadEvent e) {Command.executeCommands(e);}
//@EventHandler public void ServiceEvent(ServiceEvent e) {Command.executeCommands(e);}

@EventHandler public void TabCompleteEvent(TabCompleteEvent e) {Command.executeCommands(e);}


//@EventHandler public void VehicleEvent(VehicleEvent e) {Command.executeCommands(e);}

//TODO @EventHandler public void VehicleCollisionEvent(VehicleCollisionEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void VehicleCreateEvent(VehicleCreateEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleDamageEvent(VehicleDamageEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleDestroyEvent(VehicleDestroyEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleEnterEvent(VehicleEnterEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleExitEvent(VehicleExitEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleMoveEvent(VehicleMoveEvent e) {Command.executeCommands(e);}
@EventHandler public void VehicleUpdateEvent(VehicleUpdateEvent e) {Command.executeCommands(e);}

//@EventHandler public void WeatherEvent(WeatherEvent e) {Command.executeCommands(e);}

@EventHandler public void LightningStrikeEvent(LightningStrikeEvent e) {Command.executeCommands(e);}
@EventHandler public void ThunderChangeEvent(ThunderChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void WeatherChangeEvent(WeatherChangeEvent e) {Command.executeCommands(e);}

//@EventHandler public void WorldEvent(WorldEvent e) {Command.executeCommands(e);}
//TODO @EventHandler public void ChunkEvent(ChunkEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void LootGenerateEvent(LootGenerateEvent e) {Command.executeCommands(e);} // not this one
@EventHandler public void PortalCreateEvent(PortalCreateEvent e) {Command.executeCommands(e);} // not this one
//TODO @EventHandler public void RaidEvent(RaidEvent e) {Command.executeCommands(e);} abstract
@EventHandler public void SpawnChangeEvent(SpawnChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void StructureGrowEvent(StructureGrowEvent e) {Command.executeCommands(e);}
@EventHandler public void TimeSkipEvent(TimeSkipEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldInitEvent(WorldInitEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldLoadEvent(WorldLoadEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldSaveEvent(WorldSaveEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldUnloadEvent(WorldUnloadEvent e) {Command.executeCommands(e);}

//org.bukkit.event.world.WorldEvent
}
