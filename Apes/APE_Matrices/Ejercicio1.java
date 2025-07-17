public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[][]{
            {5,7,3,1,2},
            {3,8,9,1,5},
            {4,6,8,9,2},
            {1,2,3,4,5},
            {2,7,4,1,1}

        };
        int suma ;
        //item 1 : Suma todos los elementos de cada fila
        System.out.println("Item N° 1 : Suma todos los elementos de cada fila");
        for (int f = 0; f < matriz.length; f++) {
            suma=0 ;
           for (int c = 0; c< matriz[0].length; c++) {
               suma=matriz[f][c]+suma;
           }
           System.out.println("la fila "+(f+1)+" : " +suma);
        }
        //item 2 :Suma todos los elementos de cada columna 
        System.out.println("Item N° 2: Suma todos los elementos de cada columna ");
        for (int c = 0; c < matriz[0].length; c++) {
            suma=0;
            for (int f = 0; f < matriz.length; f++) {
                suma=matriz[f][c]+suma;
            }
            System.out.println("la columna "+(c+1)+" : "+suma);            
        }



    }
}
