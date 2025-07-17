
import java.util.Scanner;

public class Ejercicio6 {

    public static int AreaTriangulo(int base,int altura ){
        int Area= (base*altura );
        return Area ;
    }

public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    int altura;
    int base ;
    System.out.println("-----Calcular el area de un rectangulo ----");
    System.out.println("Ingrese Base :");
    base  = teclado.nextInt();
    System.out.println("Ingrese Altura : ");
    altura= teclado.nextInt();
    System.out.print("El area del rectangulo es :");
    System.out.println(AreaTriangulo(base, altura));

}
}
