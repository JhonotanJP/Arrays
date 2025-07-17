import java.util.Scanner;
//Ejercicios: Encontrar el máximo, mínimo y promedio en un vector (5 numeros )

public class Ejercicio1 {

    // metodo para poder calcular el maximo
    public static int CalcularMaximo(int[] numero_) {
        int maximo = 0;
        for (int i = 0; i < numero_.length; i++) {
            if (numero_[i] > maximo) {
                maximo = numero_[i];
            }

        }
        return maximo;
    }
    // metodo para poder calcular el minimo

    public static int CalcularMinimo(int[] numero_) {
        int minimo = 10000;
        for (int i = 0; i < numero_.length; i++) {
            if (numero_[i] < minimo) {
                minimo = numero_[i];
            }

        }
        return minimo;
    }

    // metodo para poder calcular el promedio
    public static double Promdio(int[] numero_) {
        double promedio = 0;
        for (int i = 0; i < numero_.length; i++) {
            promedio = numero_[i] + promedio;

        }
        return promedio / numero_.length;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        // declarar el vector con cinco posiciones
        int[] vector = new int[5];
        System.out.println("---- Ingreso de Numeros ---- ");
        // Se utiliza el for para poder ingresar los valores por teclado
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" Ingreso numero " + (i + 1));
            vector[i] = teclado.nextInt();

        }
        // llamamos a la funcion para calcular maximo
        System.out.print("El numero mayor es  :");
        System.out.println(CalcularMaximo(vector));
        // llamamos a la funcion para calcular minimo
        System.out.print("El numero menor es  :");
        System.out.println(CalcularMinimo(vector));
        // llamamos a la funcion para calcular promedio
        System.out.print("El promedio del vector es : ");
        System.out.println(Promdio(vector));

        teclado.close();
    }
}
