
import java.util.Scanner;


public class Ejercicio3 {



public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int vector[]= new int[5];
    String TipodeOrden ;
    System.out.println("----Ingreso cinco Numeros-----");
    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese numero "+(i+1));
        vector[i]=  teclado.nextInt();
    }
    System.out.println("Ingrese la forma de orden A (Ascendete) y D(Descendente )");
    TipodeOrden=teclado.next();
    
    if(TipodeOrden.equalsIgnoreCase("A")){
        //Metodo Ascendente 
        for (int i = 0; i < vector.length-1; i++) {
            for(int j =0;j<vector.length-1-i;j++){
             if(vector[j]>vector[j+1 ]){
                 int temporal = vector[j];
                 vector[j]=vector[j+1];
                 vector[j+1]=temporal;
             }
            }
             
         }
    }else{
        ///Forma descendente 
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] < vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }
    ///imprimir dependiendo el tipo de dorma 
    for(int i =0;i<vector.length;i++){
        System.out.println(vector[i]);
    }
    teclado.close();



}
}
