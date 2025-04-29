package ejercicio2;

public enum ClasificadorNotas {
	
	SOBRESALIENTE("Sobresaliente"),
	APROBADO("Aprobado"),
	DESAPROBADO("Desaprobado");
	
	private String nombre;
	
	private ClasificadorNotas(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

}
