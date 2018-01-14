package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_platino extends Block {

	public bloque_de_platino() {
		super(Material.IRON);
	
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_PLATINO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_PLATINO.getRegistryName());
		
		setHardness(20.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.METAL);	
		
		
	}

}
