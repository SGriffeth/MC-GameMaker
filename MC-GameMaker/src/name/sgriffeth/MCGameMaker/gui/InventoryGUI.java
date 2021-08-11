package name.sgriffeth.MCGameMaker.gui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import name.sgriffeth.MCGameMaker.Main;

public class InventoryGUI implements MinecraftGUI {
	
	private Inventory inv;
	private String name;
	/*private HashMap<Inventory,Boolean> beingModified = new HashMap<Inventory,Boolean>();
	private Inventory modifyingGUI;*/
	
	public InventoryGUI(String name) {
		this.name = name;
	}
	
	public InventoryGUI(Inventory inv,String name) {
		this.inv = inv;
		this.name = name;
		//GUIs.add(this);
	}

	@Override
	public Inventory getGUI() {
		// TODO Auto-generated method stub
		return inv;
	}

	@Override
	public void setGUI(Inventory inv) {
		// TODO Auto-generated method stub
		this.inv = inv;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getTitle() {
		return TITLE.get(MinecraftGUI.getGUI(inv));
	}

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		createConfig("inventorygui.yml");
		File file = new File(Main.instance.getDataFolder(),"inventorygui.yml");
		YamlConfiguration ymlFile = YamlConfiguration.loadConfiguration(file);
		
		/*ConfigurationSection names = ymlFile.createSection("name");
		ConfigurationSection titles =ymlFile.createSection("title");
		ConfigurationSection sizes =ymlFile.createSection("size");
		ConfigurationSection items =ymlFile.createSection("items");
		
		for(GUI gui : GUIs) {
			String name = gui.getName();
			names.set(name, name);
			titles.set(name, gui.getTitle());
			sizes.set(name, gui.getGUI().getSize());
			items.set(name, gui.getGUI().getContents());
		}*/
		for(MinecraftGUI gui : GUIs) {
			ConfigurationSection name = ymlFile.createSection(gui.getName());
			name.set("title", gui.getTitle());
			name.set("size", gui.getGUI().getSize());
			name.set("contents", gui.getGUI().getContents());
			name.set("item_holder", ITEM_HOLDER.get(gui));
		}
		try {
			ymlFile.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		createConfig("inventorygui.yml");
		File file = new File(Main.instance.getDataFolder(),"inventorygui.yml");
		YamlConfiguration ymlFile = YamlConfiguration.loadConfiguration(file);
		for(String guiName : ymlFile.getKeys(false)) {
			Main.info(guiName + " is the guiName!!!uf");
			ConfigurationSection gui = ymlFile.getConfigurationSection(guiName);
			String title = gui.getString("title");
			int size = gui.getInt("size");
			System.out.println(gui.getList("contents"));
			ItemStack[] items = gui.getList("contents").toArray(new ItemStack[0]);
			boolean itemHolder = gui.getBoolean("item_holder");
			//Create the inventory assign it the size and title
			Inventory inv = Bukkit.createInventory(null, size, title);
			ITEM_HOLDER.put(inv, itemHolder);
			//Assign it the contents
			inv.setContents(items);
			//Create a new InventoryGUI out of the inventory above
			MinecraftGUI guiGUI = new InventoryGUI(inv,guiName);
			//Assign it the title
			TITLE.put(guiGUI, title);
			GUIs.add(guiGUI);
		}
		/*ConfigurationSection name = ymlFile.getConfigurationSection("name");
		ConfigurationSection title = ymlFile.getConfigurationSection("title");
		ConfigurationSection size = ymlFile.getConfigurationSection("size");
		ConfigurationSection item = ymlFile.getConfigurationSection("items");
		List<GUI> guis = new ArrayList<GUI>();
		HashMap<String,Integer> sizeName = new HashMap<String,Integer>();
		HashMap<String,String> titleName = new HashMap<String,String>();
		HashMap<String,ItemStack[]> itemsName = new HashMap<String,ItemStack[]>();
		for(String key : name.getKeys(true)) {
			guis.add(new InventoryGUI(name.getString(key)));
		}
		for(String key : size.getKeys(true)) {
			int sizee = size.getInt(key);
			sizeName.put(key, sizee);
		}
		for(String key : title.getKeys(true)) {
			titleName.put(key, title.getString(key));
		}
		for(String key : item.getKeys(true)) {
			//titleName.put(key, item.getList(key));
		}*/
	}

}
