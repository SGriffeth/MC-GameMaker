package name.sgriffeth.MCGameMaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class Command extends BukkitRunnable {
	
	private String name;
	
	//private final static Set<SupportedEvent> SUPPORTED_EVENTS = Set.of(SupportedEvent.PlayerJoinEvent,SupportedEvent.PlayerDeathEvent,SupportedEvent.PlayerRespawnEvent);
	//private final static HashMap<String,SupportedEvent> EVENT = new HashMap<String,SupportedEvent>();
	private static HashMap<SupportedEvent,List<String>> commands = new HashMap<SupportedEvent,List<String>>();
	private static List<Command> scheduled = new ArrayList<Command>();  
	private long delay;
	private long period;
	
	/*public final static HashMap<String,Long> DELAY = new HashMap<String,Long>();
	public final static HashMap<String,Long> PERIOD = new HashMap<String,Long>();*/
	
	public Command(String name) {
		this.name=name;
	}
	
	/*public Command(String name, long delay, long period, boolean run) {
		this.name = name;
		this.delay = delay;
		this.period = period;
		if(run == true) {
			this.runTaskTimer(Main.instance, delay, period);
		}
	}*/
	
	@Override
	public void run() {
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), name);
	}
	
	@Override
	public String toString() {
		return name + " " + delay + " " + period;
	}
	
	public String getCommand() {
		return name;
	}
	
	public static List<Command> getScheduled() {
		if(scheduled == null) scheduled = new ArrayList<Command>();
		return scheduled;
	}
	
	/*public static void setScheduled(List<Command> cmds) {
		scheduled = cmds;
	}
	
	/*public void setSchedule(long delay,long period) {
		if(scheduled == null) scheduled = new ArrayList<Command>();
		scheduled.add(this);
		this.delay=delay;
		this.period=period;
		/*DELAY.put(getCommand(), delay);
		PERIOD.put(getCommand(), period);*/
		/*this.runTaskTimer(Main.main, delay, period);
	}*/
	
	@Override
	public BukkitTask runTaskTimer(Plugin main, long delay, long period) {
		if(scheduled == null) scheduled = new ArrayList<Command>();
		this.delay = delay;
		this.period = period;
		scheduled.add(this);
		return super.runTaskTimer(main, delay, period);
	}
	
	/*public void add(long delay, long period,boolean add) {
		if(scheduled == null) scheduled = new ArrayList<Command>();
		if(add == true) {
			scheduled.add(new Command())
		}
		this.delay = delay;
		this.period = period;
		scheduled.add(this);
	}*/
	
	@Override 
	public void cancel() {
		super.cancel();
		scheduled.remove(this);
	}
	
	public Long getDelay() {
		return delay;
	}
	
	public Long getPeriod() {
		return period;
	}
	
	/*public static List<String> getCommands(SupportedEvent e){
		if(COMMANDS.get(e) == null)
			COMMANDS.put(e, new ArrayList<String>());
		return COMMANDS.get(e);
	}
	
	public static void setCommands(SupportedEvent e,List<String> cmds) {
		COMMANDS.put(e, cmds);
	}*/
	
	public static void executeCommands(SupportedEvent e) {
		for(String cmd : commands.get(e)) {
			Main.info("Next command : " + cmd);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
		}
	}
	
	/*public static void executeCommands(SupportedEvent e,Entity ent) {
		for(String cmd : commands.get(e)) {
			Main.info("Next command : " + cmd);
			//4595e5e3-3968-488a-9c26-45a121713383 represents the entities unique id and cmd represents the command
			///execute as 4595e5e3-3968-488a-9c26-45a121713383 at 4595e5e3-3968-488a-9c26-45a121713383 run cmd
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), 
			"execute as " + ent.getUniqueId() + " at " + ent.getUniqueId() + " run " + cmd);
			//This is making ent the command sender and executing the command at ent 
		}
	}*/
	
	public static void executeCommands(Event e) {
		String[] args = e.getClass().getName().split("\\."); //org.bukkit.event.player.PlayerCommandPreprocessEvent
		if((args.length < 4)) {
			Main.info("Length of args : " + args.length);
			Main.info(e.getClass().getName() + " is the class and when its split : " + args.toString());
			return;
		}
		String name = args[4];
		//Main.info("Execute commands of : " + name);
		if(e instanceof EntityEvent) {
			//Main.info("Event is EntityEvent");
			EntityEvent e2 = (EntityEvent) e;
			Entity ent = e2.getEntity();
			if(commands.get(SupportedEvent.valueOf(name)) != null)
			for(String cmd : commands.get(SupportedEvent.valueOf(name))) {
				//Main.info("Next command : " + cmd);
				//4595e5e3-3968-488a-9c26-45a121713383 represents the entities unique id and cmd represents the command
				///execute as 4595e5e3-3968-488a-9c26-45a121713383 at 4595e5e3-3968-488a-9c26-45a121713383 run cmd
				Bukkit.dispatchCommand(ent, cmd);
				//This is making ent the command sender and executing the command at ent 
			}
		}else if(e instanceof PlayerEvent) {
			//Main.info("Event is PlayerEvent");
			PlayerEvent e2 = (PlayerEvent) e;
			Entity ent = e2.getPlayer();
			if(commands.get(SupportedEvent.valueOf(name)) != null)
			for(String cmd : commands.get(SupportedEvent.valueOf(name))) {
				Main.info("Next command : " + cmd);
				//4595e5e3-3968-488a-9c26-45a121713383 represents the entities unique id and cmd represents the command
				///execute as 4595e5e3-3968-488a-9c26-45a121713383 at 4595e5e3-3968-488a-9c26-45a121713383 run cmd
				Bukkit.dispatchCommand(ent, cmd);
				//This is making ent the command sender and executing the command at ent 
			}
		}else {
			//Main.info("Event is Not PlayerEvent and NOT EntityEvent");
			if(commands.get(SupportedEvent.valueOf(name)) != null)
			for(String cmd : commands.get(SupportedEvent.valueOf(name))) {
				Main.info("Next command : " + cmd);
				//4595e5e3-3968-488a-9c26-45a121713383 represents the entities unique id and cmd represents the command
				///execute as 4595e5e3-3968-488a-9c26-45a121713383 at 4595e5e3-3968-488a-9c26-45a121713383 run cmd
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(),cmd);
				//This is making ent the command sender and executing the command at ent 
			}
		}
	}
	
	public static HashMap<SupportedEvent,List<String>> getCommands() {
		return commands;
	}
	
	public static void setCommands(SupportedEvent ev,List<String> cmds) {
		commands.put(ev, cmds);
	}
	
	/*public static void setCommands(HashMap<SupportedEvent,List<String>> map) {
		commands = map;
	}*/
	
	public static enum SupportedEvent {
		AsyncPlayerPreLoginEvent,
	 

		 BlockEvent,
	 
		BlockBurnEvent,
	 BlockCanBuildEvent,
	 BlockCookEvent,
	 BlockDamageEvent,
	 BlockDispenseEvent,
	 BlockDropItemEvent,
	 
	 @ParentEvent(isAbstract = false)
	 BlockExpEvent,
	 
	 @ChildEvent(parent = BlockExpEvent)
	 FurnaceExtractEvent,
	 
	 @ChildEvent(parent = BlockExpEvent)
	 BlockBreakEvent,
	 
	 BlockExplodeEvent,
	 BlockFadeEvent,
	 BlockFertilizeEvent,
	 BlockFromToEvent,
	 BlockGrowEvent,
	 BlockIgniteEvent,
	 BlockPhysicsEvent,
	 BlockPistonEvent,
	 BlockPlaceEvent,
	 BlockRedstoneEvent,
	 BlockShearEntityEvent,
	 BrewEvent,
	 BrewingStandFuelEvent,
	 CauldronLevelChangeEvent,
	 FluidLevelChangeEvent,
	 FurnaceBurnEvent,
	 LeavesDecayEvent,
	 MoistureChangeEvent,
	 NotePlayEvent,
	 SignChangeEvent,
	 SpongeAbsorbEvent,
	 EntityEvent,
	 AreaEffectCloudApplyEvent,
	 ArrowBodyCountChangeEvent,
	 BatToggleSleepEvent,
	 CreeperPowerEvent,
	 EnderDragonChangePhaseEvent,
	 EntityAirChangeEvent,
	 EntityBreedEvent,
	 EntityChangeBlockEvent,
	 
	 @ParentEvent(isAbstract = false)
	 EntityCombustEvent,
	 
	 @ChildEvent(parent = EntityCombustEvent)
	 EntityCombustByBlockEvent,
	 
	 @ChildEvent(parent = EntityCombustEvent)
	 EntityCombustByEntityEvent,
	 
	 EntityCreatePortalEvent,
	 
	 @ParentEvent(isAbstract = false)
	 EntityDamageEvent,
	 
	 @ChildEvent(parent = SupportedEvent.EntityDamageEvent)
	 EntityDamageByBlockEvent,
	 
	 @ChildEvent(parent = SupportedEvent.EntityDamageEvent)
	 EntityDamageByEntityEvent,
	 
	 EntityDeathEvent,
	 EntityDismountEvent,
	 EntityDropItemEvent,
	 EntityEnterBlockEvent,
	 EntityEnterLoveModeEvent,
	 EntityExhaustionEvent,
	 EntityExplodeEvent,
	 EntityInteractEvent,
	 EntityMountEvent,
	 EntityPickupItemEvent,
	 EntityPlaceEvent,
	 EntityPortalEnterEvent,
	 EntityPoseChangeEvent,
	 EntityPotionEffectEvent,
	 EntityRegainHealthEvent,
	 EntityResurrectEvent,
	 EntityShootBowEvent,
	 
	 @ParentEvent(isAbstract = false)
	 EntitySpawnEvent,
	 
	 @ChildEvent(parent = EntitySpawnEvent)
	 CreatureSpawnEvent,
	 
	 @ChildEvent(parent = EntitySpawnEvent)
	 ItemSpawnEvent,
	 
	 @ChildEvent(parent = EntitySpawnEvent)
	 ProjectileLaunchEvent,
	 
	 @ChildEvent(parent = EntitySpawnEvent)
	 SpawnerSpawnEvent,
	 
	 EntitySpellCastEvent,
	 EntityTameEvent,
	 EntityTargetEvent,
	 EntityTeleportEvent,
	 EntityToggleGlideEvent,
	 EntityToggleSwimEvent,
	 EntityTransformEvent,
	 EntityUnleashEvent,
	 ExplosionPrimeEvent,
	 FireworkExplodeEvent,
	 FoodLevelChangeEvent,
	 HorseJumpEvent,
	 ItemDespawnEvent,
	 ItemMergeEvent,
	 PiglinBarterEvent,
	 PigZombieAngerEvent,
	 ProjectileHitEvent,
	 SheepDyeWoolEvent,
	 SheepRegrowWoolEvent,
	 SlimeSplitEvent,
	 StriderTemperatureChangeEvent,
	 VillagerAcquireTradeEvent,
	 VillagerCareerChangeEvent,
	 VillagerReplenishTradeEvent,
	 HangingEvent,
	 InventoryEvent,
	 EnchantItemEvent,
	 InventoryCloseEvent,
	 
	 @ParentEvent(isAbstract = true)
	 InventoryInteractEvent,
	 
	 @ChildEvent(parent = InventoryInteractEvent)
	 InventoryClickEvent,
	 
	 @ChildEvent(parent = InventoryInteractEvent)
	 InventoryDragEvent,
	 
	 @ChildEvent(parent = InventoryInteractEvent)
	 TradeSelectEvent,
	 
	 InventoryOpenEvent,
	 PrepareAnvilEvent,
	 PrepareItemCraftEvent,
	 PrepareItemEnchantEvent,
	 PrepareSmithingEvent,
	 InventoryMoveItemEvent,
	 InventoryPickupItemEvent,
	 PlayerEvent,
	 AsyncPlayerChatEvent,
	 PlayerAdvancementDoneEvent,
	 PlayerAnimationEvent,
	 PlayerBedEnterEvent,
	 PlayerBedLeaveEvent,
	 PlayerBucketEntityEvent,
	 PlayerBucketEvent,
	 PlayerChangedMainHandEvent,
	 PlayerChangedWorldEvent,
	 PlayerChannelEvent,
	 PlayerChatEvent,
	 PlayerChatTabCompleteEvent,
	 PlayerCommandPreprocessEvent,
	 PlayerCommandSendEvent,
	 PlayerDropItemEvent,
	 PlayerEditBookEvent,
	 PlayerEggThrowEvent,
	 PlayerExpChangeEvent,
	 PlayerFishEvent,
	 PlayerGameModeChangeEvent,
	 PlayerHarvestBlockEvent,
	 PlayerInteractEntityEvent,
	 PlayerInteractEvent,
	 PlayerItemBreakEvent,
	 PlayerItemConsumeEvent,
	 PlayerItemDamageEvent,
	 PlayerItemHeldEvent,
	 PlayerItemMendEvent,
	 PlayerJoinEvent,
	 PlayerKickEvent,
	 PlayerLevelChangeEvent,
	 PlayerLocaleChangeEvent,
	 PlayerLoginEvent,
	 PlayerMoveEvent,
	 PlayerPickupItemEvent,
	 PlayerQuitEvent,
	 PlayerRecipeDiscoverEvent,
	 PlayerResourcePackStatusEvent,
	 PlayerRespawnEvent,
	 PlayerRiptideEvent,
	 PlayerShearEntityEvent,
	 PlayerSpawnLocationEvent,
	 PlayerStatisticIncrementEvent,
	 PlayerSwapHandItemsEvent,
	 PlayerTakeLecternBookEvent,
	 PlayerToggleFlightEvent,
	 PlayerToggleSneakEvent,
	 PlayerToggleSprintEvent,
	 PlayerVelocityEvent,
	 PlayerLeashEntityEvent,
	 PlayerPreLoginEvent,
	 ServerEvent,
	 BroadcastMessageEvent,
	 MapInitializeEvent,
	 PluginEvent,
	 ServerCommandEvent,
	 ServerListPingEvent,
	 ServerLoadEvent,
	 ServiceEvent,
	 TabCompleteEvent,
	 VehicleEvent,
	 VehicleCollisionEvent,
	 VehicleCreateEvent,
	 VehicleDamageEvent,
	 VehicleDestroyEvent,
	 VehicleEnterEvent,
	 VehicleExitEvent,
	 VehicleMoveEvent,
	 VehicleUpdateEvent,
	 WeatherEvent,
	 LightningStrikeEvent,
	 ThunderChangeEvent,
	 WeatherChangeEvent,
	 WorldEvent,
	 ChunkEvent,
	 LootGenerateEvent,
	 PortalCreateEvent,
	 RaidEvent,
	 SpawnChangeEvent,
	 StructureGrowEvent,
	 TimeSkipEvent,
	 WorldInitEvent,
	 WorldLoadEvent,
	 WorldSaveEvent,
	 WorldUnloadEvent,
	 //EntitySpawnEvent is abstract but has the following subclasses
	}
	
	/*public static enum SupportedEvent {
		AsyncPlayerChatEvent,	
		//This event will sometimes fire synchronously, depending on how it was triggered.
		AsyncPlayerPreLoginEvent,	
		//Stores details for players attempting to log in.
		PlayerAchievementAwardedEvent,	
		//Called when a player earns an achievement.
		PlayerAnimationEvent,	
		//Represents a player animation event
		PlayerBedEnterEvent,	
		//This event is fired when the player is almost about to enter the bed.
		PlayerBedLeaveEvent,	
		//This event is fired when the player is leaving a bed.
		PlayerBucketEmptyEvent,	
		//Called when a player empties a bucket
		PlayerBucketEvent,	
		//Called when a player interacts with a Bucket
		PlayerBucketFillEvent,	
		//Called when a player fills a bucket
		PlayerChangedWorldEvent,	
		//Called when a player switches to another world.
		PlayerChannelEvent,	
		//This event is called after a player registers or unregisters a new plugin channel.
		PlayerChatEvent,/*Deprecated*/
		//This event will fire from the main thread and allows the use of all of the Bukkit API, unlike the AsyncPlayerChatEvent.
		/*PlayerChatTabCompleteEvent,	
		//Called when a player attempts to tab-complete a chat message.
		PlayerCommandPreprocessEvent,	
		//This event is called whenever a player runs a command (by placing a slash at the start of their message).
		PlayerDropItemEvent,	
		//Thrown when a player drops an item from their inventory
		PlayerDeathEvent,
		//Thrown whenever a Player dies
		PlayerEditBookEvent,	
		//Called when a player edits or signs a book and quill item.
		PlayerEggThrowEvent,	
		//Called when a player throws an egg and it might hatch
		PlayerEvent,	
		//Represents a player related event
		PlayerExpChangeEvent,	
		//Called when a players experience changes naturally
		PlayerFishEvent,	
		//Thrown when a player is fishing
		PlayerGameModeChangeEvent,	
		//Called when the GameMode of the player is changed.
		PlayerInteractEntityEvent,	
		//Represents an event that is called when a player right clicks an entity.
		PlayerInteractEvent,
		//Called when a player interacts with an object or air.
		PlayerInventoryEvent,/*Deprecated*/
		//Use InventoryClickEvent or InventoryOpenEvent instead, or one of the other inventory events in org.bukkit.event.inventory.
		/*PlayerItemBreakEvent,	
		//Fired when a player's item breaks (such as a shovel or flint and steel).
		PlayerItemConsumeEvent,	
		//This event will fire when a player is finishing consuming an item (food, potion, milk bucket).
		PlayerItemHeldEvent,	
		//Fired when a player changes their currently held item
		PlayerJoinEvent,
		//Called when a player joins a server
		PlayerKickEvent,	
		//Called when a player gets kicked from the server
		PlayerLevelChangeEvent,	
		//Called when a players level changes
		PlayerLoginEvent,	
		//Stores details for players attempting to log in
		PlayerMoveEvent,	
		//Holds information for player movement events
		PlayerPickupItemEvent,	
		//Thrown when a player picks an item up from the ground
		PlayerPortalEvent,	
		//Called when a player is about to teleport because it is in contact with a portal.
		PlayerPreLoginEvent,/*Deprecated*/
		//This event causes synchronization from the login thread; AsyncPlayerPreLoginEvent is preferred to keep the secondary threads asynchronous.
		/*PlayerQuitEvent,	
		//Called when a player leaves a server
		PlayerRegisterChannelEvent,	
		//This is called immediately after a player registers for a plugin channel.
		PlayerRespawnEvent,	
		//Called when a player respawns.
		PlayerShearEntityEvent,	
		//Called when a player shears an entity
		PlayerStatisticIncrementEvent,	
		//Called when a player statistic is incremented.
		PlayerTeleportEvent,	
		//Holds information for player teleport events
		PlayerToggleFlightEvent,	
		//Called when a player toggles their flying state
		PlayerToggleSneakEvent,	
		//Called when a player toggles their sneaking state
		PlayerToggleSprintEvent,	
		//Called when a player toggles their sprinting state
		PlayerUnleashEntityEvent,	
		//Called prior to an entity being unleashed due to a player's action.
		PlayerUnregisterChannelEvent,
		//This is called immediately after a player unregisters for a plugin channel.
		PlayerVelocityEvent,
		//Called when the velocity of a player changes.
	}*/
	/*
	public static enum SupportedEvent2 {
		AsyncPlayerPreLoginEvent,
		InventoryMoveItemEvent,
		InventoryPickupItemEvent,
		PlayerLeashEntityEvent,
		PlayerPreLoginEvent,
		TabCompleteEvent,
		;
		public static enum PlayerEvent {

			AsyncPlayerChatEvent,
			PlayerAdvancementDoneEvent,
			PlayerAnimationEvent,
			PlayerBedEnterEvent,
			PlayerBedLeaveEvent,
			PlayerBucketEvent,
			PlayerBucketFishEvent,
			PlayerChangedMainHandEvent,
			PlayerChangedWorldEvent,
			PlayerChannelEvent,
			PlayerChatEvent,
			PlayerChatTabCompleteEvent,
			PlayerCommandPreprocessEvent,
			PlayerCommandSendEvent,
			PlayerDropItemEvent,
			PlayerEditBookEvent,
			PlayerEggThrowEvent,
			PlayerExpChangeEvent,
			PlayerFishEvent,
			PlayerGameModeChangeEvent,
			PlayerHarvestBlockEvent,
			PlayerInteractEntityEvent,
			PlayerInteractEvent,
			PlayerItemBreakEvent,
			PlayerItemConsumeEvent,
			PlayerItemDamageEvent,
			PlayerItemHeldEvent,
			PlayerItemMendEvent,
			PlayerJoinEvent,
			PlayerKickEvent,
			PlayerLevelChangeEvent,
			PlayerLocaleChangeEvent,
			PlayerLoginEvent,
			PlayerMoveEvent,
			PlayerPickupItemEvent, PlayerQuitEvent, PlayerRecipeDiscoverEvent, PlayerResourcePackStatusEvent, PlayerRespawnEvent,
			PlayerRiptideEvent, PlayerShearEntityEvent, PlayerSpawnLocationEvent, PlayerStatisticIncrementEvent, PlayerSwapHandItemsEvent,
			PlayerTakeLecternBookEvent, PlayerToggleFlightEvent, PlayerToggleSneakEvent, PlayerToggleSprintEvent, PlayerVelocityEvent
			
		}
		
		public static enum EntityEvent {
			AreaEffectCloudApplyEvent, ArrowBodyCountChangeEvent, BatToggleSleepEvent, CreeperPowerEvent, EnderDragonChangePhaseEvent,
			EntityAirChangeEvent, EntityBreedEvent, EntityChangeBlockEvent, EntityCombustEvent, EntityCreatePortalEvent, EntityDamageEvent,
			EntityDeathEvent, EntityDismountEvent, EntityDropItemEvent, EntityEnterBlockEvent, EntityEnterLoveModeEvent, EntityExhaustionEvent,
			EntityExplodeEvent, EntityInteractEvent, EntityMountEvent, EntityPickupItemEvent, EntityPlaceEvent, EntityPortalEnterEvent,
			EntityPoseChangeEvent, EntityPotionEffectEvent, EntityRegainHealthEvent, EntityResurrectEvent, EntityShootBowEvent, EntitySpawnEvent,
			EntitySpellCastEvent, EntityTameEvent, EntityTargetEvent, EntityTeleportEvent, EntityToggleGlideEvent, EntityToggleSwimEvent, EntityTransformEvent,
			EntityUnleashEvent, ExplosionPrimeEvent, FireworkExplodeEvent, FoodLevelChangeEvent, HorseJumpEvent, ItemDespawnEvent, ItemMergeEvent, PiglinBarterEvent,
			PigZombieAngerEvent, ProjectileHitEvent, SheepDyeWoolEvent, SheepRegrowWoolEvent, SlimeSplitEvent, StriderTemperatureChangeEvent, VillagerAcquireTradeEvent,
			VillagerCareerChangeEvent, VillagerReplenishTradeEvent
		}
		
	}*/
	
}
