public class Ejercicio2{

public static void main(String[] args) {
    int[][] diagonal = new int [5][5];
    for (int f = 0; f < diagonal.length; f++) {
        for (int c = 0; c < diagonal[0].length; c++) {
           if(f ==c){
            diagonal[f][c]=1 ;
           }

        }
        
    }
    //item 1 : Carga la tabla de forma que los componentes pertenecientes a la diagonal de la
    //matriz tomen el valor 1 y el resto el valor 0.
    System.out.println(" Item N° 1 : Imprimir diagonal 1 ");
    for (int f = 0; f < diagonal.length; f++) {
        for (int c = 0; c < diagonal[0].length; c++) {
            System.out.print(diagonal[f][c]+"\t");

        }
        System.out.print("\n");
    }
}

}