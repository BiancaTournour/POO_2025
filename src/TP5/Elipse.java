package TP5;

public class Elipse extends Figura {

    private float radioMayor;
    private float radioMenor;

    public Elipse(String color, Punto posicion, String nombre, float radioMayor, float radioMenor) {
        super(color, posicion, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public String toString() {
        return super.toString() + " Es una elipse llamada '" + getNombre() + "', color: " + getColor()
                + ", centro: " + getPosicion()
                + ", radios: R=" + radioMayor + ", r=" + radioMenor;
    }

    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    public double calcularPerimetro() {
        // Fórmula aproximada de Ramanujan
        double R = radioMayor;
        double r = radioMenor;
        return Math.PI * (3 * (R + r) - Math.sqrt((3 * R + r) * (R + 3 * r)));
    }

    public void cambiarTamaño(float factor) {
        if (factor <= 0) {
            System.out.println("El factor de escala debe ser mayor a cero.");
            return;
        }
        radioMayor *= factor;
        radioMenor *= factor;
    }
}

