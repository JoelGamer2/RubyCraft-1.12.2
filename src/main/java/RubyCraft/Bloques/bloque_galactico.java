package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.BloqueSinUsoEnEstaVersion;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class bloque_galactico extends BloqueSinUsoEnEstaVersion {

	public bloque_galactico() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_GALACTICO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_GALACTICO.getRegistryName());
		
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);
		
	}

	 public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
		    
		 return true;
		 
	    }
	
}
