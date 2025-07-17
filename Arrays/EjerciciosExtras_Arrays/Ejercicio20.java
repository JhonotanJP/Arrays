import java.util.Scanner;
import java.util.Arrays;

//Productos más vendidos
//Dos vectores: nombres de productos y cantidades vendidas (10 elementos cada uno).
//Muestra los 5 productos con mayor venta.

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //declara los vectores de los 10 productos
        String[] productos = new String[10];
        int[] ventas = new int[10];

        // Ingreso de datos
        System.out.println("Ingrese los nombres de 10 productos y sus cantidades vendidas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            productos[i] = teclado.nextLine();
            System.out.print("Cantidad vendida: ");
            ventas[i] = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer
        }

        // Ordenar por ventas descendente usando burbuja modificada
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = 0; j < ventas.length - 1 - i; j++) {
                if (ventas[j] < ventas[j + 1]) {
                    // Intercambiar ventas
                    int tempVenta = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = tempVenta;

                    // Intercambiar nombres también
                    String tempProducto = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = tempProducto;
                }
            }
        }

        // Imprimir los 5 productos mas vendidos 
        System.out.println("\nTop 5 productos más vendidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - " + ventas[i] + " unidades");
        }
    }
}

