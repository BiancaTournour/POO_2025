package TP5;

public class Circulo extends Elipse {

    public Circulo(String color, Punto posicion, String nombre, float radio) {
        super(color, posicion, nombre, radio, radio);
    }

    @Override
    public void setRadioMayor(float radio) {
        super.setRadioMayor(radio);
        super.setRadioMenor(radio);
    }

    @Override
    public void setRadioMenor(float radio) {
        super.setRadioMayor(radio);
        super.setRadioMenor(radio);
    }

    @Override
    public String toString() {
        return super.toString() + " (círculo)";
    }
}

