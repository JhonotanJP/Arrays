import java.util.Scanner;

///Crear un vector de 5 elementos de cadenas de caracteres,
///  inicializa el vector con datos leídos por el teclado. 
/// Copia los elementos del vector en otro vector pero en orden inverso,
///  y muéstralo por la pantalla.


public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //declarar dos vectores donde van a tener las mismas posiciones 
    String[] Vector = new String[5];
    String[] Inveso = new String[5];
    ///ingrese de las palabras
    System.out.println("Ingrese una palabra");
    for (int i = 0; i < Vector.length; i++) {
        System.out.print("Ingrese Palabra "+(i+1+" : "));
        Vector[i]=teclado.nextLine();
    } 
    //forma para invertir el vector en otro 
    for (int i = 0; i < Vector.length; i++) {
     Inveso[i]=Vector[Vector.length-i-1];
    } 
    //imprimir para comprar que este correcto
    System.out.println("---- Inverso -----");
    for (int i = 0; i < Vector.length; i++) {
       System.out.print("Palabra "+(i+1)+" : "+Inveso[i]);
        System.out.println();
    }
    }

}
