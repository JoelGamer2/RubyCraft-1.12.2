package RubyCraft.Dimensiones;

import RubyCraft.Biomas.IniciarBiomas;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensiondeRuby extends WorldProvider {

	public void DimensondeRuby() {
		
		this.biomeProvider = new BiomeProviderSingle(IniciarBiomas.RubyBioma);
		
	}
	
	@Override
	public DimensionType getDimensionType() {
		return Dimensiones.RUBY;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorRuby(world, false, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
	
	@Override
	public float getCloudHeight() {
		return Float.MAX_VALUE;
	}
	
}
