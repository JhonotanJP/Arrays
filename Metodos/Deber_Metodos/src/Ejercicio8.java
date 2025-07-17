
import java.util.Scanner;

public class Ejercicio8 {
private Scanner teclado ;
public void  Ingreso(){
    teclado=new Scanner(System.in);
    double radio,generatriz,altura ;
    System.out.print("Ingrese el radio del cono: ");
    radio = teclado.nextDouble();
    System.out.print("Ingrese la generatriz del cono: ");
    generatriz = teclado.nextDouble();
    System.out.print("Ingrese la altura del cono: ");
    altura = teclado.nextDouble();
    //donde mandamoa a llamar el metodo para calcular el area base 
    System.out.println("-----Area Base-----");
    System.out.println(AreaBase(radio));
     //donde mandamoa a llamar el metodo para calcular el area lateral 
    System.out.println("---Area   Lateral ---  ");
    System.out.println(AreaLateral(radio, generatriz));
      //para calcular el area total va ser la suma del area lateral y base  
    System.out.println("----- Area Total ----");
   double Totalarea =AreaBase(radio) +  AreaLateral(radio, generatriz);
   System.out.println(Totalarea);
    //donde mandamoa a llamar el metodo para calcular el volumen 
   System.out.println("------ Volumen ------ ");
   System.out.println(Volumen(radio, altura));


}
//metodo para calcular el area base 
public double AreaBase(double r){
   double area =Math.PI*Math.pow(r, 2);
   return area ;
}
///metodo para calcular el arealateral 
public double AreaLateral(double r ,double g){
    double lateral=Math.PI*g*r;
    return lateral ;
}
//metodo para poder calcular el volumen 
public double Volumen ( double r ,double alt){
    double volumen = (1.0 / 3) * Math.PI * Math.pow(r, 2) * alt;
    return volumen;
}
public static void main(String[] args) {
    Ejercicio8 ej = new Ejercicio8();///instanciar la clase   
    ej.Ingreso();
}


}