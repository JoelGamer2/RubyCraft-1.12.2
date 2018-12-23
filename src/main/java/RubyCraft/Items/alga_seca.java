package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.ItemFood;

public class alga_seca extends ItemFood {

	public alga_seca(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Referencia.RubyCraftItems.ALGA_SECA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.ALGA_SECA.getRegistryName());
		
	}
	
}
