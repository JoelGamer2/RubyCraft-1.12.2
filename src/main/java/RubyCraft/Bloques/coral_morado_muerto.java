package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class coral_morado_muerto extends Block {

	public coral_morado_muerto() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CORAL_MORADO_MUERTO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CORAL_MORADO_MUERTO.getRegistryName());
		
		setHardness(1.5F);
		setResistance(2.0F);
	
	}

}
