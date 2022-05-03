package clase19;

import java.util.Scanner;

import Excepcionese.*;
import clase10.Libro;
import clase7.Articulo;

public class MainMap {

	/**
	 * El usuario ingresa una opcion
	 * 1- alta
	 * 2- baja
	 * 3- modificar
	 * 4- listar
	 * @param args
	 */
	public static void main(String[] args) {
	
		Integer opcionIngresadaPorUsuario = 1;
		
		// Interface i = new ClaseQueImplementaLaInterface();		
		IAccion accion = AccionMap.getAccion(opcionIngresadaPorUsuario);//AltaAccion|BajaAccion|AccionDefault
		
		Articulo articulo = contruirArticulo();
		
		try {
			InMemoryDB.listAll();
		}catch(NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			
		} catch (ErrorListarTodo e) {}
		try {
			accion.exec(articulo);
		}catch(ErrorBorrar | ErrorGuardar | ErrorListarTodo | ErrorObtenerValor | ErrorSubida e) {
			e.printStackTrace();
		}

		try {
			InMemoryDB.listAll();
		}catch(NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			
		} catch (ErrorListarTodo e) {}
		
		try {
			InMemoryDB.delete(articulo.getId());
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ErrorBorrar e) {
			e.printStackTrace();
		}
		
		try {
			InMemoryDB.listAll();
		}catch(NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			
		} catch (ErrorListarTodo e) {}
	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese titulo ");
		art.setAutor(teclado.next());
		System.out.println("Ingrese id ");
		art.setId(teclado.nextLong());
		
		System.out.println("Ingrese isbn");
		((Libro)art).setIsbn(teclado.next());
		teclado.close();
		return art;
	}
}