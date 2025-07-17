import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variable de entrada
        double num1;

        // Mensaje inicial
        System.out.println("Calcular si su número es positivo o negativo");

        // Ingreso de datos
        System.out.print("Ingrese el número: ");
        num1 = input.nextDouble();

        // Verificar si es positivo o negativo
        if (num1 > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        input.close(); // Cerrar lector
    }
}
