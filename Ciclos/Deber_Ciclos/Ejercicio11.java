import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // datos de entrada
        int inicio, fin;
        //dato de salida 
        int contadorPrimos = 0; // tambien va ser el contador de números primos
        int divisor = 2; 
        boolean esPrimo = true; // Suponemos que es primo
        // ingreso de datos
        System.out.println("Ingrese el inicio del rango:");
        inicio = teclado.nextInt();
        System.out.println("Ingrese el límite superior del rango:");
        fin = teclado.nextInt();

        // donde numero  va ser igual a inicio
        int num = inicio;

        // repetir para cada número en el rango
        do {
            // Verificar si el número es primo
            if (num <= 1) {
                // No es primo si es menor o igual a 1
                num++;
                continue; // Pasar al siguiente número
            }


            // Verificar divisibilidad
            do {
                if (num % divisor == 0) {
                    esPrimo = false; // No es primo si es divisible
                    break; // saltarse el paso
                }
                divisor++;
            } while (divisor <= Math.sqrt(num)); // Verificar hasta la raíz cuadrada del número

            // Si es primo, incrementar el contador
            if (esPrimo) {
                contadorPrimos++;
            }

            num++; // Incrementar el número actual
        } while (num <= fin); // Continuar hasta el límite superior

        // resultado del rango de primos 
        System.out.println("El rango de números contiene " + contadorPrimos + " números primos.");

        teclado.close();
    }
}