package ejercicio4;

public class ArrayEntero {
    private int[] numeros = {4, 2, 3, 8, 1};

    public static void main(String[] args) {
        ArrayEntero ae = new ArrayEntero();

        System.out.println("Cantidad: " + ArrayUtils.cantidad(ae.numeros));
        System.out.println("Mayor: " + ArrayUtils.mayor(ae.numeros));
        System.out.println("Promedio: " + ArrayUtils.promedio(ae.numeros));

        System.out.print("Orden ascendente: ");
        ArrayUtils.imprimirArray(ArrayUtils.ordenAscendente(ae.numeros));

        System.out.print("Orden descendente: ");
        ArrayUtils.imprimirArray(ArrayUtils.ordenDescendente(ae.numeros));
    }
}