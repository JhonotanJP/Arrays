
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[6];
        boolean[] contado = new boolean[6]; 
        int totalRepetidos = 0;

        System.out.println("------Ingrese seis números -----");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese número " + (i + 1) + ":");
            vector[i] = teclado.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            if (contado[i]) continue; // Si ya fue contado, lo saltamos

            int repeticiones = 1;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    repeticiones++;
                    contado[j] = true; 
                }
            }

            if (repeticiones > 1) {
                totalRepetidos += repeticiones;
                System.out.println("El número " + vector[i] + " se repite " + repeticiones + " veces.");
            }
        }

        if (totalRepetidos > 0) {
            System.out.println("Total de números repetidos: " + totalRepetidos);
        } else {
            System.out.println("No hay números repetidos.");
        }

        teclado.close();
    }
}

