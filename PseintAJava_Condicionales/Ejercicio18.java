import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;

        do {
            System.out.print("Ingrese un número positivo, negativo o 0 para salir: ");
            num = input.nextDouble();

            if (num < 0) {
                System.out.println("Su número es negativo");
            } else if (num > 0) {
                System.out.println("Su número es positivo");
            }
            // Si es 0 no muestra nada y termina el bucle
        } while (num != 0);

        input.close();
    }
}
