package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Control_de_Version;
import RubyCraft.Referencia;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class bloque_de_actualizaciones extends Block {

	
	/**Addons Can Modify
	   Addons puede modificar **/
	public static String UltimaVersion = "";
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";
	/**Addons can not Modify
	   Addons no pueden Modificar
	 **/
	public static int actualizacion = 0;
	
	public bloque_de_actualizaciones() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_ACTUALIZACIONES.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_ACTUALIZACIONES.getRegistryName());
		
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 1);
		setTickRandomly(true);
	}

	
	 public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float x, float y, float z){
		if (!player.isSneaking()){
		 
			if(!Referencia.VERSION.equals(UltimaVersion) && !Control_de_Version.Version_de_desarrollador){
				
				Buscar_Actualizaciones.MirarActualizaciones();
				actualizacion = 15;
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Hay Una Nueva Version Disponible: " + TextFormatting.RED + UltimaVersion));
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje1));
				if(Mensaje2a == true){
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje2));
				}if(Mensaje3a == true){
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje3));
				
				}
				
			}else if(Control_de_Version.Version_de_desarrollador) {
				
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Cuidado esta es la DeveloperBuild " + TextFormatting.GOLD + "puede ocurrir muchos bugs Version: " + TextFormatting.RED + Referencia.VERSION + TextFormatting.RED + " INDEV"));
			
			  }else if(Referencia.VERSION.equals(UltimaVersion) && !Control_de_Version.Version_de_desarrollador){
				
				Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Estas en la Version:" + TextFormatting.GREEN + Referencia.VERSION + TextFormatting.GOLD + " La Ultima " + TextFormatting.GOLD + "Version es la:" + TextFormatting.RED + UltimaVersion));
				Buscar_Actualizaciones.MirarActualizaciones();
			}
			
			
		}
		return true;
	
	}
	
	
	 /**
     * How many world ticks before ticking
     */
    public int tickRate(World p_149738_1_)
    {
        return 4;
    }

	
	  /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if (!world.isRemote)
        {
        hasComparatorInputOverride(state);
        }
    }
	
   
	  /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride(IBlockState state)
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(IBlockState state, World worldIn, BlockPos pos)
    {
    	return actualizacion;
    }
	
	
}
