package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.Item;

public class molde_para_cofres extends Item {

	public molde_para_cofres(){
		
		setUnlocalizedName(Referencia.RubyCraftItems.MODE_PARA_COFRES.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.MODE_PARA_COFRES.getRegistryName());
		
		setMaxStackSize(2);
		
	}
	
}
