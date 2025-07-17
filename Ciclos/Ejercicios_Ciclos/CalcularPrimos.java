import java.util.Scanner;

public class CalcularPrimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número límite para buscar primos: ");
        int limite = input.nextInt();

        System.out.println("Números primos entre 2 y " + limite + ":");

        // Recorremos todos los números desde 2 hasta el límite
        for (int num = 2; num <= limite; num++) {
            boolean esPrimo = true;

            // Verificamos si 'num' es divisible por algún número entre 2 y num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    esPrimo = false; // No es primo porque tiene divisor
                    break; // Salir del ciclo interno
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
            }
        }

        input.close();
    }
}
