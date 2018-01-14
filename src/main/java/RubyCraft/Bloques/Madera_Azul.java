package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import RubyCraft.RubyCraft;

public class Madera_Azul extends Block {

	public Madera_Azul() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MADERA_AZUL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MADERA_AZUL.getRegistryName());
		
		this.setHardness(2.0F).setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.WOOD);
	}

}
