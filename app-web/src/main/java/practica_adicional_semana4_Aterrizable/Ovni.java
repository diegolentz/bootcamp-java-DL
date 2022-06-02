package practica_adicional_semana4_Aterrizable;

public class Ovni extends Volador  {
	private Integer peso;
	private String modelo;

	public Ovni(String nombre, Integer peso, String modelo) {
		super(nombre);
		this.peso = peso;
		this.modelo = modelo;
	}
	public void aterrizar() {
		
	}
	@Override
	public String toString() {
		return super.toString() + "\npeso: " + this.peso + "\nmodelo: " + this.modelo;
	}
}