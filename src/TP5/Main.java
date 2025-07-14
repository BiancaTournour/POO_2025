package TP5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	
        // Crear objetos de distintas figuras
        Rectangulo rect = new Rectangulo("Rojo", new Punto(5, 5), "Rectángulo 1", 4, 2);
        Cuadrado cuad = new Cuadrado("Azul", new Punto(2, 3), "Cuadrado 1", 3);
        Elipse elip = new Elipse("Verde", new Punto(7, 1), "Elipse 1", 5, 3);
        Circulo circ = new Circulo("Amarillo", new Punto(0, 9), "Círculo 1", 4);

        // Probar métodos de cada figura
        System.out.println("----- Prueba individual de métodos -----");
        System.out.println(rect);
        System.out.println("Área rectángulo: " + rect.calcularArea());
        System.out.println("Perímetro rectángulo: " + rect.calcularPerimetro());

        System.out.println(cuad);
        System.out.println("Área cuadrado: " + cuad.calcularArea());

        System.out.println(elip);
        System.out.println("Área elipse: " + elip.calcularArea());
        System.out.println("Perímetro elipse (aprox): " + elip.calcularPerimetro());

        System.out.println(circ);
        System.out.println("Área círculo: " + circ.calcularArea());
        System.out.println("Perímetro círculo (aprox): " + circ.calcularPerimetro());

        // Crear colección de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rect);
        figuras.add(cuad);
        figuras.add(elip);
        figuras.add(circ);

        // Nueva posición y color común
        Punto nuevaPosicion = new Punto(0, 0);
        String nuevoColor = "Negro";

        // Cambiar color y posición a todas las figuras
        System.out.println("\n----- Modificando color y posición de todas las figuras -----");
        for (Figura fig : figuras) {
            fig.setColor(nuevoColor);
            fig.setPosicion(new Punto(nuevaPosicion.getX(), nuevaPosicion.getY())); // nueva instancia para cada figura
        }

        // Mostrar todas las figuras después de los cambios
        for (Figura fig : figuras) {
            System.out.println(fig);
        }
    }
}
