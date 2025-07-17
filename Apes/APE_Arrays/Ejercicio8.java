import java.util.Scanner;

public class Ejercicio8 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double NotaSub=0 ;
    double max =0 ,min = 10 ;
    double med = 0;
    double[]Notas = new double[5];
    System.out.println("------Ingreso  de Notas ----");
    for (int i = 0; i <Notas.length; i++) {
        System.out.println("Nota "+(i+1));
        Notas[i]=teclado.nextDouble();
        NotaSub=NotaSub+Notas[i];

        if (Notas[i]>max){
            max=Notas[i];
        }
        if (Notas[i]<min) {
            min=Notas[i];      
        }
    }
    System.out.println("------ La Notas   Son  - --  ");
    for (int i = 0; i < Notas.length; i++) {
        System.out.println(Notas[i]);
    }
    med = NotaSub/Notas.length ;
    System.out.println("\nNota media: " + med);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

   
}
}
