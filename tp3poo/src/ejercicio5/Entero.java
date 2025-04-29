package ejercicio5;

public class Entero {
	
	private int numero;
	 //constructor
	 public Entero(int numero) {
	 super();
	 this.numero = numero;
	 }
	 
	 public int getNumero() {
	 return numero;
	 }
	 
	 public void setNumero(int numero) {
	 this.numero = numero;
	 }
	 
	 //calcula el cuadradro
	 public long cuadrado(){
	 return numero*numero;
	 }
	 
	 public String par_impar()  {
		 if (numero % 2 == 0) {
		return "par";
		}else {return "impar";}
	 }
	 
	 //calcula el factorial
	 public int factorial() {
		    int resultado = 1;
		    for (int i = numero; i >= 1; i--) {
		        resultado *= i;
		    }
		    return resultado;
		}
	 
	 //denomina si el numero es primo o no
	 public boolean esPrimo() {
		    if (numero <= 1) {
		        return false;
		    } for (int i = 2; i <= Math.sqrt(numero); i++) {
		        if (numero % i == 0) {
		            return false;
		        }
		    }return true;
		}	
}
