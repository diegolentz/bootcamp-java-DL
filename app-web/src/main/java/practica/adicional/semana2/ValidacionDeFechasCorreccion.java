package practica.adicional.semana2;

import java.util.Scanner;

public class ValidacionDeFechasCorreccion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Ingrese el dia: ");
		int dia = teclado.nextInt(); 
		
		
		System.out.println(" Ingrese el mes: ");
		int mes = teclado.nextInt(); 
		
		System.out.println(" Ingrese el a�o: ");
		int a�o = teclado.nextInt(); 
		
if(a�o >= 1900 && a�o <= 2099) {System.out.println(" A�o correcto");
		
		if(mes >= 1 && mes <= 12) 
		 {
		  if (mes == 2)
		  { System.out.println(" Mes correcto");


		  if ((mes == 2 && dia >= 1 && dia <= 29 && a�o % 4 == 0) && (a�o % 100 != 0 || a�o % 400 == 0))
			 {System.out.println(" Dia correcto");
			
			 } else if(mes == 2 && dia >= 1 && dia <= 28)
			 {System.out.println(" Dia correcto");}else {System.out.println(" Dia incorrecto");}
		  
		  } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 | mes == 8 || mes == 10 | mes == 12 )
				    {System.out.println(" Mes correcto");
				    if (dia >= 1 && dia <= 31) 
				    {System.out.println(" Dia correcto " );
				    }else {System.out.println(" Dia incorrecto");}
		 } else if(mes == 4 || mes == 6 || mes == 8 | mes == 9 || mes == 11)
				    {System.out.println(" Mes correcto");
					if (dia >= 1 && dia <= 30) 
					{System.out.println(" Dia correcto " );
				    }else {System.out.println(" Dia incorrecto");}
				     }
		teclado.close();
			        }
			        else {System.out.println(" Mes incorrecto");}
  		            }else {System.out.println(" A�o incorrecto");}
		System.out.println("Fin");
	        }
}