import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número par o impar o 0 para salir: ");
            num = input.nextInt();

            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println("Su número es par");
                } else {
                    System.out.println("Su número es impar");
                }
            }
            // Si es 0 no muestra nada y termina el bucle
        } while (num != 0);

        input.close();
    }
}
