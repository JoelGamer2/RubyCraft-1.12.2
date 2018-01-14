package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Referencia;
import RubyCraft.Bases.Gravedad;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class polvo_de_cemento_azul extends Block{


	public polvo_de_cemento_azul() {
		super(Material.SAND);
	
		
		setUnlocalizedName(Referencia.RubyCraftBloques.POLVO_DE_CEMENTO_AZUL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.POLVO_DE_CEMENTO_AZUL.getRegistryName());
		
		setSoundType(SoundType.SAND);
		setHardness(1.0F);
		
	}
	
	
}
