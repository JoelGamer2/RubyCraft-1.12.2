package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent.PotionShiftEvent;

public class Bloque_de_Regeneracion extends Block {
	
	public Bloque_de_Regeneracion() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_REGERENACION.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_REGERENACION.getRegistryName());
		
		this.setHardness(0.5F);
		this.setHarvestLevel("pickaxe", 1);
	
		
	}
	 /**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entity){
    
    	if(entity instanceof EntityLivingBase){
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.getPotionById(10), 200, 10));
		}
    	
    }
	
}
