package TP5;

public class Rectangulo extends Figura {

    private float ladoMenor;
    private float ladoMayor;

    public Rectangulo(String color, Punto posicion, String nombre, float ladoMenor, float ladoMayor) {
        super(color, posicion, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public float getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public float getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(float ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public String toString() {
        return super.toString() + " Es un rectángulo llamado '" + getNombre() + "', color: " + getColor()
                + ", centro: " + getPosicion()
                + ", lados: " + ladoMenor + " x " + ladoMayor;
    }

    public float calcularArea() {
        return ladoMenor * ladoMayor;
    }

    public float calcularPerimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    public void cambiarTamaño(float factor) {
        if (factor <= 0) {
            System.out.println("El factor de escala debe ser mayor a cero.");
            return;
        }
        ladoMenor *= factor;
        ladoMayor *= factor;
    }
}

