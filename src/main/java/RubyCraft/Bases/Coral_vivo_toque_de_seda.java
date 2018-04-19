package RubyCraft.Bases;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class Coral_vivo_toque_de_seda extends Block{

	public Coral_vivo_toque_de_seda(Material material) {
		super(material);
	}

	
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 0;
	}
	@Override
	protected boolean canSilkHarvest() {
		// TODO Auto-generated method stub
		return true;
	}
}
