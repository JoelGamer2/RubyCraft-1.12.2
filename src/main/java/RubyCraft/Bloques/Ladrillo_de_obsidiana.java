package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ladrillo_de_obsidiana extends Block {

	public Ladrillo_de_obsidiana() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DE_OBSIDIANA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DE_OBSIDIANA.getRegistryName());
		
		this.setHardness(30.0F).setHarvestLevel("pickaxe", 3);
		this.setSoundType(SoundType.STONE);
		
	}

}
