import java.util.Scanner;

public class Ejercicio13 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double[]  temMaxima = new double[5];
    double[] temMinima =  new double [5];
    double [] temMedia = new double [5];
    int diaMin = 0, diaMax = 0;
System.out.println("-----Temperatura de 5 dias ------");
    for (int i = 0; i < temMaxima.length; i++) {
        System.out.println("--------Dia "+(i+1)+"--------");
        System.out.println( "Ingrese temperatura Maxima ");
        temMaxima[i]= teclado.nextDouble();
        System.out.println("Ingerse temperatura Minima ");
        temMinima[i]= teclado.nextDouble();
        temMedia[i]=(temMaxima[i]+temMinima[i])/2 ;
    }
    for (int i = 0; i < 5; i++) {
        System.out.println("Día " + (i + 1) + ": " + temMedia[i] + "°C");
    }
    for (int i = 1; i < 5; i++) {
        if (temMedia[i] < temMedia[diaMin]) {
            diaMin = i;
        }
        if (temMedia[i] > temMedia[diaMax]) {
            diaMax = i;
        }
    }

    System.out.println("Día con temperatura media más baja: Día " + (diaMin + 1) + " (" + temMedia[diaMin] + "°C)");
    System.out.println("Día con temperatura media más alta: Día " + (diaMax + 1) + " (" + temMedia[diaMax] + "°C)");



}
}
