import java.util.Random;
import java.util.Scanner;

public class Matrices {



    public static void CargarMatricesEnteras (int[][] _matriz){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargar Matriz ");
        for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.print("Ingresa el valor : "+f+"  " +c +" : ");
                _matriz[f][c]= teclado.nextInt();
            }  
  
        }


    }
        public static void ImprimirMatricesEnteras(int[][]_matriz){
            System.out.println("Imprimir matrices");
            for (int f = 0; f < _matriz.length; f++) {
                for (int c = 0; c < _matriz[0].length; c++) {
                    System.out.print("V["+f+"]["+c+"] = "+_matriz[f][c]);
                    System.out.print("\t");
    
                }  
                System.out.println("\n");
            }

        }

        public static void CargasMatrizAleatoriasEntero(int[][]_matriz,int RangoIncial,int RangoFinal){
            Random rd= new Random() ;
            System.out.println("Cargar Matriz ");
          for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.print("Ingresa el valor : "+f+"  " +c +" : ");
                _matriz[f][c]= rd.nextInt(RangoIncial,RangoFinal);

            }  
        }
        }

        public static int  NumerodeVecesGano(int[][] _matriz){
            int devolverVictorias=0 ;
            for (int f= 0; f< _matriz.length; f++) {
              if(_matriz[f][0]==_matriz[f][1]){
                devolverVictorias++;
              }
                
            }
            return devolverVictorias;

        }

    public static void main(String[] args) throws Exception {
       
        System.out.println("Hello, World!");
            //fila(horizontal),columna(vectical)
        // 1)Longitud Fija
        int[][] matriz= new int[3][4];
        //2)Matriz con valores definidos 
        int [][]matriz2 = new int [][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        //3) valores por demandas 
        int [][] matriz3 ;
        int filas = 3 ;
        int columnas =4;
        matriz3= new int[filas][columnas];
        int [][] matriz4 = new int[2][2];
        //conocer el numero de filas y columna de una matriz 
        System.out.println("Numero de filas = "+matriz2.length);
        System.out.println(" Numero de columnas = "+matriz[0].length);

        //desplazar verticalmente(Fila,Columna)
        ///desplazar Horizontalmente(Columna,Fila)


        //carga manual 
       // CargarMatricesEnteras(matriz);
        //CargarMatricesEnteras(matriz3);
       // CargarMatricesEnteras(matriz4);
       // ImprimirMatricesEnteras(matriz2);



        //Carga aleatoria

       ////CargasMatrizAleatoriasEntero(matriz3, 1, 11);
       // ImprimirMatricesEnteras(matriz);
        //ImprimirMatricesEnteras(matriz3);


System.out.println("DADOS ");
        int [][] matrizDados= new int[20][2];
        CargasMatrizAleatoriasEntero(matrizDados, 1, 6);
        System.out.println(    NumerodeVecesGano(matrizDados));

        




    }
}
