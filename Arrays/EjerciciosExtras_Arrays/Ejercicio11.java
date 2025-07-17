import java.util.Scanner;
//dado un numero en  0 y 9 ser verdadero y sino falso 
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Array que traduce valores booleanos a texto
        String[] booleanos = {"Falso", "Verdadero"};

        System.out.print("Ingrese un número entre 0 y 9: ");
        numero = teclado.nextInt();

        // Verificar si el número está entre 0 y 9
        boolean esValido = (numero >= 0 && numero <= 9);

        // Mostrar el resultado traducido
        System.out.println("Resultado: " + booleanos[esValido ? 1 : 0]);

        teclado.close();
    }
}





//Crea un array booleano con dos valores 'verdadero' y 'falso'. Este array te sirve para traduicr los valores true y false.
//  Usalo para que el script muestre un alert con el nombre vedadero si un usuario teclea un valor entre 0 y 9 y falso en el caso contrario