package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BloquedeEnderPearld extends Bloque_con_Faro {

	public BloquedeEnderPearld() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUEDEENDERPEARL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUEDEENDERPEARL.getRegistryName());
		
		setHardness(1.0F).setHarvestLevel("pickaxe", 1);
		
	}

}
