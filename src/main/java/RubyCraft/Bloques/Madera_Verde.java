package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Madera_Verde extends Block {

	public Madera_Verde() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MADERA_VERDE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MADERA_VERDE.getRegistryName());
		
		this.setHardness(2.0F).setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.WOOD);
	}

}
