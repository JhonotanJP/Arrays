
import java.util.Scanner;

 public class Ejercicio4 {

    public static int SumaDigitosPares(int numero ){
        int digito ;
        int acumulador=0 ;
        while(numero!=0){
            digito=numero %10 ;
            if (digito %2==0){
                acumulador=digito+acumulador;
            }
            numero=numero/10;
        }
        return acumulador;

    }
    public static int SumaDigitosImPares(int numero ){
        int digito ;
        int acumulador=0 ;
        while(numero!=0){
            digito=numero %10 ;
            if (digito %2==1){
                acumulador=digito+acumulador;
            }
            numero=numero/10;
        }
        return acumulador;

    }


    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int numero ;
        System.out.println("Ingrese un numero ");
        numero =teclado.nextInt();
        System.out.print("La suma de los digitos pares es :");
        System.out.println(SumaDigitosPares(numero));
        System.out.print("La suma de los digitos impares es :");
        System.out.println(SumaDigitosImPares(numero));
        teclado.close();
    }
}
