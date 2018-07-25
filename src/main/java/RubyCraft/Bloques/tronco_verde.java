package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class tronco_verde extends Block {

	public tronco_verde() {
		super(Material.WOOD);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.TRONCO_VERDE.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.TRONCO_VERDE.getRegistryName());
		
		this.setHarvestLevel("axe", 1);
		this.setHardness(10.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.WOOD);
	}

}
