package ejercicio2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese la calificacion:");
		int nota = scanner.nextInt();
		
		if (nota < 0 || nota > 10) {
			System.out.println("Calificacion fuera de rango. ");
		}else if (nota >= 9) {
			System.out.println(ClasificadorNotas.SOBRESALIENTE.getNombre());
		}else if (nota >= 6) {
			System.out.println(ClasificadorNotas.APROBADO.getNombre());
		}else if (nota < 6) {
			System.out.println(ClasificadorNotas.DESAPROBADO.getNombre());
		}
		
		scanner.close();

	}

}
