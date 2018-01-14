package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class cristal_azul_claro extends Block {

	public cristal_azul_claro() {
		super(Material.GLASS);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CRISTAL_AZUL_CLARO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CRISTAL_AZUL_CLARO.getRegistryName());
		setHardness(1.2F);
		setSoundType(SoundType.GLASS);	
	}

	  /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 0;
    }

   public boolean isOpaqueCube(){
	return false;
  }
    public boolean isRenderAsNormal(){
	return false;
  }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
	
}
