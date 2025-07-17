
import java.util.Scanner;

public class Ejercicio12 {
private Scanner teclado ;
public void Ingreso (){
    teclado = new Scanner(System.in);
    double perimetro,apotema,altura ;
    System.out.print("Ingrese el perímetro de la base: ");
     perimetro = teclado.nextDouble();

    System.out.print("Ingrese la apotema de la base: ");
     apotema = teclado.nextDouble();

    System.out.print("Ingrese la altura del prisma: ");
    altura = teclado.nextDouble();
    //calcular el area base 
    System.out.println("------- Area Base -----");
    System.out.println(AreaBase(perimetro, apotema));
    //calcular el area lateral 
    System.out.println("---- Area lateral ------");
    System.out.println(AraeaLateral(perimetro, altura));
    //calcular el area total 
    System.out.println("--- Area Total ----");
    //utiliza el metodo base  mas lateral por dos para poder calcular el total 
    double total = 2*AreaBase(perimetro, apotema)+AraeaLateral(perimetro, altura);
    System.out.println(total );
}
///metodo para calcula el area base 
public double AreaBase(double perimetro,double apotema){
double Base = (perimetro * apotema) / 2;
return Base ; 
}
//metodo para calcular el  area lateral 
public double AraeaLateral(double perimetro, double altura){ 
    double Lateral = perimetro * altura;
    return Lateral;
}

public static void main(String[] args) {
    Ejercicio12 ej = new Ejercicio12(); //instanciar la clase 
    ej.Ingreso();
}
}
