package RubyCraft.TileEntity;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

public class TileEntityMinero extends TileEntity implements ITickable {

	public int x, y, z, tick;
	boolean iniciado = false;
	private static int cooldown = 40;
	
	@Override
	public void update() {
		if(!iniciado) {
			inicia();
		}
			tick++;
			if(tick == cooldown) {
				tick = 0;
				if(y > 10) {
				execute();
				}
			}
		}
		
	
	private void execute() {
		int index = 0;
		Block[] blocksRemoved= new Block[9];
		for(int x=0; x < 3; x++) {
			for(int z = 0; z < 3; z++) {
				BlockPos posToBreak = new BlockPos(this.x + x, this.y, this.z + z);
				blocksRemoved[index] = this.world.getBlockState(posToBreak).getBlock();
				world.setBlockToAir(posToBreak);
				index++;
			}
		}
		for(Block block : blocksRemoved) {
			if(!world.isRemote) 
			InventoryHelper.spawnItemStack(world, this.x + 1, this.pos.getY() + 2, this.z + 1, new ItemStack(block));
			
			
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

