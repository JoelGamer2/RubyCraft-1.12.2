package RubyCraft.Bases;

import java.util.Random;

import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Coral_vivo_toque_de_seda extends Block{

	public Coral_vivo_toque_de_seda(Material material) {
		super(material);
	}

	
	
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}
	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}
