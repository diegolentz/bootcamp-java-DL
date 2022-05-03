package clase19;

import Excepcionese.ErrorBorrar;
import clase7.Articulo;

public class AccionBaja implements IAccion {
	
	@Override
	public void exec(Articulo art) {
		
		try {
			InMemoryDB.delete(art.getId());
		} catch (ErrorBorrar e) {
			e.printStackTrace();
		}
		
		System.out.println("Articulo con id: " + art.getId() + " eliminado");
	}

}