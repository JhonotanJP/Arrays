import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;

        do {
            System.out.print("Ingrese un número (negativo para salir): ");
            num = input.nextDouble();

            if (num >= 0) {
                System.out.println("El cuadrado de " + num + " es: " + (num * num));
            }
        } while (num >= 0);

        input.close();
    }
}
