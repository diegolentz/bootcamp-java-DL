package practica.adicional.semana4;

public class Superman extends Volador {
	
	private Integer horasVuelo;
	private String zapatillas;

	public Superman(String nombre, Integer horasVuelo, String zapatillas) {
		super(nombre);
		this.horasVuelo = horasVuelo;
		this.zapatillas = zapatillas;
	}
	public void aterrizar() {
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nhorasVuelo: " + this.horasVuelo + "\nzapatillas: " + this.zapatillas;
	}
}