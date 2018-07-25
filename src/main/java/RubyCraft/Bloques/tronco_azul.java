package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class tronco_azul extends Block {

	public tronco_azul() {
		super(Material.WOOD);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.TRONCO_AZUL.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.TRONCO_AZUL.getRegistryName());
		
		this.setHarvestLevel("axe", 1);
		this.setHardness(10.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.WOOD);
	}

}
