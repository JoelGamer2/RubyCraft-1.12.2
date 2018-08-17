package RubyCraft.Biomas.Biomass;

import java.awt.Color;

import org.apache.http.client.CredentialsProvider;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomaZafiro extends Biome {

	public static int color = 123;
	
	public BiomaZafiro() {
		//para lo del agua https://www.mathsisfun.com/hexadecimal-decimal-colors.html
		super(new BiomeProperties("Bioma de Zafiro").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setWaterColor(color).setRainDisabled());
		
	    this.spawnableMonsterList.clear();
	    this.spawnableCaveCreatureList.clear();
	    this.spawnableCreatureList.clear();
	    this.spawnableWaterCreatureList.clear();
	    
	    this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 69, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 100, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 100, 2, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityPigZombie.class, 100, 1, 2));


		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 100, 2, 3));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 100, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 100, 3, 3));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 100, 2, 3));


		
		this.decorator.flowersPerChunk = 5;
	
		
	
		
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float temp)
	{
	return color;
	}
	
	
	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return color;
	}
}
