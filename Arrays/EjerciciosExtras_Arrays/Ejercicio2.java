
import java.util.Random;


///Dado un vector de 10 numeros (Aleatorios )dar el cuadrado y el cubo con otro vectores 
public class Ejercicio2 {
//metodo para poder calcular dar valores con el random 
    public static void ValoresRandom(int Inicila,int Final,double[] _vector){
        Random rd = new Random();
        for (int i = 0; i < _vector.length; i++) {
        _vector[i]= rd.nextInt(Inicila,Final);
        }

    }
    //metodo para imprimir el vector 
    public static void ImprimirMatriz(double[] vector_){
        for (int i = 0; i < vector_.length; i++) {
            System.out.print(vector_[i]+"\t");
        } 
        System.out.println();
    }
    //metodo para calcular el cuadrado y el cubo del numero 
    public static void CuadradoyCubo(double[] Vectorelevado,double[] vector,int elevado){
        for (int i = 0; i < vector.length; i++) {
            Vectorelevado[i] = Math.pow(vector[i], elevado);
            
        }
    }

public static void main(String[] args) {
    double[] vector =new double[10]; //se va a declarar tres vectores 
    double[] vectorCuadrado= new double[10];
    double[]vectorCubo = new double[10];
    ValoresRandom(0, 11, vector);
    System.out.println("N 1"+"\t"+"N 2"+"\t"+"N 3"+"\t"+"N 4"+"\t "+
    "N 5"+"\t"+"N 6"+"\t"+"N 7"+"\t"+"N 8"+"\t"+"N 9"+"\t"+"N 10");
    //llamamos a las funciones 
ImprimirMatriz(vector);

CuadradoyCubo(vectorCuadrado, vector, 2);
CuadradoyCubo(vectorCubo, vector, 3);
//llamamos a la funcion para que imprima los numeros 
ImprimirMatriz(vectorCuadrado);
ImprimirMatriz(vectorCubo);

    
}





}
