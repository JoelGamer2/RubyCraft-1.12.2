package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.ItemFood;

public class huevo_frito extends ItemFood {

	public huevo_frito(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Referencia.RubyCraftItems.HUEVO_FRITO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.HUEVO_FRITO.getRegistryName());
		
	}
	
}
