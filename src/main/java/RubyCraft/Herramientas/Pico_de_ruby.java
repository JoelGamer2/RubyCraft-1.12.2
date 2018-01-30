package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import net.minecraft.item.ItemPickaxe;

public class Pico_de_ruby extends ItemPickaxe {

	public Pico_de_ruby(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.PICO_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.PICO_DE_RUBY.getRegistryName());
		
		
	}
	
}
