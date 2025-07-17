import java.util.Scanner;

public class Ejercicio1 {

   public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);
      //daatos de entrada
      int contador = -1;
      int in,fn;
      //ingreso de datos
      System.out.println("ingrese un rango de numeros entero ");
      System.out.println("ingrese el inicio");
      in = teclado.nextInt();
      System.out.println("ingrese el fin");
      fn=teclado.nextInt();
      while (in>fn ||in<fn) {
         in++;
         contador++;

      }

      System.out.println(" existen " + contador + " numeros dentro  ");
      teclado.close();
   }
}