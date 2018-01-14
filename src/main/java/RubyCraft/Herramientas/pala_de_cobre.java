package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class pala_de_cobre extends ItemSpade {

	public pala_de_cobre(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.PALA_DE_COBRE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.PALA_DE_COBRE.getRegistryName());
		
		
	}
	
}
