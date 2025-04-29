package ejercicio5;

import java.util.Scanner;

public class Entero_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero: ");
		int num = scanner.nextInt();
		Entero e = new Entero(num);
		
		System.out.println("numero: "+ e.getNumero());
		System.out.println("cuadrado del numero: "+e.cuadrado());
		System.out.println("es par o impar? "+e.par_impar());
		System.out.println("cual es su factorial? "+e.factorial());
		System.out.println("es un numero primo? "+e.esPrimo());
		
		scanner.close();
	}
}
