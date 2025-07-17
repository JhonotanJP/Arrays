import java.util.Scanner;

public class Ejercicio9 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaNacimiento,mesNacimiento,añoNacimiento;//variables del fecha de nacido
        int diaActual,mesActual,añoActual;//variable de fecha actual
        // leer la fecha de nacimiento
        System.out.println("Introduce tu fecha de nacimiento (DIA MES AÑO): ");
        System.out.println("ingrese dia de nacido");
         diaNacimiento = scanner.nextInt();
         System.out.println("ingrese mes de nacido");
         mesNacimiento = scanner.nextInt();
         System.out.println("ingrese año de nacido");
         añoNacimiento = scanner.nextInt();
        
        // Leer la fecha actual
        System.out.print("Introduce la fecha actual (DIA MES AÑO): ");
        System.out.println("ingrese dia actual");
        diaActual = scanner.nextInt();
        System.out.println("ingrese mes actual");
        mesActual = scanner.nextInt();
        System.out.println("ingrese año actual");
        añoActual = scanner.nextInt();
        
        // Calcular la edad
        int edadAños = añoActual - añoNacimiento;
        int edadMeses = mesActual - mesNacimiento;
        int edadDias = diaActual - diaNacimiento;

        // Ajustar los cálculos si el día o el mes no son válidos
        if (edadDias < 0) {
            edadMeses--;
            // Obtener el número de días del mes anterior
            if (mesActual == 1) {
                edadDias += 31; // Enero
            } else 
            if (mesActual == 2) {
                edadDias += 28; // Febrero
            } else
             if (mesActual == 3) {
                edadDias += 31; // Marzo
            } else
             if (mesActual == 4) {
                edadDias += 30; // Abril
            } else 
            if (mesActual == 5) {
                edadDias += 31; // Mayo
            } else 
            if (mesActual == 6) {
                edadDias += 30; // Junio
            } else 
            if (mesActual == 7) {
                edadDias += 31; // Julio
            } else 
            if (mesActual == 8) {
                edadDias += 31; // Agosto
            } else 
            if (mesActual == 9) {
                edadDias += 30; // Septiembre
            } else 
            if (mesActual == 10) {
                edadDias += 31; // Octubre
            } else
             if (mesActual == 11) {
                edadDias += 30; // Noviembre
            } else 
            if (mesActual == 12) {
                edadDias += 31; // Diciembre
            }
        }

        if (edadMeses < 0) {
            edadAños--;
            edadMeses += 12;
        }

        // Mostrar la edad
        if (edadAños < 1) {
            System.out.printf("Edad:"+edadMeses+"  meses "+edadDias+ " y  días");
        } else {
            System.out.printf("Edad :"+edadAños+"  años");
        }

        scanner.close();

    }

}
