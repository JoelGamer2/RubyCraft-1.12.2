package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.Item;

public class pompa_de_imunidad extends Item {

	public pompa_de_imunidad() {
		
		setUnlocalizedName(Referencia.RubyCraftItems.POMPA_DE_IMUNIDAD.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.POMPA_DE_IMUNIDAD.getRegistryName());
		
		this.setMaxStackSize(1);
		this.setMaxDamage(100);
	}
	
}
