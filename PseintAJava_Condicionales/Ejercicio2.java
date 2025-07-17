import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variables de entrada y salida
        double radio;
        double area;

        // Mensaje inicial
        System.out.println("Para calcular el área del círculo se va a utilizar la siguiente fórmula: A = π * r²");

        // Ingreso de datos
        System.out.print("Ingrese el radio del círculo: ");
        radio = input.nextDouble();

        // Cálculo del área
        area = Math.PI * Math.pow(radio, 2);

        // Mostrar resultado
        System.out.println("El área es de: " + area);

        input.close(); // Cerrar lector
    }
}
