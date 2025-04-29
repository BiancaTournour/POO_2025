package ejercicio4;

import java.util.Arrays;

public class ArrayUtils {

    public static int cantidad(int[] array) {
        return array.length;
    }

    public static int mayor(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static double promedio(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

    public static int[] ordenAscendente(int[] array) {
        int[] copia = array.clone();
        Arrays.sort(copia);
        return copia;
    }

    public static int[] ordenDescendente(int[] array) {
        int[] copia = ordenAscendente(array);
        for (int i = 0; i < copia.length / 2; i++) {
            int temp = copia[i];
            copia[i] = copia[copia.length - 1 - i];
            copia[copia.length - 1 - i] = temp;
        }
        return copia;
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
