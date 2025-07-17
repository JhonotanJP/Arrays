import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Datos de entrada
        int numero, base,residuo;
        StringBuilder resultado = new StringBuilder(); // Para almacenar el resultado

        // Ingreso de datos
        System.out.println("Ingrese un número entero en base 10:");
        numero = teclado.nextInt();
        System.out.println("Ingrese la base a la que desea convertir (menor que 10):");
        base = teclado.nextInt();

        // Validar que la base sea menor que 10
        if (base < 2 || base >= 10) {
            System.out.println("La base debe ser un número entre 2 y 9.");
            teclado.close();
            return;
        }

        // el cambio de la base hasta que sea numero mayor a 0
        do {
            residuo = numero % base; // Obtener el residuo
            resultado.append(residuo); // Agregar el residuo al resultado
            numero /= base; // Dividir el número por la base
        } while (numero > 0); 

        // funcion para invertir y se el resultado original
        resultado.reverse();

        // Mostrar el resultado
        System.out.println("El número en base " + base + " es: " + resultado);

        teclado.close();
    }
}