package ejercicio6;

public class Empleado {
	
	private String nombre;
    private double sueldo;

    // constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // getters
    public String getnombre() {
        return nombre;
    }

    public double getsueldo() {
        return sueldo;
    }

    // setters
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
