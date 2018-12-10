package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.Iniciar.Bloques;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenOverworld implements IWorldGenerator
{
	private WorldGenerator MenaRuby;
	
	
	private WorldGenerator MenaZafiro;

	
	
	public OreGenOverworld() 
	{
		MenaRuby = new WorldGenMinable(Bloques.mena_de_ruby.getDefaultState(), 6);
		
		MenaZafiro = new WorldGenMinable(Bloques.mena_de_zafiro.getDefaultState(), 4);
		
	}

	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(MenaRuby, world, rand, chunkX, chunkZ, 5, 1, 40);
			
			runGenerator(MenaZafiro, world, rand, chunkX, chunkZ, 5, 1, 20);
			
			break;
		
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
