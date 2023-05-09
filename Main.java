import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Jesús, Luis, Alfonso, Juana
 * @version 1.0
 * */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        int indice;
        do {
            System.out.println("=== Menú principal ===");
            System.out.println("1. Añadir producto");
            System.out.println("2. Borrar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Ver listado de productos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> {
                    /**
                     * <h2>Implementación Método añadirProducto</h2>
                     * <p>Se ha insertado un método reemplazando el código</p>
                     */
                    anadirProducto();
                }
                case 2 -> {
                    borrarProductos();
                }
                case 3 -> {
                    modificarProductos();
                }
                case 4 -> {
                    System.out.println("=== Listado de productos ===");
                    for (int index = 0; index < productos.size(); index++) {
                        Producto productoAMostrar = productos.get(index);
                        System.out.println(index + ". " + productoAMostrar.getNombre() + " - $" + productoAMostrar.getPrecio());
                    }

                    System.out.println("============================");
                }
                case 5 -> System.out.println("¡Hasta luego!");
                /**
                 * <h2>Implementación Método añadirProducto</h2>
                 * <p>Se ha insertado un método reemplazando el código</p>
                 */
                default -> salir();
            }
        } while (opcion != 5);
    }

    private static void salir() {
        System.out.println("Opción no válida");
    }

    private static void anadirProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        Producto producto = new Producto(nombre, precio);
        productos.add(producto);
        System.out.println("Producto añadido correctamente");
        }
    }

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
}
