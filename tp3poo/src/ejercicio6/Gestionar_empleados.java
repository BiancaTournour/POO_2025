package ejercicio6;

import java.util.ArrayList;

public class Gestionar_empleados {

	private ArrayList<Empleado> empleados;

    // constructor
    public Gestionar_empleados() {
        empleados = new ArrayList<>();
    }

    // metodo para registrar un nuevo empleado
    public void registrarEmpleado(String nombre, double sueldo) {
        Empleado empleado = new Empleado(nombre, sueldo);
        empleados.add(empleado);
    }

    // metodo para obtener el empleado que más gana
    public Empleado obtenerempleado_conmayorsueldo() {
        if (empleados.isEmpty()) {
            return null;
        }
        
        Empleado empleadocon_mayorsueldo = empleados.get(0);

        for (Empleado empleado : empleados) {
            if (empleado.getsueldo() > empleadocon_mayorsueldo.getsueldo()) {
                empleadocon_mayorsueldo = empleado;
            }
        }

        return empleadocon_mayorsueldo;
    }

    // metodo para obtener el sueldo promedio
    public double obtenersueldopromedio() {
        if (empleados.isEmpty()) {
            return 0;
        }

        double totalsueldo = 0;
        for (Empleado empleado : empleados) {
            totalsueldo += empleado.getsueldo();
        }

        return totalsueldo / empleados.size();
    }
}
