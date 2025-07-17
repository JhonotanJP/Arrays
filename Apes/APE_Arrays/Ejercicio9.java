
import java.util.Arrays;
import java.util.Random;

public  class  Ejercicio9{




    public static void main(String[] args) {
        Random rd = new Random();
        int[] vector = new int[6];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=rd.nextInt(10 );
        }
        System.out.println("El vector sin ordenar");
        for (int i =0 ;i<vector.length;i++){
            System.out.print(vector[i]+"  ");

        }
        System.out.println("");
        System.out.println("El vector ordenado es :");
       Arrays.sort(vector);
       for (int i = 0; i < vector.length; i++) {
           System.out.print(vector[i]+"  ");
       }



    }
}