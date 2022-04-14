package clase10;

import clase7.Articulo;

public class Pelicula extends Articulo {
	private String productor;

	public Pelicula(Long id, String nombre, String autor, Double precio, String urlImagen) {
		super(id, nombre, autor, precio, urlImagen);
		// TODO Auto-generated constructor stub
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public void detalleHijo() {
		System.out.println("productora: " + this.productor);
		
	}
}