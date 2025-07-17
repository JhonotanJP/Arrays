import java.util.Scanner;

public class Ejercicio5{

    public static boolean Vocal(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean LetraMayuscula(char c) {
        return Character.isUpperCase(c);
    }

    public static boolean LetraMinuscula(char c) {
        return Character.isLowerCase(c);
    }

    public static boolean Numero(char c) {
        return Character.isDigit(c);
    }

    public static boolean Simbolo(char c) {
        return !Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);

        if (Vocal(caracter)) {
            System.out.println("Es una vocal.");
        } else 
        if (LetraMayuscula(caracter)) {
            System.out.println("Es una letra mayúscula.");
        } else if (LetraMinuscula(caracter)) {
            System.out.println("Es una letra minúscula.");
        } else if (Numero(caracter)) {
            System.out.println("Es un número.");
        } else if (Simbolo(caracter)) {
            System.out.println("Es un símbolo.");
        }

        teclado.close();
    }
}
