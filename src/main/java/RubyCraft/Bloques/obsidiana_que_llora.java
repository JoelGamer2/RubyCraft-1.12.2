package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class obsidiana_que_llora extends Block {

	public obsidiana_que_llora() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.OBSIDIANA_QUE_LLORA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.OBSIDIANA_QUE_LLORA.getRegistryName());
		
		setHardness(50.0F);
		setResistance(2000);
		setHarvestLevel("pickaxe", 3);
		
	}

}
