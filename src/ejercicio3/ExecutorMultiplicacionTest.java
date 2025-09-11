package ejercicio3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMultiplicacionTest {

	public static void main(String[] args) {
        // 1. Crear ExecutorService con número de procesadores disponibles
        int numProcesadores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numProcesadores);

        System.out.println("Procesadores disponibles: " + numProcesadores);
        System.out.println("Enviando tareas al pool...\n");

        // 2. Enviar tareas
        for (int i = 1; i <= 5; i++) {  // Por ejemplo, tablas del 1 al 5
            TareaMultiplicacion tarea = new TareaMultiplicacion(null, null, null, i, i);
            executor.submit(tarea);
        }

        // 3. Apagar el ExecutorService ordenadamente
        executor.shutdown();  // No se aceptan nuevas tareas

        try {
            // Esperar hasta que todas las tareas terminen o hasta 1 minuto
            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("Forzando apagado...");
                executor.shutdownNow();  // Forzar apagado si no terminaron
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido durante espera.");
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("\n¡Todas las tareas han terminado!");
    }
	
}
