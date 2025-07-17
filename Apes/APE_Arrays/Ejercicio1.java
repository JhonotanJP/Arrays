
import java.util.Scanner;

//Dado 4 números, almacénelos en un vector; luego obtenga la suma y el promedio de los valores almacenados.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        int acumulador =0;
        double promedio ;
        //para inicializar el  vector se le pone con corchetes  con el numero de posiciones 
        int [] Vector = new int[4];
        System.out.println("------Ingrese cuatro numeros----- ");
        //ses utiliza un for para dar ingresar numeros dentro del vector 
        for(int i=0;i<Vector.length;i++){
            System.out.println("Ingrese numero "+(i+1));
            Vector[i]=teclado.nextInt();
        }
        //para poder sumar los numeros almacenados 
        for (int j=0 ;j<4;j++){
            acumulador=Vector[j]+acumulador;
        }
        //se divide para cuatro porque son cuatro notas para poder calcular el promedio 
    promedio = acumulador/4 ;
    System.out.print("El promedio es de  :");
    System.out.println(promedio);
    teclado.close();
    }
}
