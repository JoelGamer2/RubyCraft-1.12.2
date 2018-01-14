package RubyCraft.Bases;

import RubyCraft.Referencia;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ArmadurasBases extends ItemArmor {

	public ArmadurasBases(ArmorMaterial material, int render, EntityEquipmentSlot donde_se_equipa, String unlocalizedName) {
		super(material, render, donde_se_equipa);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Referencia.MOD_ID, unlocalizedName));
		
	}

}
