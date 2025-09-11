package ejercicio1;

public class RunnableTest {
	
	public static void main(String[] args) {
        Thread hilo1 = new Thread(new RunnableSimple("Hilo-X"));
        Thread hilo2 = new Thread(new RunnableSimple("Hilo-Y"));

        hilo1.start();
        hilo2.start();
    }
}
