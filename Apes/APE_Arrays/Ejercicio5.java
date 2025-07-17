import java.util.Scanner;

public class Ejercicio5{

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] primos = new int[10];
        int contador = 0;
        int suma = 0;

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();
        int numero = n + 1;

        while (contador < 10) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                suma += numero;
                contador++;
            }
            numero++;
        }
        System.out.println("Los 10 primos subsecuentes son:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

        double promedio = (double) suma / primos.length;

        System.out.println("\nSuma de los primos: " + suma);
        System.out.println("Promedio de los primos: " + promedio);
    }
}

