package practica_adicional_semana2_validacionFecha;


/*Crear un paquete con el nombre practica-semanal-semana2:
 Validación de fechas:
 Ingresar una fecha por teclado  dd/mm/yyyy (dd int, mm int, yyyy int)
 validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES
 validar que mes >=1 && <=12
 validar que año >=1900 && <= 2099
 Ojo, si el año es bisiesto febrero tiene 29  días.
 Informar por consola  si la fecha es correcta.
 * */

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Ingrese el dia: ");
		int dia = teclado.nextInt(); 
		
		
		System.out.println(" Ingrese el mes: ");
		int mes = teclado.nextInt(); 
		
		System.out.println(" Ingrese el año: ");
		int año = teclado.nextInt(); 
		
if(año >= 1900 && año <= 2099)
{System.out.println(" Año correcto");}else {System.out.println(" Año incorrecto");}
		
		if(mes >= 1 && mes <= 12) 
		 {System.out.println(" Mes correcto");
		 }else {System.out.println(" Mes incorrecto");}
		
		
		if ((mes == 2 && dia >= 1 && dia <= 29 && año % 4 == 0) && (año % 100 != 0 || año % 400 == 0))
		 {System.out.println(" Dia correcto");
		
		 } else if(mes == 2 && dia >= 1 && dia <= 28)
		 {System.out.println(" Dia correcto");}else {System.out.println(" Dia incorrecto");}
}
}