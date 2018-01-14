package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Bloqueluminiscente extends Block {

	public Bloqueluminiscente() {
		super(Material.GLASS);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUELUMINISCENTE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUELUMINISCENTE.getRegistryName());
		
		this.setHardness(0.3F).setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.GLASS).setLightLevel(299999999999999999999999999999999999999.0F).setLightOpacity(0);
		
	}

}
