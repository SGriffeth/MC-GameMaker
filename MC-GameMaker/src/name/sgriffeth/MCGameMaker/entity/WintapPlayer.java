package name.sgriffeth.MCGameMaker.entity;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import name.sgriffeth.MCGameMaker.DataHolder;
import name.sgriffeth.MCGameMaker.Main;
import name.sgriffeth.MCGameMaker.Message;
import name.sgriffeth.MCGameMaker.gui.GUI;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class WintapPlayer implements DataHolder {

	private Player player;
	
	public WintapPlayer(Player player) {
		this.player=player;
	}
	
	public org.bukkit.entity.Player getPlayer() {
		return player;
	}
	
	public void setPlayer(org.bukkit.entity.Player p) {
		player = p;
	}
	
	private final static HashMap<String,String> SELECTED_COMMAND = new HashMap<String,String>();
	private final static HashMap<String,GUI> SELECTED_GUI = new HashMap<String,GUI>();
	/*public final static HashMap<String,Message> PREVIOUS_MSG = new HashMap<String,Message>(); 
	public final static HashMap<String,Message> NEXT_MSG = new HashMap<String,Message>();*/
	private final static HashMap<String,List<Message>> MESSAGES = new HashMap<String,List<Message>>(); 
	private final static HashMap<String,Integer> CURRENT_MSG = new HashMap<String,Integer>();
	private final static HashMap<String,Boolean> CONFIRM_ACTION = new HashMap<String,Boolean>();
	//CURRENT_COMMAND represents the last command the player run
	private final static HashMap<String,String> CURRENT_COMMAND = new HashMap<String,String>();
	
	public String getSelectedCommand() {
		String id = player.getUniqueId().toString();
		return SELECTED_COMMAND.get(id);
	}
	
	public void setSelectedCommand(String cmd) {
		SELECTED_COMMAND.put(player.getUniqueId().toString(),cmd);
	}
	
	public List<Message> getMessages() {
		if(MESSAGES.get(player.getUniqueId().toString()) == null) return null;
		return MESSAGES.get(player.getUniqueId().toString());
	}
	
	public void setMessages(List<Message> msgs) {
		MESSAGES.put(player.getUniqueId().toString(), msgs);
	}
	
	public int getMessage() {
		if(CURRENT_MSG.get(player.getUniqueId().toString()) == null) return 0;
		return CURRENT_MSG.get(player.getUniqueId().toString());
	}
	
	public void setMessage(int msg) {
		if(getMessages().size()-1 >= msg && msg >= 0)
		CURRENT_MSG.put(player.getUniqueId().toString(), msg);
	}
	
	public String getCommand() {
		return CURRENT_COMMAND.get(player.getUniqueId().toString());
	}
	
	public void setCommand(String cmd) {
		CURRENT_COMMAND.put(player.getUniqueId().toString(), cmd);
	}
	
	public boolean getAction() {
		if(CONFIRM_ACTION.get(player.getUniqueId().toString()) == null) return false;
		return CONFIRM_ACTION.get(player.getUniqueId().toString());
	}
	
	public void setAction(boolean confirmed) {
		CONFIRM_ACTION.put(player.getUniqueId().toString(), confirmed);
	}
	
	public GUI getSelectedGUI() {
		return SELECTED_GUI.get(player.getUniqueId().toString());
	}
	
	public void setSelectedGUI(GUI gui) {
		SELECTED_GUI.put(player.getUniqueId().toString(), gui);
	}
	
	public void sendMessage(String msg) {
		player.sendMessage(Main.getFancyName() + msg);
	}
	
	public void sendList(List<String> args,String msg) {
		for(int count = 0;count < args.size();count++) {
			args.set(count, "(" + count + ")" + " " + args.get(count));
		}
		String elm = Main.getString(args, "\n");
		Main.info(elm + " is the string!");
		sendMessage(msg + "\n" + elm);
	}
	
	/*public void sendList(List<Object> args,String msg) {
		for(int count = 0;count < args.size();count++) {
			args.set(count, "(" + count + ")" + " " + args.get(count).toString());
		}
		String elm = Main.getString(args, "\n");
		Main.info(elm + " is the string!");
		sendMessage(msg + "\n" + elm);
	}*/
	
	/*public void sendMessage(String msg,ChatMessageType type) {
		player.spigot().sendMessage(type, TextComponent.fromLegacyText(msg));
	}
	
	public void sendMessage(String msg,ClickEvent action,HoverEvent action2) {
		TextComponent message = new TextComponent(msg);
		message.setBold(true);
		message.setClickEvent(action);
		message.setHoverEvent(action2);
		player.spigot().sendMessage(message);
	}*/
	
	public void sendMessage(Message msg) {
		if(msg.getType() != null && TextComponent.fromLegacyText(msg.getMessage()) != null)
		player.spigot().sendMessage(/*msg.getType(),*/ TextComponent.fromLegacyText(msg.getMessage()));
		if(msg.getTextComponent() != null)
		player.spigot().sendMessage(msg.getTextComponent());
	}
	
	public void sendTutorial(List<Message> msgs) {
		if(msgs.size() < 2) throw new IllegalArgumentException("The paramater msgs must be at least size 2 " + "but was " + msgs.size());
		MESSAGES.put(player.getUniqueId().toString(), msgs);
		CURRENT_MSG.put(player.getUniqueId().toString(), 0);
		/*PREVIOUS_MSG.put(player.getUniqueId().toString(), msgs.get(0));
		NEXT_MSG.put(player.getUniqueId().toString(), msgs.get(1));*/
		//
		/*sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                ",
		new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),
		new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));*/
		sendMessage(new Message(ChatColor.YELLOW + "-----------------------------------------------------\n" + ChatColor.BOLD + "" + ChatColor.RED + "                                Back                                ",
				new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial back"),
				new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
		//
		sendMessage("\n" + msgs.get(0).getMessage() + "                                ");
		//ggggggggggggggggggggggggggggggggggggggggggg 43
		//----------------------------------------------------- 53
		sendMessage(new Message(ChatColor.BOLD + "" + ChatColor.GREEN + "                                Next                                "
		+ ChatColor.YELLOW + "\n-----------------------------------------------------",new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/tutorial next"),
		new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create())));
		
		/*sendMessage(msgs.get(0).getMessage(), msgs.get(0).getType());
		sendMessage("Next page",new ClickEvent(ClickEvent.Action.RUN_COMMAND,""),//Just Creating clickable chat
		new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("").color(net.md_5.bungee.api.ChatColor.WHITE).italic(true).create()));*/
		
		/*Iterator<Message> it = msgs.iterator();
		while(it.hasNext()) {
			Message next = it.next();
			sendMessage(next.getMessage(),next.getType());
		}*/
	}
	
	public void openGUI(Inventory inv,boolean canEdit) {
		if(canEdit) {
			GUI.MODIFYING.put(player.getUniqueId().toString(), inv);
		}else {
			GUI.MODIFYING.put(player.getUniqueId().toString(), null);
		}
		player.openInventory(inv);
	}

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		createConfig("players.yml");
		File file = new File(Main.instance.getDataFolder(),"players.yml");
		YamlConfiguration ymlFile = YamlConfiguration.loadConfiguration(file);
		ymlFile.createSection("selectedcommand",SELECTED_COMMAND);
		try {
			ymlFile.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*ConfigurationSection sec = ymlFile.createSection("selectedcommand");
		for(Entry<String,String> entry : SELECTED_COMMAND.entrySet()) {
			sec.set(entry.getKey(), entry.getValue());
		}
		try {
			ymlFile.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		createConfig("players.yml");
		File file = new File(Main.instance.getDataFolder(),"players.yml");
		YamlConfiguration ymlFile = YamlConfiguration.loadConfiguration(file);
		ConfigurationSection sec = ymlFile.getConfigurationSection("selectedcommand");
		for(String key : sec.getKeys(true)) {
			SELECTED_COMMAND.put(key, sec.getString(key));
		}
		
	}

}
