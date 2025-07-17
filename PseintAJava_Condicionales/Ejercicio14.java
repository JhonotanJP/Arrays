import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia, mes, año;

        System.out.println("Ingrese una fecha para indicar si la fecha es correcta");
        System.out.println("Ingrese la fecha:");

        System.out.print("Ingrese día (1-30): ");
        dia = input.nextInt();

        System.out.print("Ingrese mes (1-12): ");
        mes = input.nextInt();

        System.out.print("Ingrese año: ");
        año = input.nextInt();

        // Condición corregida: 
        // El día debe estar entre 1 y 30, y el mes entre 1 y 12 (ambos inclusive)
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha inválida");
        }

        input.close();
    }
}
