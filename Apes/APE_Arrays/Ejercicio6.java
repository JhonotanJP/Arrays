
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        String[] Coches = new String[8];
        Coches[0]="Alfa Romeo";
        Coches[1]= "Fiat";
        Coches[2]="Ford";
        Coches[3]="Lancia";
        Coches[4]="Renault";
        Coches[5]="Seat";
        //ingerse de los dos marcas 
        Coches[6]="Opel";
        Coches[7]="Citroen";
        Arrays.sort(Coches);
        System.out.println("Imprimir los coches de manera ordenada ");
       for (int i = 0; i < Coches.length; i++) {
          System.out.println(Coches[i]);
       }
        
    }

}
