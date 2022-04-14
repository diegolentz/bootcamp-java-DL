package clase10;

public class Animal {

	//atributos
	//encapsulamos: ocultar al mundo exterior el atributo
	protected String color;
	private Integer edad;
	// etc de tipo nombre
	
	
	//constructor: forma de nacer
	//la jdk me construye por defecto (vacio)
	public Animal(String color) {
		System.out.println("nace un animal");
	}
	//metodos
	public void hablar() {
		System.out.println("animal hablando");
		
	}
	//getter; obtengo el valor del atributo
	// no tiene parametros
	//firma del metodo
	public String getColor() {
		String color; // color atributo local
		// this. siempre es de la clase
		if(this.color == null) {
			color = "n/d";
		}else {
			color = this.color;
		}
		return color;
		
	}
	
	//setter: modifico el valor
	public void setColor(String nuevoColor) {
		if(nuevoColor != null) {
			this.color = nuevoColor;
		}else {
			System.out.println("debe informar un color");
		}
	}	
	public void setEdad(Integer nuevaEdad) {
		if(nuevaEdad != null) {
			this.edad = nuevaEdad;
		}
		
	}
	public Integer getEdad() {
		Integer edad;
		if(this.edad == null) {
			edad = 0;
		}else {
			edad = this.edad;
		}
		return edad;
	}
}