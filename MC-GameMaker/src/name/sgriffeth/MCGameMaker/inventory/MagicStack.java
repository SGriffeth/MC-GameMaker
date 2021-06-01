package name.sgriffeth.MCGameMaker.inventory;

import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MagicStack extends ItemStack {
	
	/*
	 * A hash map to check if a item is a mob part
	 */
	private final static HashMap<ItemStack,Boolean> IS_MOB_PART = new HashMap<ItemStack,Boolean>();
	/*
	 * Assigns to each item from this plugin a integer.
	 * I am using a hash map instead of CustomModelData so
	 * that this plugin doesn't interfere with other plugins
	 */
	private final static HashMap<ItemStack,Integer> CUSTOM_MODEL_DATA = new HashMap<ItemStack,Integer>();
	
	public MagicStack(ItemStack item) {
		//Problem must be here
		super(item);
		CUSTOM_MODEL_DATA.put(this, this.getCustomModelData());
		/*ItemMeta im = item.getItemMeta();
		if(item.hasItemMeta())
			if(im.hasCustomModelData())
				this.setCustomModelData(im.getCustomModelData());
		this.setMobPart(this.isMobPart());*/
	}
	
	public MagicStack(Material m,int amount,int data) {
		super(m,amount);
		ItemMeta im = this.getItemMeta();
		if(im != null) {
			im.setCustomModelData(data);
			CUSTOM_MODEL_DATA.put(this, data);
			List<String> lore = im.getLore();
			lore.add(ChatColor.WHITE + "CustomModelData : " + ChatColor.RED + data);
			im.setLore(lore);
			this.setItemMeta(im);
		}
	}
	
	public MagicStack(Material m,List<String> lore,int amount,int data) {
		super(m,amount);
		ItemMeta im = this.getItemMeta();
		if(im != null) {
			im.setCustomModelData(data);
			CUSTOM_MODEL_DATA.put(this, data);
			lore.add(ChatColor.WHITE + "CustomModelData : " + ChatColor.RED + data);
			im.setLore(lore);
			this.setItemMeta(im);
		}
	}
	
	public MagicStack(Material m,List<String> lore,String name,int amount,int data) {
		super(m,amount);
		ItemMeta im = this.getItemMeta();
		if(im != null) {
			im.setCustomModelData(data);
			CUSTOM_MODEL_DATA.put(this, data);
			lore.add(ChatColor.WHITE + "CustomModelData : " + ChatColor.RED + data);
			im.setLore(lore);
			im.setDisplayName(name);
			this.setItemMeta(im);
		}
		/*ItemMeta im = this.getItemMeta();
		if(im != null) {
			this.setCustomModelData(data);
			if(lore != null) {
				lore.add(ChatColor.WHITE + "CustomModelData : " + ChatColor.RED + data);
				im.setLore(lore);
			}
			im.setDisplayName(name);
			this.setItemMeta(im);
		}*/
	}
	
	public boolean hasCustomModelData() {
		if(this.getItemMeta() != null) {
			if(this.getItemMeta().hasCustomModelData()) {
				return true;
			}
		}
		return false;
	}
	
	public int getCustomModelData() {
		if(this.hasCustomModelData()) {
			return this.getItemMeta().getCustomModelData();
		}
		return 0;
	}
	
	public void setCustomModelData(int data) {
		CUSTOM_MODEL_DATA.put(this, data);
		this.getItemMeta().setCustomModelData(data);
	}
	
	public boolean isMobPart() {
		if(IS_MOB_PART.get(this) == null) return false;
		if(IS_MOB_PART.get(this) == true) {
			return true;
		}
		return false;
	}
	
	public void setMobPart() {
		IS_MOB_PART.put(this, true);
	}
	
	public void setMobPart(boolean bool) {
		IS_MOB_PART.put(this, bool);
	}
	
}
