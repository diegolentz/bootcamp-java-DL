package clase10;

import clase7.Articulo;

public class Libro extends Articulo{

	// atributos propios
	private String isbn;
	
	public Libro(Long id, String nombre, String autor, Double precio, String urlImagen, String isbn) {
		super(id, nombre, autor, precio, urlImagen);
		this.isbn = isbn;
	}
	// alt + shift+s genero get y set

	public String getIsbn() {
		//logica control de null
		return isbn;
	}

	public void setIsbn(String isbn) {
		//logica control de null
		this.isbn = isbn;
	}
/*	
	@Override
	public void detalle() {
		// le digo al padre qe haga lo suyo
		super.detalle();
		// ahora yo hijo, hago lo qe se hacer
		System.out.println("isbn" + this.getIsbn());
	}
	*/
//libro esta obligando a implementar el metodo hijo() de la clase padre
	public void detalleHijo() {
		System.out.println("isbn" + this.getIsbn());
	}
}