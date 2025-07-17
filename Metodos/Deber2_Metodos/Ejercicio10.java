import java.util.Scanner;

public class Ejercicio10 {


    public static void multiplicarMatrices(
        int a11, int a12,
        int a21, int a22,
        int b11, int b12,
        int b21, int b22) {

        int c11 = a11 * b11 + a12 * b21;
        int c12 = a11 * b12 + a12 * b22;
        int c21 = a21 * b11 + a22 * b21;
        int c22 = a21 * b12 + a22 * b22;

        System.out.println("Resultado de la multiplicación (C = A * B):");
        System.out.println(c11 + "\t" + c12);
        System.out.println(c21 + "\t" + c22);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a11,a12,a21,a22;
        int b11,b12,b21,b22 ;
        
        // Matriz A
        System.out.println("Ingrese los elementos de la matriz A (2x2):");
        System.out.print("A11: ");
        a11 = teclado.nextInt();
        System.out.print("A12: ");
         a12 = teclado.nextInt();
        System.out.print("A21: ");
         a21 = teclado.nextInt();
        System.out.print("A22: "); 
        a22 = teclado.nextInt();

        // Matriz B
        System.out.println("Ingrese los elementos de la matriz B (2x2):");
        System.out.print("B11: "); 
        b11 = teclado.nextInt();
        System.out.print("B12: "); 
        b12 = teclado.nextInt();
        System.out.print("B21: ");
        b21 = teclado.nextInt();
        System.out.print("B22: ");
        b22 = teclado.nextInt();

        // Llamar a la función para multiplicar
        multiplicarMatrices(a11, a12, a21, a22, b11, b12, b21, b22);

    }
}

