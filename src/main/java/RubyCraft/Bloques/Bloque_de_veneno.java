package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Bloque_de_veneno extends Block {

	public Bloque_de_veneno() {
		super(Material.ROCK);
	
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_VENENO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_VENENO.getRegistryName());
		
		this.setHardness(0.5F).setHarvestLevel("pickaxe", 1);
		
	}

	 /**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entity){
    
    	if(entity instanceof EntityLivingBase){
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 10));
		}
    	
    }
	
}
