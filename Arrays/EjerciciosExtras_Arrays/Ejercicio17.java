import java.util.Random;

//Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100...
//pasar todos los números pares a las primeras posiciones y los impares al final.

public class Ejercicio17 {

    public static void main(String[] args) {
        //declaros vectores donde el primero no esta ordenado
        int[] numeros = new int[20]; 
        //este va ser el ordenado 
        int[] resultado = new int[20];
        int indicePar = 0;
        int indiceImpar = 19;

        Random rand = new Random();

        // Generar los 20 números aleatorios entre 0 y 100
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(101); 
            System.out.print(numeros[i] + " ");
        }

        // Separar pares de  impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                resultado[indicePar] = numeros[i];
                indicePar++;
            } else {
                resultado[indiceImpar] = numeros[i];
                indiceImpar--;
            }
        }
        // Imprimir primero los pares y luego los impares 
        System.out.println("\n\nNúmeros con pares al inicio e impares al final:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}

