package TP5;

public class Punto {
    private int coordenadaX;
    private int coordenadaY;

    public Punto(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public int getX() {
        return coordenadaX;
    }

    public void setX(int x) {
        this.coordenadaX = x;
    }

    public int getY() {
        return coordenadaY;
    }

    public void setY(int y) {
        this.coordenadaY = y;
    }

    public String toString() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

