package RubyCraft.Maquinas;

import RubyCraft.Referencia;
import RubyCraft.Bases.BloqueSinUsoEnEstaVersion;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Dimensiones;
import RubyCraft.Iniciar.RItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class mesa_de_conjuraciones extends BloqueSinUsoEnEstaVersion {

	public ItemStack stack;
	
	public mesa_de_conjuraciones() {
		super(Material.ROCK);

	   setUnlocalizedName(Referencia.RubyCraftBloques.MESA_DE_CONJURACIONES.getUnlocalizedName());
	   setRegistryName(Referencia.RubyCraftBloques.MESA_DE_CONJURACIONES.getRegistryName());
	   
	   
	   setHardness(1.5F).setResistance(20.0F);
	   setHarvestLevel("pickaxe", 2);
		
	}

	 public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float x, float y, float z){
		 player.changeDimension(Dimensiones.iddimensionruby);
		 return true;

		/** if(!player.isSneaking()){
			 if(player.inventory.hasItemStack(new ItemStack(RItems.ruby, 1))){
				//Registros.removeItem(player, new ItemStack(RItems.ruby, 1));
				 SonidoHechizo(world, player, pos);
			 }else{
				 SonidoError(world, player, pos);
			 }
		 }
	        return true;
	    }
	
	 public static void SonidoHechizo(World world, EntityPlayer player, BlockPos pos){
		 world.playSound(player, pos, RubyCraftSoundhandler.mesa_de_conjuraciones_hechizo, SoundCategory.BLOCKS, 1.0F, 1.0F);
	 }
	 
	 public static void SonidoError(World world, EntityPlayer player, BlockPos pos){
		 world.playSound(player, pos, RubyCraftSoundhandler.mesa_de_conjuraciones_error, SoundCategory.BLOCKS, 1.0F, 1.0F);**/
	 }
	 
}
