package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ladrillo_de_diorita extends Block {

	public ladrillo_de_diorita() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DE_DIORITA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DE_DIORITA.getRegistryName());
		
		setHardness(1.0F);

	}

}
