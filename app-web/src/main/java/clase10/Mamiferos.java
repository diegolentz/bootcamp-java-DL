package clase10;

public class Mamiferos extends Animal{
// tiene lo mismo que un animal en cuanto atributos y atributos propios

	private Integer tiempoGestacion;

	// nacen de una manera particular 
	
	public Mamiferos(String color, Integer tiempoG) {
		// la primera linea del constructor del hijo
		// debe llamar al constructor del padre
		super(color);
		
		//ahora que nacio el padre, seteo al hijo
		this.tiempoGestacion = tiempoG;
		super.getEdad();
	}
	

	//sus propios metodos	
	
}