package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Bloque_de_uranio extends Block {

	public Bloque_de_uranio() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_URANIO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_URANIO.getRegistryName());
		
		this.setHardness(2.5F);
		this.setHarvestLevel("pickaxe", 1);
		this.setSoundType(SoundType.METAL);
		
	}
	 public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
		    
		 return true;
		 
	    }
	
}
