import java.util.Scanner;

//Se tiene un vector de caracteres en el que se ha almacenado una frase. 
//Se requiere un algoritmo que determine si la frase es un palíndromo.

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = teclado.nextLine();

        // Convertimos la frase a minúsculas y eliminamos espacios
        frase = frase.toLowerCase().replaceAll("\\s+", "");

        // Convertimos la frase en un vector de caracteres
        char[] vector = frase.toCharArray();

        // Verificamos si es un palíndromo
        boolean esPalindromo = true;
        int i = 0;
        int j = vector.length - 1;

        while (i < j) {
            if (vector[i] != vector[j]) {
                esPalindromo = false;
                break;
            }
            //para ir comparando hasta ser inverso
            i++;
            j--;
        }
        // Imprimir dependiendo si es verdadero o falso 
        if (esPalindromo) {
            System.out.println("La frase ES un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }
}

