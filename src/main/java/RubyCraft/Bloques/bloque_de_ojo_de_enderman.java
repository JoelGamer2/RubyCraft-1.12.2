package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class bloque_de_ojo_de_enderman extends Bloque_con_Faro {

	public bloque_de_ojo_de_enderman() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_OJO_DE_ENDERMAN.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_OJO_DE_ENDERMAN.getRegistryName());
		
		setHardness(1.0F).setHarvestLevel("pickaxe", 1);
		
	}


}
