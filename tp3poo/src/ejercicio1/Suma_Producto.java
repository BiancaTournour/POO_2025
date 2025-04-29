package ejercicio1;

import java.util.Scanner;

public class Suma_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero:");
		int num1 = scanner.nextInt();
		System.out.println("ingrese otro numero:");
		int num2 = scanner.nextInt();
		System.out.println("ingrese un ultimo numero:");
		int num3 = scanner.nextInt();
		
		int resultado;
		if (num1>=0) {
			resultado = (num2*num3);
		}else {
			resultado = (num2+num3);
		}
		
		System.out.println("el resultado es: "+resultado);
		
		scanner.close();
	}

}
