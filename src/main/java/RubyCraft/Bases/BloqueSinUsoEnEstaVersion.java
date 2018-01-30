package RubyCraft.Bases;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BloqueSinUsoEnEstaVersion extends Block {

	public BloqueSinUsoEnEstaVersion(Material material) {
		super(material);
		
		
		
	}
	 
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		
		tooltip.add(TextFormatting.RED + "En esta Version este Bloque no tiene Utilidad Ninguna o esta lleno de errores No se pueden conseguir en survival solo es de creativo por el momento");
		tooltip.add(TextFormatting.RED + "In this Version this block I don't have utility or is very buggy. It can't craft in survival mode is only creative mode for the moment");

	}
	
}
