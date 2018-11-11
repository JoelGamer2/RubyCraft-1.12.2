package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class madera_fosil_ambar extends Block {

	public madera_fosil_ambar() {
		super(Material.WOOD);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.MADERA_FOSIL_AMBAR.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.MADERA_FOSIL_AMBAR.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
