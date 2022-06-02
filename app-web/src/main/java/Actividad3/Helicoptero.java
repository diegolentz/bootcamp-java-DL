package Actividad3;

public class Helicoptero extends Volador  {

	private String color;
	private Integer hp;
	private Piloto piloto1;
	
	public Helicoptero(String nombre, String color, Integer hp, Piloto piloto1) {
		super(nombre);
		this.color = color;
		this.hp = hp;
		this.piloto1 = piloto1;
	}
	public void aterrizar() {
		
	}
	@Override
	public String toString() {
		return super.toString() + "\ncolor: " + this.color + "\nhp: " + this.hp + "\npiloto: " + this.piloto1.toString();
	}
}