
import java.util.Scanner;

public class Ejercicio11 {
private Scanner teclado ;
public void Ingreso(){
    teclado= new Scanner(System.in );
    double x1,x2,x3,y1,y2,y3 ;
    //ingreso de primer punto 
    System.out.println("Ingrese el Primer Punto ");
    System.out.print("Ingrese x1: ");
         x1 = teclado.nextDouble();
        System.out.print("Ingrese y1: ");
        y1 = teclado.nextDouble();
        //ingreso del segundo punto 
        System.out.println("Ingrese el Segundo  Punto ");
        System.out.print("Ingrese x2: ");
        x2 = teclado.nextDouble();
        System.out.print("Ingrese y2: ");
       y2 = teclado.nextDouble();
       System.out.println("Ingrese el Tercer  Punto ");
      //ingreso del  tercer punto 
        System.out.print("Ingrese x3: ");
         x3 = teclado.nextDouble();
        System.out.print("Ingrese y3: ");
        y3 = teclado.nextDouble();
        //calcular el area del traiangulo apartir de coordenadas 
        System.out.println("------El area del Triaangulo ------ ");
        System.out.println(CalcularAreaTriangulo(x1, y1, x2, y2, x3, y3));


}
//metodo para poder calcular mediantes coordenadas 
public double CalcularAreaTriangulo(double x1,double y1,double x2,double y2,double x3,double y3){
    double area = 0.5 * Math.abs(  x1 * (y2 - y3) +  x2 * (y3 - y1) +  x3 * (y1 - y2));
    return area ; 
}
public static void main(String[] args) {
    Ejercicio11 ej = new Ejercicio11();
    ej.Ingreso();
}
}
