package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import RubyCraft.RubyCraft;
import RubyCraft.Referencia;

public class Bloque_de_azucar extends Block {

	public Bloque_de_azucar() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_AZUCAR.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_AZUCAR.getRegistryName());
		
		this.setHardness(0.8F);
		this.setSoundType(SoundType.CLOTH);
	}

}
