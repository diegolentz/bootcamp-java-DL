package clase19;

import Excepcionese.*;
import clase7.Articulo;



public interface IAccion {

	public void exec(Articulo art) throws ErrorGuardar,ErrorBorrar,ErrorObtenerValor,ErrorListarTodo,ErrorSubida;
}