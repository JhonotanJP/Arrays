
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int NumeroMultiplo ;
    int ContarMultiplos =0 ;
    //inicializar el vector de posicion 6
    int []Vector = new int[6];
    System.out.println("---- Ingreso de numeros -----");
    //se utiliza el for para poder almacenar los datos en el vector 
    for(int i=0;i<Vector.length;i++){
        System.out.println("Ingrese numero "+(i+1));
        Vector[i]=teclado.nextInt();   
    }
    System.out.println("Ingrese un numero N para saber cuantos multiplos existen ");
    NumeroMultiplo = teclado.nextInt();
    ///el for ayuda a comparar cada posicion del vector con el numero N 
    for (int j = 0; j < Vector.length; j++) {
        if (Vector[j]%NumeroMultiplo==0|| NumeroMultiplo%Vector[j]==0){
            //si el numero es multiplo de n se suma mas 1 
            ContarMultiplos++ ;
        }

    }
    //se imprime cuantas veces cumplio la condicion  
    System.out.println("Existen "+ContarMultiplos+" Multiplos de "+NumeroMultiplo);
}
}
