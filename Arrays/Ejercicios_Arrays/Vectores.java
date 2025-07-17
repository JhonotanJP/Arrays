
import java.util.Scanner;


public class Vectores {

    public  static void ImprimirLongitudVector(Object[]vector ){
        //conversion de object al tipo de dato del vector 
        System.out.println(vector.length);


    }
    
    public static void ImprimrVectoresEnteros(int[] vector ){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    public static void ImprimrVectoresDoubles(double[] vector ){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    public static double PromedioCalificaciones (double []vector  ){
        double acumulador  =0 ;
        for (int i = 0; i < vector.length; i++) {
            acumulador =vector[i]+acumulador ;
        }
       double promedio =  acumulador /vector.length;
        return promedio ;
    }

    public static void CargarValoresEnVectorDouble(double[] vector ){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valor "+i );
               vector [i]=teclado .nextDouble();
           }

    }



    public static void main(String[] args) {
        ///primer metodo-longitud definida
        int[] edades = new int[6];
        edades[0] = 5;
        edades[1] = 6;
        edades[2] = 2;
        edades[3] = 8;
        edades[4] = 7;
        edades[5] = 9;
        String[] Profesores = new String[2];
        Profesores[0] = "Hernan";
        Profesores[1] = "Ruben";

        ///metodo 2 - con valores preeswtablecidos 
        double[] calificaciones = new double[] { 5.4, 7.8, 6.7,9.2,8.1,2.4,8.1  };
        int[] estaturas = { 165, 172, 152, 300 };
        ///metodo 3 - bajo demanda
        /// declarar el vector 
        int[] delitos;
        int longitudVector = 4;
        ///Instanciar 
        delitos = new int[longitudVector];
        delitos[0] = 1500;
        delitos[1] = 1000;
        delitos[2] = 1200;
        delitos[3] = 1600;

        //pra obtener la logitud  vectores
        System.out.println("Vector edades " +edades.length);

        System.out.println("Vector Profesoresn"+Profesores.length);
        System.out.println("Vector Calificaciones :"+calificaciones.length);
       // ImprimirLongitudVector(edades );
     //   ImprimirLongitudVector(delitos);
       // ImprimirLongitudVector(calificaciones );

       //Imprimir  vectores 
       ImprimrVectoresEnteros(edades);
       ImprimrVectoresEnteros(delitos);
       ImprimrVectoresEnteros(estaturas);
       ImprimrVectoresDoubles(calificaciones);
       System.out.println("el promedio es  :");
       System.out.println(PromedioCalificaciones(calificaciones));
    
///Promedio temperatura 
double [] temperaturas = new double[5];
ImprimrVectoresDoubles(temperaturas);
CargarValoresEnVectorDouble(temperaturas); 
ImprimrVectoresDoubles(temperaturas);








    }
}
