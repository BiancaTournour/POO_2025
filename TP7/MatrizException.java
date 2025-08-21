package TP7;

public class MatrizException extends Exception {
    private static final long serialVersionUID = 1L;

    // Constantes de códigos de error
    public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
    public static final int ERR_FILAS_EXCEDIDAS = 1;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 2;
    public static final int ERR_FILA_FUERA_DE_RANGO = 3;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;
    public static final int ERR_MATRIZ_NULA = 5;

    // Mensajes de error asociados
    private static final String[] ERRORES = {
        "El número de columnas excede el máximo permitido.",
        "El número de filas excede el máximo permitido.",
        "Las dimensiones de la matriz no pueden ser negativas.",
        "El índice de la fila está fuera de rango.",
        "El índice de la columna está fuera de rango.",
        "La matriz es nula."
    };

    private final String name;

    // Constructor con mensaje personalizado
    public MatrizException(String nom) {
        this.name = nom;
    }

    // Constructor con código de error
    public MatrizException(int numError) {
        if (numError >= 0 && numError < ERRORES.length) {
            this.name = ERRORES[numError];
        } else {
            this.name = "Error desconocido en la matriz.";
        }
    }

    @Override
    public String toString() {
        return "ERROR MATRIZ: " + name;
    }
}
