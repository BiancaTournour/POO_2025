package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class MultiplicadorMatrices {
    public static void main(String[] args) {
        // Matrices de ejemplo
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Matriz resultado (2x2)
        int[][] C = new int[A.length][B[0].length];

        List<Thread> hilos = new ArrayList<>();

        // Crear un hilo por cada celda de C
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                TareaMultiplicacion tarea = new TareaMultiplicacion(A, B, C, i, j);
                Thread hilo = new Thread(tarea);
                hilos.add(hilo);
                hilo.start();
            }
        }

        // Esperar que terminen todos los hilos
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimir matriz resultado
        System.out.println("Resultado:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
  
}

