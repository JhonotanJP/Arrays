import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variables de entrada
        double num1, num2;

        // Mensaje inicial
        System.out.println("Calcular si los números son iguales o no");

        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextDouble();

        // Comparación
        if (num1 == num2) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println("Los dos números son diferentes.");
        }

        input.close(); // Cerrar lector
    }
}
