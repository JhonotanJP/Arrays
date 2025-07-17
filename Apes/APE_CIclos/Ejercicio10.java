import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // datos de entrada
        String numero;
        int base;
        // bandera para verificar si pertenece a la base
        boolean pertenecebase = true;
        int i = 0; // Inicializamos el índice para recorrer los dígitos

        // Ingreso de datos
        System.out.println("Ingrese un número:");
        numero = teclado.nextLine();
        System.out.println("Ingrese la base:");
        base = teclado.nextInt();

        // Repetir hasta que se hayan revisado todos los dígitos
        do {
            // Obtener el dígito actual como carácter
            char digitoChar = numero.charAt(i);
            // Convertir a valor numérico
            int digito = Character.getNumericValue(digitoChar);

            // Si el dígito es mayor o igual a la base, cambiar la bandera
            if (digito >= base) {
                pertenecebase = false; // No pertenece a la base
                break; // Salir del bucle si encontramos un dígito inválido
            }
            // Incrementar el índice para revisar el siguiente dígito
            i++;
        } while (i < numero.length());

        // Resultado
        if (pertenecebase) {
            System.out.println("El número " + numero + " pertenece a la base " + base + ".");
        } else {
            System.out.println("El número " + numero + " no pertenece a la base " + base + ".");
        }

        teclado.close();
    }
}