package name.sgriffeth.MCGameMaker.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import name.sgriffeth.MCGameMaker.DataHolder;

public interface GUI extends DataHolder {
	
	List<GUI> GUIs = new ArrayList<GUI>();
	//HashMap<Inventory,Boolean> MODIFIED = new HashMap<Inventory,Boolean>();
	//HashMap<Inventory,Boolean> MODIFIED = new HashMap<Inventory,Boolean>();
	/*HashMap<String,Inventory> MODIFIED = new HashMap<String,Inventory>();
	HashMap<Inventory,ItemStack[]> CONTENTS = new HashMap<Inventory,ItemStack[]>();*/
	HashMap<String,Inventory> MODIFYING = new HashMap<String,Inventory>(); // The player that is modifying the Inventory
	HashMap<Inventory,ItemStack[]> CONTENTS = new HashMap<Inventory,ItemStack[]>(); // The contents that will be saved when the inventory is closed
	HashMap<Inventory,Boolean> ITEM_HOLDER = new HashMap<Inventory,Boolean>(); // Whether or not it is necessart to save items when Inventory is closed
	HashMap<GUI,String> TITLE = new HashMap<GUI,String>();
	
	
	public Inventory getGUI();
	public void setGUI(Inventory inv);
	public String getName();
	public String getTitle();
	/*
	 * Name
	 * Title
	 * Size
	 * Owner
	 * Type
	 * Items
	 */
	
	public static GUI getGUI(Inventory inv) {
		GUI g = null;
		Iterator<GUI> it = GUI.GUIs.iterator();
		while(it.hasNext()) {
			GUI next = it.next();
			if(next.getGUI().equals(inv)) {
				g = next;
			}
		}
		return g;
	}
	
	public static GUI getGUI(String name) {
		GUI g = null;
		for(GUI gui : GUI.GUIs) {
			if(gui.getName().equals(name)) {
				g = gui;
			}
		}
		return g;
	}
	
	public static void saveInventory(Inventory inv) {
		if(ITEM_HOLDER.get(inv) == null) throw new IllegalArgumentException("The Inventory must be a item holder");
		if(!ITEM_HOLDER.get(inv)) throw new IllegalArgumentException("The Inventory must be a item holder");
		CONTENTS.put(inv, inv.getContents());
	}
	
}
