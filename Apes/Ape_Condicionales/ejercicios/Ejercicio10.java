import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Llamar al teclado
        double num1, num2, resul = 0; // Variables de entrada y salida
        String oper; // Variable para operar
        
        System.out.println("Ingrese dos números:");
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextDouble(); // Leer número 1
        
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextDouble(); // Leer número 2
        
        // Limpiar el buffer del scanner
        teclado.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.print("Ingrese operación (+, -, *, /): ");
        oper = teclado.nextLine(); // Leer operación
        
        // Comparar la operación usando equals()
        if (oper.equals("+")) {
            resul = num1 + num2; // Suma
        } else
         if (oper.equals("-")) {
            resul = num1 - num2; // Resta
        } else
         if (oper.equals("*")) {
            resul = num1 * num2; // Multiplicación
        } else 
        if (oper.equals("/")) {
                resul = num1 / num2; // División
            } else {
            System.out.println("Operación no válida."); // Restricción
            teclado.close();
            return; // Salir del programa
        }
        
        System.out.println("El resultado es: " + resul); // Imprimir resultado
        teclado.close(); // Cerrar teclado
    }
}
