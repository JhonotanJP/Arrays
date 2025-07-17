import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia, mes, año;
        int dia2, mes2, año2;

        System.out.println("Ingrese dos fechas para mostrar el número de días que hay de diferencia");

        System.out.print("Ingrese primer fecha - día (1-30): ");
        dia = input.nextInt();

        System.out.print("Ingrese primer fecha - mes (1-12): ");
        mes = input.nextInt();

        System.out.print("Ingrese primer fecha - año: ");
        año = input.nextInt();

        System.out.println("Ingrese segunda fecha:");

        System.out.print("Ingrese segundo día (1-30): ");
        dia2 = input.nextInt();

        System.out.print("Ingrese segundo mes (1-12): ");
        mes2 = input.nextInt();

        System.out.print("Ingrese segundo año: ");
        año2 = input.nextInt();

        // Validar fechas
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || dia2 < 1 || dia2 > 30 || mes2 < 1 || mes2 > 12) {
            System.out.println("Fecha no válida");
        } else {
            // Calcular equivalentes en días (asumiendo meses de 30 días y años de 12 meses)
            int opm = mes * 30;
            int opa = año * 12 * 30;

            int opm2 = mes2 * 30;
            int opa2 = año2 * 12 * 30;

            // Calcular diferencia absoluta en días
            int res = (dia + opm + opa) - (dia2 + opm2 + opa2);
            int diferencia = Math.abs(res);

            System.out.println("La diferencia en días es de " + diferencia);
        }

        input.close();
    }
}
