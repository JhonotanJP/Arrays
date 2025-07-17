import java.util.Scanner;

//Diseñar un algoritmo para calcular el producto de un número por un vector numérico de 10 elementos.

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaración del vector de 10 elementos
        int[] vector = new int[10];
        int[] resultado = new int[10];

        // Ingreso de los 10 elementos del vector
        System.out.println("------ Ingreso de los 10 elementos del vector ------");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }

        // Ingreso del número por el que se va a multiplicar el vector
        System.out.print("Ingrese el número a multiplicar: ");
        int numero = teclado.nextInt();

        // Cálculo del producto en el vector resultado 
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * numero;
        }

        // Imprimir el  vector  resultado 
        System.out.println("------ Resultado del producto del vector por " + numero + " ------");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + resultado[i]);
        }
    }
}