
import java.util.Scanner;


//Una vez lleno mostrará el array y deberá decir cuantos números son pares y cuantos son impares.
// La entrada de datos termina cuando el usuario teclea 0 o un valor no numérico.
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vectorNumero = new int[6];
        int impares=0;
        int pares = 0 ; 
        boolean Esprimo = true;
        int primos =0 ;

        System.out.println("-------Ingreso de numeros ----- ");
        for (int i = 0; i < vectorNumero.length; i++) {
            System.out.println("Ingreso numero "+(i+1));
            vectorNumero[i]=teclado.nextInt();
        }
        for (int i = 0; i <vectorNumero.length; i++) {
           if (vectorNumero[i]  %2 ==0){
            pares++;
           }else{
            impares++;
           }
        }
        for (int i = 0; i < vectorNumero.length; i++) {
            for (int j = 2; j < Math.sqrt(vectorNumero[i]); j++) {
                
                if (vectorNumero[i]%j==0) {
                    Esprimo= false  ;
                    break ;
                }
                if(Esprimo==true){
                    primos++;
                }
            }
        }
        System.out.print("El numero de impares es : ");
        System.out.println(impares);
        System.out.print(" El numero de pares es : ");
        System.out.println(pares);
        System.out.print("El numero  de primos es :");
        System.out.println(primos);



    }

}
