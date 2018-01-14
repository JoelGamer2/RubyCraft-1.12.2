package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ladrillo_de_granito extends Block {

	public ladrillo_de_granito() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DE_GRANITO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DE_GRANITO.getRegistryName());
		
		setHardness(1.0F);
		
	}

}
