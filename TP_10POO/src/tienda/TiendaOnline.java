package tienda;

import java.util.*;
import java.util.stream.Collectors;

public class TiendaOnline {

    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
            new Producto("Smartphone", "Electrónica", 350.0, 15),
            new Producto("Laptop", "Electrónica", 1200.0, 5),
            new Producto("Camiseta", "Ropa", 25.0, 50),
            new Producto("Auriculares", "Electrónica", 80.0, 8),
            new Producto("Zapatos", "Ropa", 60.0, 20),
            new Producto("Tablet", "Electrónica", 450.0, 3)
        );

        //Tarea 1: Filtrar productos de Electrónica
        List<Producto> electronica = productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Electrónica"))
                .collect(Collectors.toList());

        System.out.println("--- Productos de Electrónica ---");
        electronica.forEach(System.out::println);

        //Tarea 2: Encontrar el producto más caro
        Optional<Producto> masCaro = productos.stream()
                .max(Comparator.comparing(Producto::getPrecio));

        System.out.println("\n--- Producto más caro ---");
        masCaro.ifPresent(System.out::println);

        //Tarea 3: Nombres de productos con stock menor a 10
        List<String> nombresBajoStock = productos.stream()
                .filter(p -> p.getStock() < 10)
                .map(Producto::getNombre)
                .collect(Collectors.toList());

        System.out.println("\n--- Productos con stock menor a 10 ---");
        nombresBajoStock.forEach(System.out::println);

        //Tarea 4: Ordenamiento complejo (categoría + precio descendente)
        List<Producto> ordenados = productos.stream()
                .sorted(
                    Comparator.comparing(Producto::getCategoria)
                              .thenComparing(Comparator.comparing(Producto::getPrecio).reversed())
                )
                .collect(Collectors.toList());

        System.out.println("\n--- Productos ordenados por categoría y precio descendente ---");
        ordenados.forEach(System.out::println);

        //Tarea 5: Agrupar productos por categoría
        Map<String, List<Producto>> productosPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));

        System.out.println("\n--- Productos agrupados por categoría ---");
        productosPorCategoria.forEach((categoria, lista) -> {
            System.out.println(categoria + ":");
            lista.forEach(p -> System.out.println("  " + p));
        });

        //Tarea 6: Calcular el valor total del inventario
        double valorTotal = productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getStock())
                .sum();

        System.out.println("\n--- Valor total del inventario ---");
        System.out.println("$" + valorTotal);

        //Tarea 7: Comparator reutilizable (stock ascendente + nombre)
        Comparator<Producto> comparadorStockNombre = Comparator
                .comparingInt(Producto::getStock)
                .thenComparing(Producto::getNombre);

        List<Producto> bajoStockOrdenado = productos.stream()
                .filter(p -> p.getStock() < 10)
                .sorted(comparadorStockNombre)
                .collect(Collectors.toList());

        System.out.println("\n--- Productos con bajo stock ordenados por cantidad y nombre ---");
        bajoStockOrdenado.forEach(System.out::println);

        // Tarea 8: Manejo avanzado de Optional
        String nombreBuscado = "Laptop";
        Optional<Producto> productoEncontrado = buscarProductoPorNombre(productos, nombreBuscado);

        System.out.println("\n--- Manejo de Optional ---");

        // 1. Obtener producto o valor por defecto
        Producto resultado1 = productoEncontrado.orElse(
            new Producto("Producto no encontrado", "N/A", 0.0, 0)
        );
        System.out.println("Resultado con orElse: " + resultado1);

        // 2. Obtener producto o lanzar excepción
        try {
            Producto resultado2 = productoEncontrado.orElseThrow(
                () -> new NoSuchElementException("No se encontró el producto: " + nombreBuscado)
            );
            System.out.println("Resultado con orElseThrow: " + resultado2);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // 3. Transformar solo si está presente (map)
        productoEncontrado.map(p -> p.getNombre().toUpperCase())
                         .ifPresent(nombre -> System.out.println("Nombre en mayúsculas: " + nombre));
    }

    //Método que busca un producto por su nombre exacto.
    //Devuelve un Optional<Producto> para manejo seguro de ausencia de valor.
    public static Optional<Producto> buscarProductoPorNombre(List<Producto> lista, String nombre) {
        return lista.stream()
                    .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                    .findFirst();
    }
}


