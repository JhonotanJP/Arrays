import java.util.Scanner;

public class Problema96 {
    // Principal
    public static void main(String[] args) {
        // Variables
        int n1, n2, s;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Número 2: ");
        n2 = teclado.nextInt();

        // Proceso: Llamada al método Sumar con parámetros por valor
        s = Sumar(n1, n2); // n1 y n2 se pasan por valor

        // Salida
        System.out.println("");
        System.out.println("Suma: " + s);
    }

    // Método Sumar
    private static int Sumar(int Num1, int Num2) {
        // Variables
        int s;

        // Proceso: Sumar los parámetros
        s = Num1 + Num2;

        // Salida: Retornar la suma
        return s; // Se retorna el resultado de la suma
    }
}
