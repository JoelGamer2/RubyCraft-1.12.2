package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class manzana_de_diamante extends ItemFood {

	public manzana_de_diamante(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Referencia.RubyCraftItems.MANZANA_DE_DIAMANTE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.MANZANA_DE_DIAMANTE.getRegistryName());
		
	}
	
	
 protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	 //Pocion,Tiempo,Amplificador
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),6000, 10)); //Velocidad
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(14),6000,1));//Invisibilodad
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(12),6000,1));//Resistancia al fuego
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),6000,255));//Vision nocturna
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(10),6000,255));//Regeneracion
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(5),6000,20)); //Fuerza
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(3),6000,10)); //Prisa al Picar
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(22),6000,255)); //Absorcion
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(21),6000,255)); //Mas Corazones
    	 
	
     }
 
}
