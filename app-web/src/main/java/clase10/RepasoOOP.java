package clase10;

import java.util.Scanner;

public class RepasoOOP {

	public static void main(String[] args) {
		//crear una clase : molde para crear un objeto
		//instanciar un objeto de esa clase: objeto vivo
		Animal perro = new Animal("verde");// invocar el constructor de la clase
		//ejecutar un metodo de ese objeto: accion/comportamiento del objeto
		perro.hablar();
		System.out.println(perro.getColor());
		
		// voy a designar color al perro
		perro.setColor("negro");
		// consulto nuevo parametro
		System.out.println(perro.getColor());
		
		// le pedimos que ingrese la edad del animal
		Scanner teclado = new Scanner(System.in);
		Integer edad;
	do {
		System.out.println("ingrese la edad del animal");
		edad = teclado.nextInt();
	}while(edad == null);
	
	//invoco el metodo set edad 
	perro.setEdad(edad);
	System.out.println(perro.getEdad());

}
}