
import java.util.Scanner;

public class Ejercicio9 {

    public static boolean Palindromo(String p) {
        int izquierda = 0;
        int derecha = p.length() - 1;
        boolean esPalindromo = true;

        while (izquierda < derecha) {

            if (p.charAt(izquierda) != p.charAt(derecha)) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }

        return esPalindromo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la palabra ");
        String palabra = teclado.nextLine();

        if (Palindromo(palabra) == true) {
            System.out.println("la palabra es palindromo ");
        } else {
            System.out.println("la palabra no es palindromo ");
        }
    }
}