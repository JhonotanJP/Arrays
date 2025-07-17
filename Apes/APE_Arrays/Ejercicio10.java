import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] vector1 = new int[5];
    int [] vector2 = new int[5];
    int[] vector3  =new int[5];
    for (int i = 0; i < vector1.length; i++) {
        System.out.println("Ingrese datos del vector 1 numero "+(i+1));
        vector1[i]=teclado.nextInt();
        System.out.println("Ingrese datos del vector 2  numero "+(i+1));
        vector2[i]=teclado.nextInt();
    }
    for (int i = 0; i < vector1.length; i++) {
         vector3[i]=vector1[i]+vector2[i];

    }
    for (int i = 0; i < vector3.length; i++) {
        System.out.println(vector1[i]+"  +  "+vector2[i]+"  =  "+vector3[i]);
    }

}
}
