package name.griffeth.sebastian.MCGameMaker;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class CommandRunner extends BukkitRunnable {

	private String cmd;

	public CommandRunner(String cmd) {
		this.cmd=cmd;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Main.info("Running a command");
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
	}

}
