package practica_adicional_semama5_CollectionCustom;

/*Crear un clase CollectionCustom<T>
La clase tiene un atributo T[] “un array de T” en el cual se deben guardar 
los tipos una vez creada la implementación.

- debe tener los métodos
size():int
addFirst(T): void
addLast(T):void
add(T):void
remove(T): T remueve el primer elemento indicado y lo retorna
removeAll(T): void remueve todos los elementos.
boolean empty(): indica si la colección está vacía

Crear la clase Main para probar cada método.
No usar collection vistas en clase, deben trabajar con array de T,
uds deben implementar la logica.

Saludos
 * */

public class Main {

	public static void main(String[] args) {
		
		CollectionCustom nuestra_coleccion = new CollectionCustom();
		T sabrina = new T("sabrina");
		T jose = new T("jose");
		T juan = new T("juan");
		T soledad = new T("soledad");
		T horacio = new T("horacio");
		if(nuestra_coleccion.empty())
			System.out.println("la coleccion se encuentra vacia");
		else
			System.out.println("la coleccion contiene elementos");
		
		nuestra_coleccion.addFirst(sabrina);
		nuestra_coleccion.addLast(jose);
		nuestra_coleccion.addFirst(soledad);
		nuestra_coleccion.addLast(juan);
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		nuestra_coleccion.remove(soledad);
		System.out.println("remuevo el 1°ero");
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		System.out.println("agrego mas nombres");
		nuestra_coleccion.addFirst(soledad);
		nuestra_coleccion.addLast(soledad);
		nuestra_coleccion.addLast(horacio);
		nuestra_coleccion.addLast(soledad);
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		nuestra_coleccion.imprimir();
		
		System.out.println("remuevo todos los nombres del mismo tipo");
		nuestra_coleccion.removeAll(soledad);
		nuestra_coleccion.imprimir();
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
		
		if(nuestra_coleccion.remove(soledad) == null)
			System.out.println("el objeto ha sido removido");
		else
			System.out.println("el objeto no se ha encontrado");
		if(nuestra_coleccion.remove(soledad) != null)
			System.out.println("el objeto ha sido removido");
		else
			System.out.println("el objeto no se ha encontrado");
		if(nuestra_coleccion.empty())
			System.out.println("la coleccion se encuentra vacia");
		else
			System.out.println("la coleccion contiene elementos");
		System.out.println("el tamaño de la coleccion es de: " + nuestra_coleccion.size());
	}
		
	
}