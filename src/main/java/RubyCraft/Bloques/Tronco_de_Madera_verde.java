package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Tronco_de_Madera_verde extends Block {

	public Tronco_de_Madera_verde() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.TRONCO_VERDE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.TRONCO_VERDE.getRegistryName());
		
		this.setHardness(2.5F).setHarvestLevel("axe", 0);
	    this.setSoundType(SoundType.WOOD);
		
	}

}
