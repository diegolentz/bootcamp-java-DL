package clase19;

import Excepcionese.ErrorGuardar;
import clase7.Articulo;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo art) {
		try {
			InMemoryDB.save(art.getId(), art);
		} catch (ErrorGuardar e) {
			e.printStackTrace();
		}
		System.out.println("Articulo con id: " + art.getId() + " agregado");
	}
}