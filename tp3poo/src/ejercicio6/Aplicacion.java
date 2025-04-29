package ejercicio6;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Gestionar_empleados gestor = new Gestionar_empleados();

        // registrar empleados
        System.out.println("Registrar empleados. Ingrese 'fin' para terminar.");
        while (true) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese el sueldo del empleado: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            gestor.registrarEmpleado(nombre, sueldo);
        }

        // empleado con el mayor sueldo
        Empleado empleado_mayorsueldo = gestor.obtenerempleado_conmayorsueldo();
        if (empleado_mayorsueldo != null) {
            System.out.println("El empleado que más gana es: " + empleado_mayorsueldo.getnombre() + " con un sueldo de " + empleado_mayorsueldo.getsueldo());
        } else {
            System.out.println("No hay empleados registrados.");
        }

        // sueldo promedio
        double sueldopromedio = gestor.obtenersueldopromedio();
        System.out.println("El sueldo promedio de los empleados es: " + sueldopromedio);

        scanner.close();
	}

}
