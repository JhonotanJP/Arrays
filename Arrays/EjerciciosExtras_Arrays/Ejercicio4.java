
import java.util.Scanner;

// Programa que lee 5 notas (entre 0 y 10), y muestra todas las notas,
// la nota media, la nota más alta y la más baja.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] VectorNotas = new int[5];  
        int notaAlta = 0;                
        int notaMenor = 10;              
        double notaMedia = 0;            

        // Ingreso de las cinco notas 
        for (int i = 0; i < VectorNotas.length; i++) {
            System.out.print("Ingrese Nota " + (i + 1) + " : ");
            VectorNotas[i] = teclado.nextInt();

            // Validar que la nota esté entre 0 y 10
            if (VectorNotas[i] > 10 || VectorNotas[i] < 0) {
                System.out.println("¡La nota no es válida!");
                teclado.close();
                return; 
            }
        }

        // Calcular media, nota más alta y más baja
        for (int i = 0; i < VectorNotas.length; i++) {
            notaMedia += VectorNotas[i];

            if (VectorNotas[i] > notaAlta) {
                notaAlta = VectorNotas[i];
            }

            if (VectorNotas[i] < notaMenor) {
                notaMenor = VectorNotas[i];
            }
        }

        // Mostrar resultados
        System.out.println("----- Impresión ------");
        for (int i = 0; i < VectorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + VectorNotas[i]);
        }

        System.out.println("La nota más alta es: " + notaAlta);
        System.out.println("La nota más baja es: " + notaMenor);
        System.out.println("La nota media es: " + (notaMedia / VectorNotas.length));
    }
}

