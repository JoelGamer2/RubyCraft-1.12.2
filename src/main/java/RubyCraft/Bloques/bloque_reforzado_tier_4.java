package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_reforzado_tier_4 extends Block {

	public bloque_reforzado_tier_4() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_IV.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_IV.getRegistryName());
		
		setHardness(100.0F);
		setResistance(200.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.METAL);	
		
	}

	
}
