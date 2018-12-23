package RubyCraft.ArmadurasConEventos;

import java.util.List;

import RubyCraft.Referencia;
import RubyCraft.Iniciar.Armaduras;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class casco_de_tortuga extends ItemArmor {
	
	public static boolean Colocar = false;
	public static boolean lloviendo = false;
	public static boolean soleado = false;
	public static boolean truenos = false;
	
	
	public casco_de_tortuga(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Referencia.MOD_ID, unlocalizedName));
		
	}

	
	 public static void onArmorTick(EntityPlayer player, World world) {
	        ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);  
	            if (head.getItem() == Armaduras.casco_de_tortuga) {	                 	            		
	            		           
	            	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(13),200, 255));
	            	 
	            	 if(world.isRaining() && !world.isThundering()) {
		            	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(5),50, 1));
                         soleado = false;
                         truenos = false;
                         lloviendo = true;
	            	 } if(world.isThundering()) {
	            		 
	            		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 50, 2));
	            		soleado = false;
                        truenos = true;
                        lloviendo = false;
	            	 }
	            	 if(!world.isRaining() && !world.isThundering()) {
	            		 soleado = true;
                         truenos = false;
                         lloviendo = false;
	            	 }
	              }
	        }
	   
	 
	 @Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	
		 onArmorTick(player, world);
	}
	
	 @Override
		public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			 tooltip.add(TextFormatting.GREEN + "Bienvenidos al Tiempo");
			 if(soleado) {
				 tooltip.add(TextFormatting.LIGHT_PURPLE + "El tiempo para hoy es:" + TextFormatting.GOLD + " Soleado");
			 }else if(lloviendo) {
				 tooltip.add(TextFormatting.LIGHT_PURPLE + "El tiempo para hoy es:" + TextFormatting.BLUE + " Lloviendo");
			 }else if(truenos) {
				 tooltip.add(TextFormatting.LIGHT_PURPLE + "El tiempo para hoy es:" + TextFormatting.AQUA + " tormenta");
			 }
		}
	 
}
