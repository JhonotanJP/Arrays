
import java.util.Random;
import java.util.Scanner;



public class Rango {


public static void  Random(int[] vector ,int valorIncial,int valorFinal){
    Random rd = new Random();
    for (int i = 0; i <vector.length; i++) {
        vector[i]=rd.nextInt(valorIncial,valorFinal+1);
    }


}
public static void ImprimirVector(int[] vector ){
for (int i = 0; i < vector.length; i++) {
    System.out.println(vector[i]);
}
}
public static int MayorVector(int[] vector ){
    int NumeroMayor=0 ;
    for (int i = 1; i < vector.length; i++) {
       if(vector[i-1]<vector [i]){
        NumeroMayor=vector[i];
       }

    }
    return NumeroMayor;

}
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System .in);
        int logitud;
        System.out.println("Ingrese la Longitud del vector ");
         logitud =teclado.nextInt();

        int [] ValoresAleatorios= new int[logitud];
        Random(ValoresAleatorios,20,30);
        ImprimirVector(ValoresAleatorios);
        System.out.print("Numero mayor es ");
       System.out.println( MayorVector(ValoresAleatorios));
 

    }
}
