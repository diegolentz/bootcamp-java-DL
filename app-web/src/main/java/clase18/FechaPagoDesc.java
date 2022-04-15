package clase18;

import java.util.Comparator;

public class FechaPagoDesc implements Comparator<Cheque> {
	
	public int compare(Cheque c1, Cheque c2) {
		//comparar fecha ord. desc
		return c2.getFechaPago().compareTo(c1.getFechaPago());
	}
}

	
	
	