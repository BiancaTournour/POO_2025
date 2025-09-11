package ejercicio1;

public class ThreadSimpleTest {
	
	public static void main(String[] args) {
        ThreadSimple hilo1 = new ThreadSimple("Hilo-A");
        ThreadSimple hilo2 = new ThreadSimple("Hilo-B");

        // Iniciamos ambos en forma simultánea
        hilo1.start();
        hilo2.start();
    }

}
