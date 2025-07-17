import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      //datos de entrada
      int num ;
      //datos de salida
      int contadorpares = 0,digito;
      //ingreso de datos
      System.out.print("Introduce un número: ");
      num=teclado.nextInt();
      //mientras sea diferente de sero hacer 
      while (num>0) {
         //sacar el modulo para sacar el digito del ultimo
         digito  = num % 10;
         //si el modulo de 2 es igual a 0 ,estonces es par 
         if (digito % 2 == 0) {
            //aumenta 1 para el contador si es para
            contadorpares++;
         }
         //para sacar el siguiente digito hasta acabar
         num/=10;
      }
      //imprimir el contador total
      System.out.println("La cantidad de dígitos pares es: " + contadorpares);
      teclado.close();
   }
}
