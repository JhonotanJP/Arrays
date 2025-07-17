import java.util.Scanner;
//Dados dos vectores numéricos, 
//diseñar un algoritmo que identifique y muestre los números que tienen en común.

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaración de los vectores
        int[] vector1 = new int[6];
        int[] vector2 = new int[6];

        ///se utliza dos for para dar valores a las posiciones de los vectores
        System.out.println("-------Ingreso de  dato -----------");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Ingreso del vector 1 dato " + (i + 1)+": ");
            vector1[i] = teclado.nextInt();
        }

        System.out.println("-------Ingreso de  datos 2  -----------");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Ingreso del vector  2 dato " + (i + 1)+" :");
            vector2[i] = teclado.nextInt(); // ← Aquí estaba el error, ahora se guarda en vector2
        }

        //se va ir comparando posicion de v1 con v2  para ver si no son iguales
        System.out.print("Elementos en común: ");
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    // Evitamos imprimir duplicados
                    boolean yaImpreso = false;
                    for (int k = 0; k < i; k++) {
                        if (vector1[k] == vector1[i]) {
                            yaImpreso = true;
                            break;
                        }
                    }
                    if (!yaImpreso) {
                        System.out.print(vector1[i] + "  , ");
                    }
                }
            }
        }
    }
}
