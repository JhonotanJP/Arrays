
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] Original = new String[5];
    String[] Inverso = new String[5];
    System.out.println("Ingrese 5 palabras : ");
    for (int i = 0; i < Original.length; i++) {
        
        System.out.println("Palabra "+(i+1));
        Original[i]= teclado.nextLine();
    }
    for (int i = 0; i < Original.length; i++) {
        Inverso[i]=Original[Original.length-i-1];
    }
    System.out.println("----- Devolver invero ---");
    for (int i = 0; i < Original.length; i++) {
        System.out.println(Inverso[i]);
    }
    teclado.close();
}
}
