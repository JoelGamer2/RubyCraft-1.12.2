package RubyCraft.Biomas.Biomass;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomaRuby extends Biome {

	public static int color = 16711680;
	
	public BiomaRuby() {
		//para lo del agua https://www.mathsisfun.com/hexadecimal-decimal-colors.html
		super(new BiomeProperties("Bioma de Ruby").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setWaterColor(color).setRainDisabled());
		
	    this.spawnableMonsterList.clear();
	    this.spawnableCaveCreatureList.clear();
	    this.spawnableCreatureList.clear();
	    this.spawnableWaterCreatureList.clear();
	    
		this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 69, 1, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 100, 3, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 100, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 100, 3, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 100, 1, 1));


		
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 100, 4, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 100, 5, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 100, 3, 3));



		
		this.decorator.bigMushroomsPerChunk = 4;
		
		
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
