//dado tres vectores dar el producto de esta en otro vector con aleatorio 
import java.util.Random;
public class Ejercicio8 {
    //metodo para que imprima los vectores 
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println();
    }
   
    
        public static void main(String[] args) {
            int tamaño = 5; // Tamaño de los vectores
            int[] Vector1 = new int[tamaño];
            int[] Vector2 = new int[tamaño];
            int[] Vector3 = new int[tamaño];
            int[] Resultado = new int[tamaño];
    
            Random rand = new Random();
    
            // Rellanar los tre vectores con numeros random
            for (int i = 0; i < tamaño; i++) {
                Vector1[i] = rand.nextInt(10) + 1;
                Vector2[i] = rand.nextInt(10) + 1;
                Vector3[i] = rand.nextInt(10) + 1;
    
                // Producto de los tres vectores
                Resultado[i] = Vector1[i] * Vector2[i] * Vector3[i];
            }
    
            // LLmar la funcion para que imprima los vectores 
            System.out.println("Vector A: ");
            mostrarVector(Vector1);
            System.out.println("Vector B: ");
            mostrarVector(Vector2);
            System.out.println("Vector C: ");
            mostrarVector(Vector3);
            //verificar si se imprime el resultante
            System.out.println("Vector Resultado (A * B * C): ");
            mostrarVector(Resultado);
        }
    
     
    }
    


