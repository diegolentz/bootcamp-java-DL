package clase18;

import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {
	
	public static void main(String[] args) {
		// collections
		//<list: admiten duplicado
		//<set: no admiten duplicado
		
		Collection<String> nombres = new TreeSet<>();
		nombres.add("jose");
		nombres.add("jose");
		
		//los tipos wrapper de java implementan la interface Comparator
		
		System.out.println(nombres);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1986);
		cal.set(Calendar.MONTH, 2);//0= ener , 1= feb
		cal.set(Calendar.DATE, 10);
		
		Cheque c1 = new Cheque("1002000","rio",cal.getTime());//root
		
		cal.add(Calendar.DATE, 1);//+1dia
		Cheque c2 = new Cheque("1002001","bbva", cal.getTime());//der
		 
		cal.add(Calendar.DATE, 1);//+1dia
		Cheque c3 = new Cheque("1000000","patagonia", cal.getTime());//izq
		
		cal.add(Calendar.DATE, 1);//+1dia
		Cheque c4 = new Cheque("1002000","patagonia", cal.getTime());
		
		Comparator<Cheque> comparador = new ComparadorDeCheques();
		//agrego un orden externo a la collection
		Collection<Cheque> cheques = new TreeSet<>(comparador); 
		
		cheques.add(c1);
		cheques.add(c2);
		cheques.add(c3);
		cheques.add(c4);
		//cheques.add(null);
		
		System.out.println(cheques.isEmpty());

		Iterator<Cheque> itCheques = cheques.iterator();
		
		while(itCheques.hasNext()) {
			Cheque unCheque = itCheques.next();
			System.out.println(unCheque);
			itCheques.remove();
		}
		System.out.println(cheques.isEmpty());
	}
}
