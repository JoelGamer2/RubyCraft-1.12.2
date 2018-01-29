package RubyCraft.Bases;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemSinUsoNingunoEnEstaVersion extends Item {

	public ItemSinUsoNingunoEnEstaVersion() {
		
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.RED + "Este item no tiene utilidad ninguna solo es de creativo por el momento                        ");
		tooltip.add(TextFormatting.RED + "This Item doesnt Have any utility is only creative mode for the moment");
	}
	
}
