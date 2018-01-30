package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.ItemFood;

public class pan_de_calabaza extends ItemFood {

	public pan_de_calabaza(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Referencia.RubyCraftItems.PAN_DE_CALABAZA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.PAN_DE_CALABAZA.getRegistryName());
		
	}
	
}
