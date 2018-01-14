package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import RubyCraft.RubyCraft;

public class Tronco_Azul extends Block {

	public Tronco_Azul() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.TRONCO_AZUL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.TRONCO_AZUL.getRegistryName());
		
		this.setHardness(2.5F).setHarvestLevel("axe", 0);
		this.setSoundType(SoundType.WOOD);
		
	}

}
