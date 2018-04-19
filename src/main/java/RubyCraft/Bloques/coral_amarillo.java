package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Coral_vivo_toque_de_seda;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class coral_amarillo extends Coral_vivo_toque_de_seda {
	
	
	public coral_amarillo() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CORAL_AMARILLO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CORAL_AMARILLO.getRegistryName());
		
		setHardness(1.5F);
		setResistance(2.0F);
		setTickRandomly(true);
	
	}

	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		
		super.onBlockAdded(world, pos, state);
		if(!(world.getBlockState(pos.north()).getBlock() == Blocks.WATER)) {
			if(!(world.getBlockState(pos.south()).getBlock() == Blocks.WATER)) {
				if(!(world.getBlockState(pos.east()).getBlock() == Blocks.WATER)) {
					if(!(world.getBlockState(pos.west()).getBlock() == Blocks.WATER)) {
						if(!(world.getBlockState(pos.up()).getBlock() == Blocks.WATER)) {
							if(!(world.getBlockState(pos.down()).getBlock() == Blocks.WATER)) {
						
								
								if(!(world.getBlockState(pos.north()).getBlock() == Blocks.FLOWING_WATER)) {
									if(!(world.getBlockState(pos.south()).getBlock() == Blocks.FLOWING_WATER)) {
										if(!(world.getBlockState(pos.east()).getBlock() == Blocks.FLOWING_WATER)) {
											if(!(world.getBlockState(pos.west()).getBlock() == Blocks.FLOWING_WATER)) {
												if(!(world.getBlockState(pos.up()).getBlock() == Blocks.FLOWING_WATER)) {
													if(!(world.getBlockState(pos.down()).getBlock() == Blocks.FLOWING_WATER)) {
								
					                                     world.setBlockState(pos, Bloques.coral_amarillo_muerto.getDefaultState(), 2);
						    	   }
					        	}
				    	      }
		 	     	       }
		     	      }
		        }
	        }
         } 
       }
     }
   }
 }
		
	}
	
	
	
	@Override
	  public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
		if(!(world.getBlockState(pos.north()).getBlock() == Blocks.WATER)) {
			if(!(world.getBlockState(pos.south()).getBlock() == Blocks.WATER)) {
				if(!(world.getBlockState(pos.east()).getBlock() == Blocks.WATER)) {
					if(!(world.getBlockState(pos.west()).getBlock() == Blocks.WATER)) {
						if(!(world.getBlockState(pos.up()).getBlock() == Blocks.WATER)) {
							if(!(world.getBlockState(pos.down()).getBlock() == Blocks.WATER)) {
						
								
								if(!(world.getBlockState(pos.north()).getBlock() == Blocks.FLOWING_WATER)) {
									if(!(world.getBlockState(pos.south()).getBlock() == Blocks.FLOWING_WATER)) {
										if(!(world.getBlockState(pos.east()).getBlock() == Blocks.FLOWING_WATER)) {
											if(!(world.getBlockState(pos.west()).getBlock() == Blocks.FLOWING_WATER)) {
												if(!(world.getBlockState(pos.up()).getBlock() == Blocks.FLOWING_WATER)) {
													if(!(world.getBlockState(pos.down()).getBlock() == Blocks.FLOWING_WATER)) {
								
					    world.setBlockState(pos, Bloques.coral_amarillo_muerto.getDefaultState(), 2);
						    	   }
					        	}
				    	      }
		 	     	       }
		     	      }
		        }
	        }
         } 
       }
     }
   }
 }
		
	}
	
	
	
	
	  /**
     * How many world ticks before ticking
     */
    public int tickRate(World worldIn)
    {
        return 2;
    }
    
}
