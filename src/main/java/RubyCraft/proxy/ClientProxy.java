package RubyCraft.proxy;

import RubyCraft.RubyCraft;
import RubyCraft.Handles.GuiHandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Iniciar.RItems;
import net.minecraftforge.fml.common.network.NetworkRegistry;


public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		
		RItems.RegistrarRenders();
		Bloques.RegistarRenders();
	//	Escaleras.RegistrarRenderizado();
		Herramientas.RegistrarRenders();
		Armaduras.RegistrarRenders();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(RubyCraft.instance, new GuiHandler());
		

		
	}

}
