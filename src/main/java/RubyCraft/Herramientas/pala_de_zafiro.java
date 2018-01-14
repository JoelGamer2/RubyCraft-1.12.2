package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class pala_de_zafiro extends ItemSpade {

	public pala_de_zafiro(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.PALA_DE_ZAFIRO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.PALA_DE_ZAFIRO.getRegistryName());
		
		
	}
	
}
