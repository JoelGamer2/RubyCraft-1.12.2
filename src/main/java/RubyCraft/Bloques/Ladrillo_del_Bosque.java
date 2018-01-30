package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ladrillo_del_Bosque extends Block {

	public Ladrillo_del_Bosque() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DEL_BOSQUE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DEL_BOSQUE.getRegistryName());
		
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 1);
		
	}

}
