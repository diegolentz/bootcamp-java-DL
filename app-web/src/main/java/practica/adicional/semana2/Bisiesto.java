package practica.adicional.semana2;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Ingrese el dia: ");
		int dia = teclado.nextInt(); 
		
		
		System.out.println(" Ingrese el mes: ");
		int mes = teclado.nextInt(); 
		
		System.out.println(" Ingrese el a�o: ");
		int a�o = teclado.nextInt(); 
		
if(a�o >= 1900 && a�o <= 2099)
{System.out.println(" A�o correcto");}else {System.out.println(" A�o incorrecto");}
		
		if(mes >= 1 && mes <= 12) 
		 {System.out.println(" Mes correcto");
		 }else {System.out.println(" Mes incorrecto");}
		
		
		if ((mes == 2 && dia >= 1 && dia <= 29 && a�o % 4 == 0) && (a�o % 100 != 0 || a�o % 400 == 0))
		 {System.out.println(" Dia correcto");
		
		 } else if(mes == 2 && dia >= 1 && dia <= 28)
		 {System.out.println(" Dia correcto");}else {System.out.println(" Dia incorrecto");}
}
}