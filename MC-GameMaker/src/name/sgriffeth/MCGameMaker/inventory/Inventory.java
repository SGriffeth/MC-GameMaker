package name.sgriffeth.MCGameMaker.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class Inventory {
	protected org.bukkit.inventory.Inventory inv;
	
	/*
	 * Helps distinguish the inventory's by assigning to each inventory a integer
	 */
	private final static HashMap<org.bukkit.inventory.Inventory,Integer> ORDER = new HashMap<org.bukkit.inventory.Inventory,Integer>();
	/*
	 * 
	 */
	private final static HashMap<org.bukkit.inventory.Inventory,Type> INVENTORY_TYPE = new HashMap<org.bukkit.inventory.Inventory,Type>();
	
	public Inventory(org.bukkit.inventory.Inventory inv) {
		this.inv=inv;
	}
	
	public org.bukkit.inventory.Inventory getInventory() {
		return inv;
	}
	
	public void setInventory(org.bukkit.inventory.Inventory inv) {
		this.inv=inv;
	}
	
	public int getOrder() {
		if(ORDER.get(inv) == null) {
			ORDER.put(inv, 0);
		}
		return ORDER.get(inv);
	}
	
	public void setOrder(int order) {
		ORDER.put(inv, order);
	}
	
	public Type getType() {
		return INVENTORY_TYPE.get(inv);
	}
	
	public void setType(Type type) { 
		INVENTORY_TYPE.put(inv, type);
	}
	
	public org.bukkit.inventory.Inventory newInventory(Type type) {
		switch(type) {
		case MOB_INVENTORY:
			/* Custom Model Data is determined by the inventory's order 
			 * (Inventory's order is stored as a value in a hash map named ORDER) and the items slot within the 
			 * inventory starting at 1 and increasing by 1 for each slot and the first item of any inventory
			 * is the inventory's number (Starting at 0) * 54 + 4000
			 * for example the first item of the second inventory is 4055 and the second item of the third
			 * inventory is 4110 and the first item of the fourth inventory is 4163 etc
			 * (The first inventory is mobInventory the second is itemInventory the third is blockInventory etc)
			 * */
			org.bukkit.inventory.Inventory inv = Bukkit.createInventory(null, 54, "MobCreator");
			new Inventory(inv);
			setType(type);
			List<String> lore = new ArrayList<String>();
			lore.add("Events");
			setOrder(0);
			int order = getOrder()*54+4000;
			inv.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore,"New mob",1,order));
			return inv;
		case ITEM_INVENTORY:
			org.bukkit.inventory.Inventory inv1 = Bukkit.createInventory(null, 54, "ItemSmith");
			setType(type);
			List<String> lore1 = new ArrayList<String>();
			lore1.add("");
			setOrder(1);
			int order1 = getOrder()*54+4000;
			inv1.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore1,"New item",1,order1));
			return inv1;
		case BLOCK_INVENTORY:
			org.bukkit.inventory.Inventory inv2 = Bukkit.createInventory(null, 54, "BlockBuilder");
			setType(type);
			List<String> lore2 = new ArrayList<String>();
			lore2.add("");
			setOrder(2);
			int order2 = getOrder()*54+4000;
			inv2.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore2,"",1,order2));
			return inv2;
		case MOB_PARTS:
			org.bukkit.inventory.Inventory inv3 = Bukkit.createInventory(null, 54, "PartList");
			setType(type);
			List<String> lore3 = new ArrayList<String>();
			lore3.add("");
			setOrder(3);
			int order3 = getOrder()*54+4000;
			inv3.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore3,"Build a mob",1,order3));
			return inv3;
		case COMMAND_INTERFACE:
			org.bukkit.inventory.Inventory inv4 = Bukkit.createInventory(null, 54, "CommandInterface");
			setType(type);
			List<String> lore4 = new ArrayList<String>();
			lore4.add("Events");
			setOrder(4);
			int order4 = getOrder()*54+4000;
			inv4.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore4,"Events",1,order4));
			return inv4;
			default:
				return null;
		}
	}
	
	/*public static int getOrder(org.bukkit.inventory.Inventory inv) {
		if(ORDER.get(inv) == null) return 0;
		return ORDER.get(inv);
	}
	
	public static void setOrder(org.bukkit.inventory.Inventory inv,int order) {
		ORDER.put(inv, order);
	}
	
	public static Type getType(org.bukkit.inventory.Inventory inv) {
		return INVENTORY_TYPE.get(inv);
	}
	
	public static void setType(org.bukkit.inventory.Inventory inv,Type type) { 
		INVENTORY_TYPE.put(inv, type);
	}
	
	public static org.bukkit.inventory.Inventory newInventory(Type type) {
		switch(type) {
		case MOB_INVENTORY:*/
			/* Custom Model Data is determined by the inventory's order 
			 * (Inventory's order is stored as a value in a hash map named ORDER) and the items slot within the 
			 * inventory starting at 1 and increasing by 1 for each slot and the first item of any inventory
			 * is the inventory's number (Starting at 0) * 54 + 4000
			 * for example the first item of the second inventory is 4055 and the second item of the third
			 * inventory is 4110 and the first item of the fourth inventory is 4163 etc
			 * (The first inventory is mobInventory the second is itemInventory the third is blockInventory etc)
			 * */
			/*org.bukkit.inventory.Inventory inv = Bukkit.createInventory(null, 54, "MobCreator");
			setType(inv,type);
			List<String> lore = new ArrayList<String>();
			lore.add("Events");
			setOrder(inv,0);
			int order = getOrder(inv)*54+4000;
			inv.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore,"New mob",1,order));
			return inv;
		case ITEM_INVENTORY:
			org.bukkit.inventory.Inventory inv1 = Bukkit.createInventory(null, 54, "ItemSmith");
			setType(inv1,type);
			List<String> lore1 = new ArrayList<String>();
			lore1.add("");
			setOrder(inv1,1);
			int order1 = getOrder(inv1)*54+4000;
			inv1.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore1,"New item",1,order1));
			return inv1;
		case BLOCK_INVENTORY:
			org.bukkit.inventory.Inventory inv2 = Bukkit.createInventory(null, 54, "BlockBuilder");
			setType(inv2,type);
			List<String> lore2 = new ArrayList<String>();
			lore2.add("");
			setOrder(inv2,2);
			int order2 = getOrder(inv2)*54+4000;
			inv2.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore2,"",1,order2));
			return inv2;
		case MOB_PARTS:
			org.bukkit.inventory.Inventory inv3 = Bukkit.createInventory(null, 54, "PartList");
			setType(inv3,type);
			List<String> lore3 = new ArrayList<String>();
			lore3.add("");
			setOrder(inv3,3);
			int order3 = getOrder(inv3)*54+4000;
			inv3.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore3,"Build a mob",1,order3));
			return inv3;
		case COMMAND_INTERFACE:
			org.bukkit.inventory.Inventory inv4 = Bukkit.createInventory(null, 54, "CommandInterface");
			setType(inv4,type);
			List<String> lore4 = new ArrayList<String>();
			lore4.add("Events");
			setOrder(inv4,4);
			int order4 = getOrder(inv4)*54+4000;
			inv4.addItem(new MagicStack(Material.ACACIA_PRESSURE_PLATE,lore4,"Events",1,order4));
			return inv4;
			default:
				return null;
		}
	}*/
	
	public static enum Type {
		MOB_INVENTORY,
		ITEM_INVENTORY,
		BLOCK_INVENTORY,
		MOB_PARTS,
		COMMAND_INTERFACE,
	}
	
}
