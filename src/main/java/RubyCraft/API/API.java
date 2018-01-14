package RubyCraft.API;

import RubyCraft.Referencia;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.RItems;

public interface API {

	public void addBloques(Bloques bloques, Referencia referencia);
	
	public void addItems(RItems ritems, Referencia referencia);
	
}
