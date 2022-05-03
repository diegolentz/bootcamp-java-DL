package clase19;

import Excepcionese.ErrorObtenerValor;
import Excepcionese.ErrorSubida;
import clase7.Articulo;

public class AccionModificacion implements IAccion {

	@Override
	public void exec(Articulo art) {

		Articulo art2;
		try {
			art2 = InMemoryDB.getById(art.getId());

			if (art2 != null) {
				try {
					InMemoryDB.update(art.getId(), art);
				} catch (ErrorSubida e) {
					e.printStackTrace();
				}
			}

		} catch (ErrorObtenerValor e) {
			e.printStackTrace();
		}

	}
}