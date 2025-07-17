import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variables de entrada
        double num1, num2;

        // Mensaje inicial
        System.out.println("Calcular cuál de los números es mayor o si son iguales");

        // Ingreso de datos
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextDouble();

        // Resolución
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else {
            if (num2 > num1) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println(num1 + " es igual a " + num2);
            }
        }

        input.close(); // Cerrar lector
    }
}
