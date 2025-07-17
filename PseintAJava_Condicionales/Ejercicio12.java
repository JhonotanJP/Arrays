import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int original, invertido = 0;

        System.out.print("Ingrese un número entre 0 y 9999: ");
        numero = input.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El número ingresado no está en el rango permitido.");
        } else {
            original = numero;

            if (numero < 10) {
                invertido = numero;
            } else if (numero < 100) {
                invertido = (numero % 10) * 10 + (numero / 10);
            } else if (numero < 1000) {
                invertido = (numero % 10) * 100 + ((numero / 10) % 10) * 10 + (numero / 100);
            } else {
                invertido = (numero % 10) * 1000
                        + ((numero / 10) % 10) * 100
                        + ((numero / 100) % 10) * 10
                        + (numero / 1000);
            }

            if (original == invertido) {
                System.out.println("El número " + original + " es un palíndromo.");
            } else {
                System.out.println("El número " + original + " no es un palíndromo.");
            }
        }

        input.close();
    }
}
