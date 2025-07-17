
import java.util.Scanner;

public class Ejercicio8 {
    public static int NumeroInvertido(int numero ){
        int digito ;
        int invertido =0;
        while (numero !=0) { 
            digito=numero%10;
           invertido=invertido * 10+digito ;
            numero=numero/10 ;
        }
        return  invertido ;

    }


    public static void main(String[] args) {
        int numero ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------Devolver---- el---- Inverso------");
        System.out.println("Ingrese un numero  :");
        numero =teclado.nextInt();
        System.out.print("El numero invertido es :");
        System.out.println(NumeroInvertido(numero));
        
    }
}
