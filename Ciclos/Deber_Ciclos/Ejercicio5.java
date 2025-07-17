import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // datos de entrada
        int numero, digito;
        boolean encontrado = false; // Bandera para indicar si se encontró el dígito
        
        // datos de salida
        int tempnumero ;
        int posicion = 0; 

        // ingreso de datos
        System.out.println("Ingrese un número:");
        numero = teclado.nextInt();
        System.out.println("Ingrese el dígito a buscar:");
        digito = teclado.nextInt();

        // convertir el número a positivo si es negativo
        numero = Math.abs(numero);
        tempnumero = numero;

        // repetir hasta que finalizar con los digitos 
        do {
            // obtener el ultimo dígito del número
            int ultimoDigito = tempnumero % 10;

            // Verificar si el último dígito es igual al dígito buscado
            if (ultimoDigito == digito) {
                encontrado = true; // Se encontró el dígito
                break; // Salir del bucle
            }

            // Eliminar el último dígito del número
            tempnumero /= 10;
            posicion++; // incrementar la posición
        } while (tempnumero > 0); // continuar hasta que no queden más dígitos

        // resultado si encontrado es verdadero 
        if (encontrado) {
            System.out.println("El dígito " + digito + " se encuentra en el número " + numero + ".");
        } else {//sino no se encontro
            System.out.println("El dígito " + digito + " no se encuentra en el número " + numero + ".");
        }

        teclado.close();
    }
}