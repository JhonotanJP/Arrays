public class Ejercicio7 {
public static void main(String[] args) {
    double [][] matriz1 = new double[][]{
        {4,6,7},
        {9,5,6},
        {1,7,2}
    };
    double[][]  matriz2 = new double[][]{
        {8,2,3},
        {6,1,3},
        {4,5,1}
    };
    //item 1 : Calcular la suma de las dos matrices.
    double[][] SumaMatriz = new double [3][3];
    for (int f = 0; f < SumaMatriz.length; f++) {
        for (int c = 0; c < SumaMatriz[0].length; c++) {
            SumaMatriz[f][c]=matriz1[f][c]+matriz2[f][c];
        }
    }
    System.out.println(" item 2 : Suma de matrices :");
    System.out.println("Suma Matriz 1 mas Matriz 2  igual a :");
    for (int f = 0; f < SumaMatriz.length; f++) {
        for (int c = 0; c < SumaMatriz[0].length; c++) {
            System.out.print(SumaMatriz[f][c]+"\t");
            
        }
        System.out.print("\n");
        
    }
    //item 2: Calcular el promedio de todos los elementos de ambas matrices
    double suma =0;
    System.out.println(" item 2 :promedio de las dos matrices : ");
    for (int f = 0; f < SumaMatriz.length; f++) {
        for (int c = 0; c < SumaMatriz[0].length; c++) {
           suma=matriz1[f][c]+matriz2[f][c]+suma ;
            
        }     
    }
    System.out.println(" El promedio de las dos matrices es  de : "+(suma /(2*matriz1.length*matriz1[0].length)));
    //item 3 :Calcular el producto de las dos matrices (multiplicación de matrices).
    double [][] MultiplicacionMatrices = new double[3][3];
    for (int f = 0; f < matriz1.length; f++) {         
        for (int c = 0; c < matriz2[0].length; c++) {   
            suma=0 ;
            for (int k = 0; k < MultiplicacionMatrices.length; k++) { 
                suma =suma+ matriz1[f][k] * matriz2[k][c];
            }
            MultiplicacionMatrices[f][c]=suma;
        }
    }
    System.out.println(" Item N° 3 : Matriz de la multiplicacion de los matrices ");
    for (int f = 0; f < SumaMatriz.length; f++) {
        for (int c = 0; c < MultiplicacionMatrices[0].length; c++) {
            System.out.print(MultiplicacionMatrices[f][c]+"\t");
            
        }
        System.out.print("\n");
        
    }
    //item 4 :Determinar el elemento mayor de la matriz resultante de la suma.
    System.out.println("Item N° 4 :Elemento mayor del vector suma ");
    double mayor =0 ;
     for (int f = 0; f < SumaMatriz.length; f++) {
        for (int c = 0; c < SumaMatriz[0].length; c++) {
            
            if (SumaMatriz[f][c]>mayor) {
                mayor = SumaMatriz[f][c];

            }
        }
         
     }
     System.out.println("El elemento mayor de la matriz suma es: " + mayor);




}
}
