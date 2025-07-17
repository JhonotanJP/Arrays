import java.util.Random;
import java.util.Scanner;

//Contar ocurrencias
//Crea un vector de 20 elementos aleatorios.
//Pide un valor y cuántas veces aparece en el vector.

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] vector = new int[20];

        // Generar números aleatorios entre 0 y 9
        System.out.print("Vector generado: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(10); // entre 0 y 9
            System.out.print(vector[i] + " ");
        }

        // Solicitar valor a buscar
        System.out.print("\n\nIngrese el número a buscar (0 a 9): ");
        int valor = teclado.nextInt();

        // Contar ocurrencias
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("El valor " + valor + " aparece " + contador + " vez/veces en el vector.");
    }
}
