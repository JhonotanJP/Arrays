
import java.util.Scanner;

public class Ejercicio10 {
private Scanner teclado ;
public void Ingreso (){
    teclado= new Scanner(System.in);
    double lado ;
    System.out.println("Ingrese el lado del hexaedro (cubo): ");
    lado=teclado.nextDouble();
    //calcular el area base de un cubo 
    System.out.println("------ Area Base -------");
    System.out.println(AreaBase(lado));   
     //calcular el area lateral de un cubo 
    System.out.println("------ Area Lateral -------");
    System.out.println(AreaLateral(lado));
        //calcular el area total de un cubo 
    System.out.println("------ Area Total  -------");
    System.out.println(AreaTotal(lado));
        //calcular el volumen de un cubo 
    System.out.println("------ Volumen  -------");
    System.out.println(Volumen(lado));
}
//metodo para calcular el area base 
public double  AreaBase(double lad){
    double areabase=Math.pow(lad, 2);
return areabase ;
}
//metodo para calcular el area lateral 
public double  AreaLateral(double lad){
    double lateral = 4 *Math.pow(lad, 2);
    return lateral ;
    //metodo para calcular el area total 
}
public double AreaTotal(double lad ){
    double Total = 6 * Math.pow(lad, 2);
    return Total ;
}
//metodo para calcular el volumen
public double Volumen (double lad ){
   double  volumen = Math.pow(lad, 3);
   return volumen ;
}
public static void main(String[] args) {
    Ejercicio10 ej = new Ejercicio10(); //instanciar la clase 
    ej.Ingreso();
}
}
