import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variables de entrada
        double num1, num2;

        // Mensaje inicial
        System.out.println("Calcular si los números son múltiplos entre sí");

        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextDouble();

        // Validación para evitar división por cero
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede verificar múltiplos con cero.");
        } else {
            // Convertimos a enteros para usar el operador módulo
            int n1 = (int) num1;
            int n2 = (int) num2;

            // Verificar si uno es múltiplo del otro
            if (n1 % n2 == 0 || n2 % n1 == 0) {
                System.out.println("Los dos son múltiplos.");
            } else {
                System.out.println("No son múltiplos.");
            }
        }

        input.close(); // Cerrar lector
    }
}
