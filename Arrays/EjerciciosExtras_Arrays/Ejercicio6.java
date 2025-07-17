import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Hacer un programa que inicialice un vector de números con valores aleatorios,
// y posterior ordene los elementos de menor a mayor.
public class Ejercicio6 {

/// metodo para para valores aleatorios 
public static void DarValoresRandom(int[] vector_,int inicio,int fin){
    Random rd = new Random();
    for (int i = 0; i < vector_.length; i++) {
        vector_[i]= rd.nextInt(inicio,fin);
        
    }
}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    ///declara el vector 
    int[] NumeroAleatorios= new int[100];
    //llamar al metodo para dar valores con un rango desde 0 hasta 30
    DarValoresRandom(NumeroAleatorios, 0, 30);
    ///imprimir sin ordenar el vector 
    System.out.println("Vector sin Ordenar ");
    for (int i = 0; i < NumeroAleatorios.length; i++) {
        System.out.print(NumeroAleatorios[i]+"\t");
        
    }
    System.out.println();
    //se utiliza la siguiente funcion para ordenar 

Arrays.sort(NumeroAleatorios);
//para comprobar que este ordenado  se imprime 
System.out.println("Vector ordenado de menor a mayor:");
for (int i = 0; i < NumeroAleatorios.length; i++) {
    System.out.print(NumeroAleatorios[i]+"\t");
    
}


}
}
