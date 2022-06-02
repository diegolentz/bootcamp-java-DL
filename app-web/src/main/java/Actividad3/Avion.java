package Actividad3;

public class Avion extends Volador  {

	// atributos propios
	
	private Integer turbinas;
	private Integer asientos;
	private Piloto piloto1;
	
	
	public Avion(String nombre, Integer turbinas, Integer asientos, Piloto piloto1)
	{
		super(nombre);
		this.turbinas = turbinas;
		this.asientos = asientos;
		this.piloto1 = piloto1;
	}
    
	public void aterrizar() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nturbinas: " + this.turbinas + "\nasientos: " + this.asientos + "\npiloto: " + this.piloto1.toString();
	}
}