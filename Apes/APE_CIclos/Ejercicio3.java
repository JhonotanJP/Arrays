import java.util.Scanner ;
public class Ejercicio3 {
 
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       //datos de ingreso
       int num ;
       //datos de salida
       int inverso = 0;
       //ingreso de datos
       System.out.println("ingrese un numero para devolver el inverso ");
         num=teclado.nextInt();
         //hacer mientras sea diferente de 0
          while (num>0){
            //saber el digito del  digito
          int digito = num % 10;
          // invertirlo de ultimo a primero 
          inverso = inverso * 10 + digito;
          //siguiente digito
          num/=10;
          }
          //el resultado invertido 
       System.out.println("el numero inverso es " + inverso);
       teclado.close();
    }
 }
 