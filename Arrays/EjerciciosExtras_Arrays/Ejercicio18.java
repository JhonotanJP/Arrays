import java.util.Scanner;

//Dos vectores, uno con nombres de personas y otro con la longitud de cada nombre, ambos del mismo tamaño

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres: ");
        int n = teclado.nextInt();
        //limpiar el bucle para poder escribir de nuevo 
        teclado.nextLine(); 

            //declarar los vectores que van ser igual longitud 
        String[] nombres = new String[n];
        int[] longitudes = new int[n];

        // Ingreso de nombres
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();
            longitudes[i] = nombres[i].length(); // se guarda la longitud del nombre
        }

        // Imprimir el resulado de los nombres son su longitud 
        System.out.println("\nNombre\t\tLongitud");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + "\t\t" + longitudes[i]);
        }
    }
}

