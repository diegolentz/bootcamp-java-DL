package clase18;

import java.util.Comparator;

public class FechaPagoAsc extends FechaPagoComparator {
	
	public int comparar(Cheque c1, Cheque c2) {
		//comparar fecha ord. desc
			return c1.getFechaPago().compareTo(c2.getFechaPago());
	}
}

	
