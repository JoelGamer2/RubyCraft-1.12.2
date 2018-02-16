package RubyCraft.ArmadurasConEventosRaros;

import RubyCraft.Referencia;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Armaduras;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.fixes.PotionWater;
import net.minecraft.world.World;

public class casco_de_tortuga extends ItemArmor {
	
	public static boolean Colocar = false;
	
	public casco_de_tortuga(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Referencia.MOD_ID, unlocalizedName));
		
	}

	
	 public static void onArmorTick(EntityPlayer player, World world) {
	        ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);  
	            if (head.getItem() == Armaduras.casco_de_tortuga) {	                 	            		
	            		            	
	            	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(13),200, 255));
	            	 
	              }
	        }
	  
	 
	 
	 @Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	
		 onArmorTick(player, world);
	}
	
	 
	
}
