package ejercicio1;

public class RunnableSimple implements Runnable {

    private String nombre;

    public RunnableSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(nombre);
            try {
                Thread.sleep((long) (Math.random() * 1000)); // pausa aleatoria
            } catch (InterruptedException e) {
                e.printStackTrace();
                // si querés terminar al interrumpir: Thread.currentThread().interrupt(); break;
            }
        }
        System.out.println(nombre + " HECHO!");
    }
}