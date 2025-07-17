
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //datos de entrada
        int num1 ;  
        //datos de salida
        int valor =0,digito;
        //ingreso de datos
        System.out.println(" Numero para devolver el signo mayor");
        System.out.println("ingrese numero 1");
        num1 =teclado.nextInt();
        //repetir hasta que de el ultimo digito
        do {
            //digito va ser igual al ultimo digito
            digito =num1%10;
            //si digito es mayor a valor va hacer
            //donde valor va empezar igual a 0
            if(digito>valor){
                //donde digito va ser el numero valor
                valor=digito;
            }
            //borrar el ultimo digito 
            num1= num1/10;

        } while (num1!=0);
        //imprimir el el valor 
        System.out.println("digito mayor es  "+valor );


        teclado.close();
    }
}