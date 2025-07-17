import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia, mes, año;

        System.out.println("Ingrese una fecha para indicar si la fecha es correcta con meses de 28, 30 y 31 días");

        System.out.print("Ingrese el día (1-31): ");
        dia = input.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        mes = input.nextInt();

        System.out.print("Ingrese el año: ");
        año = input.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("El mes ingresado no es válido. Debe estar entre 1 y 12.");
        } else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                // Meses con 31 días
                if (dia < 1 || dia > 31) {
                    System.out.println("El día ingresado no es válido. Debe estar entre 1 y 31.");
                } else {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                // Meses con 30 días
                if (dia < 1 || dia > 30) {
                    System.out.println("El día ingresado no es válido. Debe estar entre 1 y 30.");
                } else {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                }
            } else {
                // Febrero (28 días)
                if (dia < 1 || dia > 28) {
                    System.out.println("El día ingresado no es válido. Debe estar entre 1 y 28.");
                } else {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                }
            }
        }

        input.close();
    }
}
