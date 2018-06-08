package RubyCraft.Dimensiones;

import RubyCraft.Biomas.IniciarBiomas;
import RubyCraft.Iniciar.Dimensiones;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;

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
