package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class hielo_glaciar extends Block {

	public hielo_glaciar() {
		super(Material.ICE);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.HIELO_GLACIAR.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.HIELO_GLACIAR.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
