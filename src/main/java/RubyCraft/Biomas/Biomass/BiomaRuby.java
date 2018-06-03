package RubyCraft.Biomas.Biomass;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGeneratorHell;
import net.minecraft.world.gen.ChunkGeneratorOverworld;

public class BiomaRuby extends Biome {

	public BiomaRuby() {
		super(new BiomeProperties("BiomaRuby").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setWaterColor(16711680));
		
	
		this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 69, 1, 5));
		
	}

	
	
}
