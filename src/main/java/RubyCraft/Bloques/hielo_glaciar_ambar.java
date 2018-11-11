package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class hielo_glaciar_ambar extends Block {

	public hielo_glaciar_ambar() {
		super(Material.ICE);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.HIELO_GLACIAR_AMBAR.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.HIELO_GLACIAR_AMBAR.getUnlocalizedName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
