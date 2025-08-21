package TP7;

public class App {

    public static void main(String[] args) {

        // 1. ERR_DIMENSIONES_NEGATIVAS
        System.out.println("Prueba 1: dimensiones negativas");
        try {
            new MatrizObjetos(-3, 5);
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 2. ERR_FILAS_EXCEDIDAS
        System.out.println("\n Prueba 2: filas excedidas");
        try {
            new MatrizObjetos(5, 201); // filas > max_rows
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 3. ERR_COLUMNAS_EXCEDIDAS
        System.out.println("\n Prueba 3: columnas excedidas");
        try {
            new MatrizObjetos(201, 5); // columnas > max_cols
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 4. ERR_FILA_FUERA_DE_RANGO
        System.out.println("\n Prueba 4: fila fuera de rango");
        MatrizObjetos ma4 = null;
        try {
            ma4 = new MatrizObjetos(3, 3);
            ma4.setRowCol(5, 1, "Dato"); // fila inválida
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 5. ERR_COLUMNA_FUERA_DE_RANGO
        System.out.println("\n Prueba 5: columna fuera de rango");
        try {
            ma4.getRowCol(1, 10); // columna inválida
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 6. ERR_MATRIZ_NULA
        System.out.println("\n Prueba 6: matriz nula");
        try {
            throw new MatrizException(MatrizException.ERR_MATRIZ_NULA);
        } catch (MatrizException e) {
            System.out.println(e);
        }

        // 7. Prueba válida al final
        System.out.println("\n Prueba 7: matriz válida");
        try {
            MatrizObjetos maValida = new MatrizObjetos(2, 2); // 2 filas x 2 columnas
            maValida.setRowCol(0, 0, 10);
            maValida.setRowCol(0, 1, 0);
            maValida.setRowCol(1, 0, 0);
            maValida.setRowCol(1, 1, 20);
            System.out.println("Matriz válida:\n" + maValida);
        } catch (MatrizException e) {
            System.out.println(e);
        }
    }
}



