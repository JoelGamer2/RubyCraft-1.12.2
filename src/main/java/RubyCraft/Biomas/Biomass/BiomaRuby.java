package RubyCraft.Biomas.Biomass;

import java.awt.Color;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomaRuby extends Biome {

	public static int color = 16711680;
	
	public BiomaRuby() {
		//para lo del agua https://www.mathsisfun.com/hexadecimal-decimal-colors.html
		super(new BiomeProperties("BiomaRuby").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setWaterColor(color).setRainDisabled());
		
	
		this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 69, 1, 5));
		
		
		
		
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
