package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.BloqueSinUsoEnEstaVersion;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_cobre extends Bloque_con_Faro{

	public bloque_de_cobre() {
		super(Material.IRON);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_COBRE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_COBRE.getRegistryName());
		
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setHarvestLevel("pickaxe",1);
		
	}

}
