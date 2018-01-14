package RubyCraft.Escaleras;

import RubyCraft.Referencia;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class escalera_de_andesita extends BlockStairs {

	public escalera_de_andesita(IBlockState modelState) {
		super(modelState);
		
		setUnlocalizedName(Referencia.RubyCraftEscaleras.ESCALERA_DE_ANDESITA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftEscaleras.ESCALERA_DE_ANDESITA.getRegistryName());
		
		setHardness(3.0F);
		setResistance(5.0F);
		useNeighborBrightness = true;
		
	}

}
