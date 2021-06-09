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
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
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
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityCombustEvent;
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
import org.bukkit.event.entity.PigZombieAngerEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.event.entity.VillagerCareerChangeEvent;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.BrewingStandFuelEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
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
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerBucketFishEvent;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
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
import org.bukkit.event.player.PlayerRegisterChannelEvent;
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
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.raid.RaidFinishEvent;
import org.bukkit.event.raid.RaidSpawnWaveEvent;
import org.bukkit.event.raid.RaidStopEvent;
import org.bukkit.event.raid.RaidTriggerEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.event.server.ServiceUnregisterEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
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
	


	@EventHandler public void event(AsyncPlayerPreLoginEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(InventoryMoveItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(InventoryPickupItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerLeashEntityEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerPreLoginEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(TabCompleteEvent e) {Command.executeCommands(e);}


	@EventHandler public void event(BlockBurnEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockCanBuildEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockCookEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockDamageEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockDispenseEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockDropItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockExpEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockExplodeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockFadeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockFertilizeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockFromToEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockGrowEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockIgniteEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockPhysicsEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(BlockPistonEvent e) {Command.executeCommands(e);} abstract use BlockPistonExtendEvent, BlockPistonRetractEvent
	@EventHandler public void event(BlockPistonExtendEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockPistonRetractEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockPlaceEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockRedstoneEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BlockShearEntityEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BrewEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BrewingStandFuelEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(CauldronLevelChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(FluidLevelChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(FurnaceBurnEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(LeavesDecayEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(MoistureChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(NotePlayEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SignChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SpongeAbsorbEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(AreaEffectCloudApplyEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ArrowBodyCountChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(BatToggleSleepEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(CreeperPowerEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EnderDragonChangePhaseEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityAirChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityBreedEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityChangeBlockEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityCombustEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(EntityCreatePortalEvent e) {Command.executeCommands(e);} Deprecated use PortalCreateEvent
	@EventHandler public void event(EntityDamageEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityDeathEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityDismountEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityDropItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityEnterBlockEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityEnterLoveModeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityExhaustionEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityExplodeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityInteractEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityMountEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityPickupItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityPlaceEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityPortalEnterEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityPoseChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityPotionEffectEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityRegainHealthEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityResurrectEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityShootBowEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntitySpawnEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntitySpellCastEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityTameEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityTargetEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityTeleportEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityToggleGlideEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityToggleSwimEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityTransformEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(EntityUnleashEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ExplosionPrimeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(FireworkExplodeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(FoodLevelChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(HorseJumpEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ItemDespawnEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ItemMergeEvent e) {Command.executeCommands(e);}
	//@EventHandler public void event(PiglinBarterEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PigZombieAngerEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ProjectileHitEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SheepDyeWoolEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SheepRegrowWoolEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SlimeSplitEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(StriderTemperatureChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VillagerAcquireTradeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VillagerCareerChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VillagerReplenishTradeEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(HangingBreakEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(HangingPlaceEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(EnchantItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(InventoryCloseEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(InventoryInteractEvent e) {Command.executeCommands(e);} abstract use InventoryClickEvent, InventoryDragEvent, TradeSelectEvent
	@EventHandler public void event(InventoryClickEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(InventoryDragEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(TradeSelectEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(InventoryOpenEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PrepareAnvilEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PrepareItemCraftEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PrepareItemEnchantEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PrepareSmithingEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(AsyncPlayerChatEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerAdvancementDoneEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerAnimationEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerBedEnterEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerBedLeaveEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerBucketFishEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(PlayerBucketEvent e) {Command.executeCommands(e);} abstract use PlayerBucketEmptyEvent, PlayerBucketFillEvent
	@EventHandler public void event(PlayerBucketEmptyEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerBucketFillEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerChangedMainHandEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerChangedWorldEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(PlayerChannelEvent e) {Command.executeCommands(e);} abstract use PlayerRegisterChannelEvent, PlayerUnregisterChannelEvent
	@EventHandler public void event(PlayerRegisterChannelEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerUnregisterChannelEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerChatEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerChatTabCompleteEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerCommandPreprocessEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerCommandSendEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerDropItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerEditBookEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerEggThrowEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerExpChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerFishEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerGameModeChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerHarvestBlockEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerInteractEntityEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerInteractEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerItemBreakEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerItemConsumeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerItemDamageEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerItemHeldEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerItemMendEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerJoinEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerKickEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerLevelChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerLocaleChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerLoginEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerMoveEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerPickupItemEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerQuitEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerRecipeDiscoverEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerResourcePackStatusEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerRespawnEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerRiptideEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerShearEntityEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerSpawnLocationEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerStatisticIncrementEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerSwapHandItemsEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerTakeLecternBookEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerToggleFlightEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerToggleSneakEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerToggleSprintEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PlayerVelocityEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(BroadcastMessageEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(MapInitializeEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(PluginEvent e) {Command.executeCommands(e);} abstract use PluginDisableEvent, PluginEnableEvent
	@EventHandler public void event(PluginDisableEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PluginEnableEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ServerCommandEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ServerListPingEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ServerLoadEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(ServiceEvent e) {Command.executeCommands(e);} abstract use ServiceRegisterEvent, ServiceUnregisterEvent
	@EventHandler public void event(ServiceRegisterEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ServiceUnregisterEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(VehicleCollisionEvent e) {Command.executeCommands(e);} abstract use VehicleBlockCollisionEvent, VehicleEntityCollisionEvent
	@EventHandler public void event(VehicleBlockCollisionEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleEntityCollisionEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleCreateEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleDamageEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleDestroyEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleEnterEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleExitEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleMoveEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(VehicleUpdateEvent e) {Command.executeCommands(e);}

	@EventHandler public void event(LightningStrikeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ThunderChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(WeatherChangeEvent e) {Command.executeCommands(e);}

	//TODO @EventHandler public void event(ChunkEvent e) {Command.executeCommands(e);} abstract use ChunkLoadEvent, ChunkPopulateEvent, ChunkUnloadEvent
	@EventHandler public void event(ChunkLoadEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ChunkPopulateEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(ChunkUnloadEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(LootGenerateEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(PortalCreateEvent e) {Command.executeCommands(e);}
	//TODO @EventHandler public void event(RaidEvent e) {Command.executeCommands(e);} abstract use RaidFinishEvent, RaidSpawnWaveEvent, RaidStopEvent, RaidTriggerEvent
	@EventHandler public void event(RaidFinishEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(RaidSpawnWaveEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(RaidStopEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(RaidTriggerEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(SpawnChangeEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(StructureGrowEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(TimeSkipEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(WorldInitEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(WorldLoadEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(WorldSaveEvent e) {Command.executeCommands(e);}
	@EventHandler public void event(WorldUnloadEvent e) {Command.executeCommands(e);}

//org.bukkit.event.world.WorldEvent
}
