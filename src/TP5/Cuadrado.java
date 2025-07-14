package TP5;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, Punto posicion, String nombre, float lado) {
        super(color, posicion, nombre, lado, lado);
    }

    public void setLadoMenor(float lado) {
        super.setLadoMenor(lado);
        super.setLadoMayor(lado);
    }

    public void setLadoMayor(float lado) {
        super.setLadoMenor(lado);
        super.setLadoMayor(lado);
    }

    public String toString() {
        return super.toString() + " (cuadrado)";
    }
}
