package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Bloque_con_Faro extends Block {

	public Bloque_con_Faro(Material material) {
		super(material);
		
		
	}
	 public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
		    
		 return true;
		 
	    }
	
}
