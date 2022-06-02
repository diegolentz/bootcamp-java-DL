package Actividad3;

/*
 * "Crear un branch con el nombre practica-adicional-semana4 
	La idea es desarrollar un peque�o programa para incorporar
 	los conceptos de clases, atributos, m�todos, clases abstractas, 
 	interfaces, composici�n, agregaci�n. 
	Existe una torre de control donde operadores pueden determinar ciertos 
	voladores que pueden aterrizar en la pista de aterrizaje. Los voladores son,
 	avi�n, helic�ptero, Superman, ovni. 
	Los atributos que comparten son: nombre, (agregar otros de ser necesario) 
	Cada volador tiene atributos particulares (decidir los que crean convenientes).
 	Ej: avi�n puede tener cantidad de asientos, el helic�ptero puede tener color, marca, modelo etc. 
	En la pista solo podr�n aterrizar aquellos voladores que cumplan con la interfaz Aterrizable. 
	Escribir las clases e interfaces, adem�s de las relaciones de herencias necesarias para poder resolverlo."*/

public class TorreVigilancia {

	public static void main(String[] args) {

		Avion avion = new Avion("boing",3,2, new Piloto("jose", "alvarez", 40));
		
		Helicoptero helicoptero = new Helicoptero("apache", "negro", 1300, new Piloto("pedro", "sand", 35));
		
		Superman superman = new Superman("kent", 1500, "adidas");
		
		Ovni ovni = new Ovni("skyblue",1500,"5.0");
		
		System.out.println(avion.toString());
		System.out.println(helicoptero.toString());
		System.out.println(superman.toString());
		System.out.println(ovni.toString());
		
		
	}
   
}