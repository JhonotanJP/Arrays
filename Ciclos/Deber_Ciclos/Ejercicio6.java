import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       //dato de entrada
       int num1 ,num2 ;
       //datos salida 
       int residuo=0 ;
       //ingreso de datos
       System.out.println("Obtener el MCD (máximo común divisor)");
       System.out.print("Ingrese el primer número: ");
       num1 = teclado.nextInt();
       System.out.print("Ingrese el segundo número: ");
       num2 =teclado.nextInt();
      //mientras residuo sea 0 hacer 
       while( num2 !=  0){ 
         //residuo vas ser igual a numero1  modulo del numero 2
          residuo = num1 % num2;
          //numero 1 va ser igual a numero 2 );
          num1=num2 ;
            //numero 2 va ser igual a residuo
          num2=residuo ;

       }
       //donde MCD va se rigual a
       System.out.println("el MCD es igual a "+num1 );
       teclado.close();
    }
 }
 
