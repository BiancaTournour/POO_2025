package ejercicio2;

public class TareaMultiplicacion implements Runnable{
	    private int[][] A, B, C;
	    private int fila, columna;

	    public TareaMultiplicacion(int[][] A, int[][] B, int[][] C, int fila, int columna) {
	        this.A = A;
	        this.B = B;
	        this.C = C;
	        this.fila = fila;
	        this.columna = columna;
	    }

	    @Override
	    public void run() {
	        int suma = 0;
	        for (int k = 0; k < B.length; k++) {
	            suma += A[fila][k] * B[k][columna];
	        }
	        C[fila][columna] = suma;
	    }
	}