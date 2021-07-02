package name.sgriffeth.MCGameMaker;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public interface DataHolder {
	
	public void saveData();
	public void loadData();
	
	default void createConfig(String name) {
		if(!Main.instance.getDataFolder().exists())
			Main.instance.getDataFolder().mkdir();
		File file = new File(Main.instance.getDataFolder(),name);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	static void reloadConfig() {
		
		if(!new File(Main.instance.getDataFolder(),PATH).exists()) {
			
		}
		/*if(this.configFile == null)
			this.configFile = new File(this.plugin.getDataFolder(),YML_FILE);
		
		this.dataConfig = YamlConfiguration.loadConfiguration(this.configFile);
		
		InputStream defaultStream = this.plugin.getResource(YML_FILE);
		
		if(defaultStream != null) {
			YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
			this.dataConfig.setDefaults(defaultConfig);
		}*/
	/*}
	
	static YamlConfiguration getConfig() {
		return YamlConfiguration.loadConfiguration(new File(Main.instance.getDataFolder(),PATH));
		/*if(this.dataConfig == null)
			reloadConfig();
		
		return (FileConfiguration) this.dataConfig;*/
	/*}
	
	static void saveConfig() {
		try {
			getConfig().save(new File(Main.instance.getDataFolder(),PATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if(this.dataConfig == null || this.configFile == null)
			return;
		
		try {
			this.getConfig().save(this.configFile);
		} catch (IOException e) {
			this.plugin.getLogger().log(Level.SEVERE, "Could not save config to " + this.configFile,e);
		}*/
	/*}
	
	static void saveDefaultConfig() {
		//If was able to create the Data Folder in other words the Data Folder did not exist then create the Config
		try {
			if(Main.instance.getDataFolder().createNewFile()) {
				File config = new File(Main.instance.getDataFolder(),PATH);
				config.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if(this.configFile == null)
			this.configFile = new File(this.plugin.getDataFolder(),YML_FILE);
		
		if(!this.configFile.exists())
			this.plugin.saveResource(YML_FILE, false);*/
	//}
	
}
