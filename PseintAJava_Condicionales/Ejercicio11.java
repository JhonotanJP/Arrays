import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numer;
        int cifras = 0;

        System.out.println("Ingrese un número para saber las cifras");
        System.out.print("Ingrese un número entre 0 y 9999: ");
        numer = input.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numer < 0 || numer > 9999) {
            System.out.println("El número ingresado no está en el rango permitido.");
        } else {
            // Contar las cifras usando condiciones
            if (numer == 0) {
                cifras = 1;
            } else if (numer < 10) {
                cifras = 1;
            } else if (numer < 100) {
                cifras = 2;
            } else if (numer < 1000) {
                cifras = 3;
            } else {
                cifras = 4;
            }

            // Mostrar la cantidad de cifras
            System.out.println("El número tiene " + cifras + " cifra(s).");
        }

        input.close();
    }
}
