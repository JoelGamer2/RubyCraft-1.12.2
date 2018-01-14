package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ladrillo_de_andesita extends Block {

	public ladrillo_de_andesita( ) {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DE_ANDESITA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DE_ANDESITA.getRegistryName());
		
		setHardness(1.0F);

		
	}

}
