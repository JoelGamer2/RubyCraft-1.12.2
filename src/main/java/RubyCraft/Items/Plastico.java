package RubyCraft.Items;

import RubyCraft.Referencia;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.RItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class Plastico extends Item {
	public Plastico(){
		setUnlocalizedName(Referencia.RubyCraftItems.PLASTICO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.PLASTICO.getRegistryName());
		
		
	}

	 public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn){
	    
	        if(player.inventory.hasItemStack(new ItemStack(RItems.palo_verde, 1))){
	        	
                player.playSound(RubyCraftSoundhandler.cancion_sans, 10.0F, 1.0F);
	        	Particulas(world, player);
	        	
	        }else if(player.inventory.hasItemStack(new ItemStack(RItems.BoladeResina, 1))){
	        	
                player.playSound(RubyCraftSoundhandler.cancion_sans, 10.0F, 2.0F);
	        	Particulas(world, player);
	        	
	        }
	        
	        return new ActionResult(EnumActionResult.PASS, player.getHeldItem(handIn));

	    }
	
	 public static void Particulas(World world, EntityPlayer player){
		
		 
		    world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 2.0F, 1.0F, 6.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 3.0F, 1.0F, 5.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, -1.0F, 1.0F, 4.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, -2.0F, 1.0F, 3.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 4.0F, 1.0F, 2.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 5.0F, 1.0F, 1.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 6.0F, 1.0F, -2.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 7.0F, 1.0F, -1.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 8.0F, 1.0F, 1.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 9.0F, 1.0F, 2.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 10.0F, 1.0F, 3.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 2.0F, -1.0F, 6.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 3.0F, -2.0F, 5.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 1.0F, -3.0F, 4.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 4.0F, -4.0F, 3.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 5.0F, -5.0F, 2.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 6.0F, -6.0F, 1.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 1.0F, -1.0F, 1.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 2.0F, -2.0F, 2.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 3.0F, -3.0F, 3.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 4.0F, -4.0F, 4.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 5.0F, -5.0F, 5.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 6.0F, -6.0F, 6.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 7.0F, -1.0F, 7.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 8.0F, -2.0F, 8.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 9.0F, -3.0F, 9.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 10.0F, -4.0F, 10.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 11.0F, -5.0F, 11.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 11.0F, -1.0F, 13.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 15.0F, -3.0F, 14.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 17.0F, -4.0F, 15.0F);
			world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 18.0F, -5.0F, 16.0F);
		 
	 }
	 
}
