
import java.util.Scanner;

public class Ejercicio9 {
private Scanner teclado ;
public void Ingreso(){
    teclado=new Scanner(System.in);
    double radio ;
    System.out.println("Ingrese el radio de la esfera");
    radio =teclado.nextDouble();
    //calcular el area 
    System.out.println("-----Area de una esfera -----");
    System.out.println(Area(radio));
     ///calcular el volumen 
    System.out.println("-----Volumen de una esfera -----");
    System.out.println(Volumen(radio));

}
//metodo del area de la esfera 
public double Area(double r ){
    double area = 4 * Math.PI*Math.pow(r, 2);
    return area ;
}
//metodo del volumen  de la esfera 
public double Volumen (double r ){
double volumen = (4.0 / 3)*Math.PI*Math.pow(r, 3);
return volumen ;
}

public static void main(String[] args) {
    Ejercicio9 ej = new Ejercicio9();///instanciar la clase 
    ej.Ingreso();
}


}
