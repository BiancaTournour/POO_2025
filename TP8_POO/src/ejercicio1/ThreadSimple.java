package ejercicio1;

public class ThreadSimple extends Thread {
	
	public ThreadSimple(String nombre) {
		super(nombre);
	}
	
	@Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName());
            try {
                // pausa entre 0 y 1000 ms (1 segundo)
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " HECHO!");
    }

}
