package RubyCraft.Biomas;

import RubyCraft.Biomas.Biomass.BiomaRuby;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class IniciarBiomas {

	public static final Biome RubyBioma = new BiomaRuby();
	
	public static void registarBiomas() {
		
		iniciarbioma(RubyBioma, "BiomaRuby", BiomeType.WARM, Type.HILLS, Type.DENSE, Type.FOREST);
		
	}
	
	private static Biome iniciarbioma(Biome biome, String name, BiomeType biometype, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biometype, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		
		return biome;
	}
	
}
