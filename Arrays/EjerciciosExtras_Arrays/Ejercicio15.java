import java.util.Scanner;

//Diseñar un algoritmo para llenar un arreglo con los n primeros valores de la siguiente serie: 3,4,7,16,43,124,…

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de términos de la serie: ");
        int n = teclado.nextInt();

        int[] serie = new int[n];

        // Condiciones iniciales
        if (n >= 1) serie[0] = 3;
        if (n >= 2) serie[1] = 4;

        // Generación de la serie
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] * 3 - 5;
        }

        // Mostrar la serie
        System.out.println("Serie generada:");
        for (int i = 0; i < n; i++) {
            System.out.print(serie[i] + " ");
        }
    }
}

