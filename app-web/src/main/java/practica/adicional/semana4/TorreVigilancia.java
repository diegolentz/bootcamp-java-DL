package practica.adicional.semana4;


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