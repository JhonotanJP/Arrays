import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = teclado.nextInt();//leer dia
        System.out.print("Ingrese el mes: ");
        int mes = teclado.nextInt();//leer mes
        System.out.print("Ingrese el año: ");
        int año = teclado.nextInt();//leer año

        // Determinar si el año es bisiesto
        boolean bisiesto = false;
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {/// si es multiplo de 4 y 400 y no de 100 entonces es bsiesto
            bisiesto = true;
        }

        // Determinar el número de días en el mes
        int diasEnMes=0;
        if (mes == 2) {//febrero
            diasEnMes = bisiesto ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {//abril,junio,septiemnre y noviembre            diasEnMes = 30;
        } else {
            diasEnMes = 31;//enero,marzo,mayo,julio,agosto,octubre y diciembre
        }

        // Calcular el día siguiente
        dia++;
        if (dia > diasEnMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }

        // Mostrar la fecha del día siguiente
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
        teclado.close();//cerrar el teclado
    }
}