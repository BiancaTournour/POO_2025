package TP7;

import java.util.Vector;

public class MatrizObjetos {
    static int max_rows = 200;
    static int max_cols = 200;
    private Vector<Object>[] cuerpo;

    @SuppressWarnings("unchecked")
    public MatrizObjetos(int columnas, int filas) throws MatrizException {
        // Validación de dimensiones negativas o cero
        if (filas <= 0 || columnas <= 0) {
            throw new MatrizException(MatrizException.ERR_DIMENSIONES_NEGATIVAS);
        }

        // Validación de filas excedidas
        if (filas > max_rows) {
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }

        // Validación de columnas excedidas
        if (columnas > max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }

        // Construcción de la matriz
        cuerpo = new Vector[filas];
        for (int i = 0; i < filas; i++) {
            cuerpo[i] = new Vector<>(columnas);
            // Inicializa cada columna con null
            for (int j = 0; j < columnas; j++) {
                cuerpo[i].add(null);
            }
        }
    }

    // Programación defensiva en SetRowCol
    public void setRowCol(int row, int col, Object obj) throws MatrizException {
        // Validar fila
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }

        // Validar columna según tamaño real de la fila
        if (col < 0 || col >= cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }

        // Reemplaza el valor existente
        cuerpo[row].set(col, obj);
    }

    // Programación defensiva en GetRowCol
    public Object getRowCol(int row, int col) throws MatrizException {
        // Validar fila
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }

        // Validar columna según tamaño real de la fila
        if (col < 0 || col >= cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }

        return cuerpo[row].elementAt(col);
    }

    // Representación en String de la matriz
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cuerpo.length; i++) {
            for (int j = 0; j < cuerpo[i].size(); j++) {
                sb.append(cuerpo[i].elementAt(j)).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


