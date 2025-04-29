package ejercicio3;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ingrese una palabra:");
		String palabra = scanner.nextLine();
		
		String palabrainvertida = new StringBuilder(palabra).reverse().toString();
		
		if (palabra.equals(palabrainvertida)) {
			System.out.println("la palabra es un palindromo");
		}else {
			System.out.println("la palabra no es un palindromo");
		}
		
		scanner.close();
	}

}
