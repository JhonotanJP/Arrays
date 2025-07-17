import java.util.Scanner ;
public class Ejercicio2{

private Scanner teclado ;


public void Ingreso(){
teclado = new Scanner(System.in);
int numero1,numero2 ,numero3 ,numero4,numero5 ;
System.out.println("Suma de cinco numeros ");
///ingreso de datos 
System.out.println("Ingrese numero 1");
numero1=teclado.nextInt();
System.out.println("Ingrese numero 2");
numero2=teclado.nextInt();
System.out.println("Ingrese numero 3");
numero3=teclado.nextInt();
System.out.println("Ingrese numero 4");
numero4=teclado.nextInt();
System.out.println("Ingrese numero 5");
numero5=teclado.nextInt();
//llamar  a la funcion para luego imprimir 
System.out.println(Suma(numero1, numero2, numero3, numero4, numero5));
}
///se crea una funcion llamada suma 
public int Suma(int num1,int num2,int num3,int num4,int num5 ){
int Suma; //se crea un variable la cual va a regresar 
Suma=num1+num2 +num3 +num4+num5 ;
return Suma ;
}
public static void main(String[] args) {
    Ejercicio2 ej1 = new Ejercicio2();  //instanciar la clase 
    ej1.Ingreso();
}

}
