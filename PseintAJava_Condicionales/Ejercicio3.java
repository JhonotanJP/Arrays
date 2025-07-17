import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear lector para ingresar datos
        Scanner input = new Scanner(System.in);

        // Variables
        double radio;
        double longitud;

        // Mensaje inicial
        System.out.println("Calcular la longitud de una circunferencia con el radio");

        // Ingreso de datos
        System.out.print("Ingrese el radio del círculo: ");
        radio = input.nextDouble();

        // Cálculo de la longitud
        longitud = 2 * Math.PI * radio;

        // Mostrar resultado
        System.out.println("La longitud de la circunferencia es de: " + longitud);

        input.close(); // Cerrar lector
    }
}
