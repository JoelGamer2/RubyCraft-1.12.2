package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class polvo_de_cemento_azul extends Block{


	public polvo_de_cemento_azul() {
		super(Material.SAND);
	
		
		setUnlocalizedName(Referencia.RubyCraftBloques.POLVO_DE_CEMENTO_AZUL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.POLVO_DE_CEMENTO_AZUL.getRegistryName());
		
		setSoundType(SoundType.SAND);
		setHardness(1.0F);
		
	}
	
	
}
