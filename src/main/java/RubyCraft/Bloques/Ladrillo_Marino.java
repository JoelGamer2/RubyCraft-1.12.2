package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ladrillo_Marino extends Block {

	public Ladrillo_Marino() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_MARINO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_MARINO.getRegistryName());
		
		
		this.setHardness(1.0F).setHarvestLevel("pickaxe", 1);
		this.setSoundType(SoundType.STONE);
		
	}

}
