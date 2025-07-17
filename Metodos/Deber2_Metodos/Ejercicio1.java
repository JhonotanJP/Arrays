import java.util.Scanner;

public class Ejercicio1{


    public static double CalcularArea(double lado ){
    double AreaCuadrado=Math.pow(lado, 2);
        return AreaCuadrado;
    }

    public static double CalcularPerimetro(double lado){
        double PerimetroCuadrado = Math.pow(lado, 4);
        return PerimetroCuadrado;

    }
    



    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner(System.in);
        double lado ;
        System.out.println("Ingrese el Lado del cuadrado");
        lado = teclado.nextDouble();
        ///metodo para poder calcular el area del cuadrado 
        System.out.println(CalcularArea(lado));
        //metodo para poder calcular el perimetro del cuadrado 
        System.out.println(CalcularPerimetro(lado));

        teclado.close();

    }
}
