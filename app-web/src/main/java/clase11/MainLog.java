package clase11;

import java.util.Scanner;

import javax.management.InstanceAlreadyExistsException;

public class MainLog {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String op = "1";// fs 2; email
		String msj = "mensaje a enviar";
		System.out.println("ingrese cantidad de log");
		int cantidad = teclado.nextInt();
		
		Log[] log = new Log[cantidad];
		   for(int i=0;i<log.length; i++) {
			   System.out.println("1-fs / 2-email");
			   op = teclado.next();
			   Log aux = getLog(op);
			   
			   
			 //  aux.id = 100l;
			   aux.setMsj(msj);
			   log[i] = aux;
			
		  //ahora que tengo todo el array cargado
	     // lo recorro y voy invocando el metodo loguear()
			   // y por polimorfismo se determina cual de las instancias
		  for(Log _log : log) {
			_log.loguear();
			  if(_log instanceof IEjecutable) {
				   IEjecutable iinterface = (IEjecutable)_log;
				   iinterface.ejecutar();
		      }
		  }
      }
		
			
    }

	public static Log getLog(String op) {
		Log log;
		 if(op.equals("1")) {
			   log = new FSLog();
		 }else if(op.equals("2")) {
			   log = new EmailLog();
		 }else {
			log = new DefaultLog();
		 }
		 return log;
	}
	}
	