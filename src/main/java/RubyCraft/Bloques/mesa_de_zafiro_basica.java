package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.BloqueSinUsoEnEstaVersion;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class mesa_de_zafiro_basica extends BloqueSinUsoEnEstaVersion {

	public mesa_de_zafiro_basica() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MESA_DE_ZAFIRO_BASICA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MESA_DE_ZAFIRO_BASICA.getRegistryName());
		
		setHardness(0.3F);
		setResistance(2.0F);
		setSoundType(SoundType.WOOD);
		
	}

}
