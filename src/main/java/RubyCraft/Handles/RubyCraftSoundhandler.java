package RubyCraft.Handles;

import RubyCraft.Referencia;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RubyCraftSoundhandler {

	
	public static SoundEvent mesa_de_conjuraciones_error;
	public static SoundEvent mesa_de_conjuraciones_hechizo;
	public static SoundEvent cancion_sans;
	public static SoundEvent actualiza;
	
	public static void Iniciar(){
		
		mesa_de_conjuraciones_error = registrar("block.mesa_de_conjuraciones_error");
		mesa_de_conjuraciones_hechizo = registrar("block.mesa_de_conjuraciones_hechizo");
		cancion_sans = registrar("record.cancion_sans");
		actualiza = registrar("random.actualiza");
	}
	public static SoundEvent registrar(String name){
		ResourceLocation location = new ResourceLocation(Referencia.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);
		e.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(e);
	
		
		return e;
	}

	
}
