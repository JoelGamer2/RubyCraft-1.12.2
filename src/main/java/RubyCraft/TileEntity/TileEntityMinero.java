package RubyCraft.TileEntity;

import RubyCraft.RubyCraft;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

public class TileEntityMinero extends TileEntity implements ITickable {

	public int x, y, z, tick;
	boolean iniciado = false;
	private static int cooldown = 100;
	private static int altura_a_parar = 6;
	public static int radio = 3;
	
	@Override
	public void update() {
		
		
		
		if(world.getBlockState(pos.north()).getBlock() == Bloques.bloque_de_ruby) {
			TileEntityMinero.radio = 6;
			cooldown = 50;
		}else if(world.getBlockState(pos.north()).getBlock() == Bloques.Bloque_de_Zafiro) {
			TileEntityMinero.radio = 12;
			cooldown = 25;
		}else{
			TileEntityMinero.radio = 3;
			cooldown = 100;
		}
		
		if(!iniciado) {
			inicia();
		}
			tick++;
			if(tick == cooldown) {
				tick = 0;
				if(y > altura_a_parar - 1) {
				execute();
				}
			}
		}
		
	
	private void execute() {
		int index = 0;
		Block[] blocksRemoved= new Block[radio*radio];
		
		for(int x=0; x < radio; x++) {
			for(int z = 0; z < radio; z++) {
				BlockPos posToBreak = new BlockPos(this.x + x, this.y, this.z + z);				
				blocksRemoved[index] = this.world.getBlockState(posToBreak).getBlock();
				world.setBlockToAir(posToBreak);
				index++;		
				
		      }
		}
		for(Block block : blocksRemoved) {
			if(!world.isRemote) { 
				
				 InventoryHelper.spawnItemStack(world, this.x + 1, this.pos.getY() + 2, this.z + 1, new ItemStack(block));


				
				
			 }
			
		}
	
		this.y--;
	}
	
	private void inicia() {
		iniciado = true;
		x = this.pos.getX() - 1;
		y = this.pos.getY() - 1;
		z = this.pos.getZ() - 1;
		tick = 0;
	}

	
}

