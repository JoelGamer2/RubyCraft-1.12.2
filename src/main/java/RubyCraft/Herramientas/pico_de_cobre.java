package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import net.minecraft.item.ItemPickaxe;

public class pico_de_cobre extends ItemPickaxe {

	public pico_de_cobre(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.PICO_DE_COBRE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.PICO_DE_COBRE.getRegistryName());
		
		
	}
	
}
