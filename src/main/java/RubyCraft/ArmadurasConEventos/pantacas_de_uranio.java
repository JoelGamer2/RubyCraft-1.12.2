package RubyCraft.ArmadurasConEventos;

import RubyCraft.Referencia;
import RubyCraft.Iniciar.Armaduras;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class pantacas_de_uranio extends ItemArmor {
	
	public static boolean Puesto = false;
	public pantacas_de_uranio(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Referencia.MOD_ID, unlocalizedName));	
	}

	 public static void Iniciar(EntityPlayer player, World world) {
	        ItemStack casco = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	        ItemStack pechera = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
	        ItemStack pantacas = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
	        ItemStack botas = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  

	            if (casco.getItem() == Armaduras.casco_de_uranio && pechera.getItem() == Armaduras.pechera_de_uranio && pantacas.getItem() == Armaduras.pantacas_de_uranio && botas.getItem() == Armaduras.botas_de_uranio) {	                 	            		
	            	Puesto = true;
	            }
	        }
	   
	 
	 @Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		 Iniciar(player, world);
		
	}
	
}
