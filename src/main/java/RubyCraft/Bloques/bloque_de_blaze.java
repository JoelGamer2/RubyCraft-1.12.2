package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_blaze extends Block {

	public bloque_de_blaze() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_BLAZE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_BLAZE.getRegistryName());
		this.setHardness(1.0F).setHarvestLevel("pickaxe", 1);
		this.setSoundType(SoundType.GLASS).setLightLevel(299999999999999999999999999999999999999.0F);
	
	}

}
