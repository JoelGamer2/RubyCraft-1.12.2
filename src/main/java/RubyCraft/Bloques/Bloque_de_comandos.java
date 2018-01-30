package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloque_de_comandos extends Block {

	public Bloque_de_comandos() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_COMANDOS.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_COMANDOS.getRegistryName());
		
		this.setBlockUnbreakable();
		
	}

}
