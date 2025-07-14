package TP5;

public class Figura {
	
	private String color;
	private Punto posicion;
	private String nombre;
	
	public Punto getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public Figura(String color, Punto posicion, String nombre) {
		super();
		this.color = color;
		this.posicion = posicion;
		this.nombre = nombre;
		
	}
	
	public Figura(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "esto es una figura";
	}
	
	public void mover(int nuevaX, int nuevaY) {
	    this.posicion.setX(nuevaX);
	    this.posicion.setY(nuevaY);
	}

}
