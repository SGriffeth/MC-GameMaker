package name.sgriffeth.MCGameMaker;
//import org.bukkit.command.Command;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFertilizeEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
//import org.bukkit.event.block.BlockPist;
import org.bukkit.event.block.BlockPistonEvent;
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
import org.bukkit.event.entity.EntityCreatePortalEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.entity.EntityEnterBlockEvent;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;
import org.bukkit.event.entity.EntityEvent;
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
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.event.entity.VillagerCareerChangeEvent;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;
import org.bukkit.event.hanging.HangingEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.BrewingStandFuelEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketEvent;
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
import org.bukkit.event.player.PlayerEvent;
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
import org.bukkit.event.raid.RaidEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.event.server.ServiceEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.event.vehicle.VehicleCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.weather.WeatherEvent;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.TimeSkipEvent;
import org.bukkit.event.world.WorldEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.spigotmc.event.entity.EntityDismountEvent;
import org.spigotmc.event.entity.EntityMountEvent;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

public class TheDumbClass<PlayerAnimationEvent, PiglinBarterEvent> {
/*
@EventHandler public void AsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent e) {Command.executeCommands(e);}

//@EventHandler public void (BlockEvent e) {Command.executeCommands(e);}

@EventHandler public void BlockBurnEvent(BlockBurnEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockCanBuildEvent(BlockCanBuildEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockCookEvent(BlockCookEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDamageEvent(BlockDamageEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDispenseEvent(BlockDispenseEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockDropItemEvent(BlockDropItemEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockExpEvent(BlockExpEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockExplodeEvent(BlockExplodeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFadeEvent(BlockFadeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFertilizeEvent(BlockFertilizeEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockFromToEvent(BlockFromToEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockGrowEvent(BlockGrowEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockIgniteEvent(BlockIgniteEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockPhysicsEvent(BlockPhysicsEvent e) {Command.executeCommands(e);}
@EventHandler public void BlockPistonEvent(BlockPistonEvent e) {Command.executeCommands(e);}
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

//@EventHandler public void EntityEvent(EntityEvent e) {Command.executeCommands(e);}

@EventHandler public void AreaEffectCloudApplyEvent(AreaEffectCloudApplyEvent e) {Command.executeCommands(e);}
@EventHandler public void ArrowBodyCountChangeEvent(ArrowBodyCountChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void BatToggleSleepEvent(BatToggleSleepEvent e) {Command.executeCommands(e);}
@EventHandler public void CreeperPowerEvent(CreeperPowerEvent e) {Command.executeCommands(e);}
@EventHandler public void EnderDragonChangePhaseEvent(EnderDragonChangePhaseEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityAirChangeEvent(EntityAirChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityBreedEvent(EntityBreedEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityChangeBlockEvent(EntityChangeBlockEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityCombustEvent(EntityCombustEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityCreatePortalEvent(EntityCreatePortalEvent e) {Command.executeCommands(e);}
@EventHandler public void EntityDamageEvent(EntityDamageEvent e) {Command.executeCommands(e);}
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
@EventHandler public void EntitySpawnEvent(EntitySpawnEvent e) {Command.executeCommands(e);}
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
@EventHandler public void PiglinBarterEvent(PiglinBarterEvent e) {Command.executeCommands(e);}
@EventHandler public void PigZombieAngerEvent(PigZombieAngerEvent e) {Command.executeCommands(e);}
@EventHandler public void ProjectileHitEvent(ProjectileHitEvent e) {Command.executeCommands(e);}
@EventHandler public void SheepDyeWoolEvent(SheepDyeWoolEvent e) {Command.executeCommands(e);}
@EventHandler public void SheepRegrowWoolEvent(SheepRegrowWoolEvent e) {Command.executeCommands(e);}
@EventHandler public void SlimeSplitEvent(SlimeSplitEvent e) {Command.executeCommands(e);}
@EventHandler public void StriderTemperatureChangeEvent(StriderTemperatureChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerAcquireTradeEvent(VillagerAcquireTradeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerCareerChangeEvent(VillagerCareerChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void VillagerReplenishTradeEvent(VillagerReplenishTradeEvent e) {Command.executeCommands(e);}

@EventHandler public void HangingEvent(HangingEvent e) {Command.executeCommands(e);}

@EventHandler public void InventoryEvent(InventoryEvent e) {Command.executeCommands(e);}
@EventHandler public void EnchantItemEvent(EnchantItemEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryCloseEvent(InventoryCloseEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryInteractEvent(InventoryInteractEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryOpenEvent(InventoryOpenEvent e) {Command.executeCommands(e);}

@EventHandler public void PrepareAnvilEvent(PrepareAnvilEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareItemCraftEvent(PrepareItemCraftEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareItemEnchantEvent(PrepareItemEnchantEvent e) {Command.executeCommands(e);}
@EventHandler public void PrepareSmithingEvent(PrepareSmithingEvent e) {Command.executeCommands(e);}

@EventHandler public void InventoryMoveItemEvent(InventoryMoveItemEvent e) {Command.executeCommands(e);}
@EventHandler public void InventoryPickupItemEvent(InventoryPickupItemEvent e) {Command.executeCommands(e);}


@EventHandler public void PlayerEvent(PlayerEvent e) {Command.executeCommands(e);}
@EventHandler public void AsyncPlayerChatEvent(AsyncPlayerChatEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerAnimationEvent(PlayerAnimationEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBedEnterEvent(PlayerBedEnterEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBedLeaveEvent(PlayerBedLeaveEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBucketEmptyEvent(PlayerBucketEmptyEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBucketFillEvent(PlayerBucketFillEvent e) {Command.executeCommands(e);}
@EventHandler public void PlayerBucketEvent(PlayerBucketEvent e) {Command.executeCommands(e);}
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
@EventHandler public void ServiceEvent(ServiceEvent e) {Command.executeCommands(e);}

@EventHandler public void TabCompleteEvent(TabCompleteEvent e) {Command.executeCommands(e);}


//@EventHandler public void VehicleEvent(VehicleEvent e) {Command.executeCommands(e);}

@EventHandler public void VehicleCollisionEvent(VehicleCollisionEvent e) {Command.executeCommands(e);}
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

@EventHandler public void WorldEvent(WorldEvent e) {Command.executeCommands(e);}
@EventHandler public void ChunkEvent(ChunkEvent e) {Command.executeCommands(e);}
@EventHandler public void LootGenerateEvent(LootGenerateEvent e) {Command.executeCommands(e);}
@EventHandler public void PortalCreateEvent(PortalCreateEvent e) {Command.executeCommands(e);}
@EventHandler public void RaidEvent(RaidEvent e) {Command.executeCommands(e);}
@EventHandler public void SpawnChangeEvent(SpawnChangeEvent e) {Command.executeCommands(e);}
@EventHandler public void StructureGrowEvent(StructureGrowEvent e) {Command.executeCommands(e);}
@EventHandler public void TimeSkipEvent(TimeSkipEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldInitEvent(WorldInitEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldLoadEvent(WorldLoadEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldSaveEvent(WorldSaveEvent e) {Command.executeCommands(e);}
@EventHandler public void WorldUnloadEvent(WorldUnloadEvent e) {Command.executeCommands(e);}
*/}