package name.griffeth.sebastian.MCGameMaker;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import name.griffeth.sebastian.MCGameMaker.inventory.MagicStack;

class MobPlacer extends BukkitRunnable {
	
	private final Player p;
	
	MobPlacer(Player p) {
		this.p=p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Bukkit.getLogger().info("Under development");
		ItemStack item = p.getInventory().getItemInMainHand();
		if(item == null) return;
		if(((MagicStack) item).isMobPart()) {
			
		}
	}
	
}
