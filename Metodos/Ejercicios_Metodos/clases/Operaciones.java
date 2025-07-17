//ingresar dos numeros valo1,val2 ;
///metodos para las operaciones suma,resta,mul,divi,resuduo 
/// 
import  java.util.Scanner;

public class Operaciones {
private int val1 ,val2 ;
private Scanner teclado ;

public void IngresoNumero (){
    teclado=new Scanner(System.in  );
    System.out.println("Ingrese numero 1");
    val1=teclado.nextInt();
    System.out.println("Ingrese numero 2");
    val2=teclado.nextInt();

}
public void Suma(){
    System.out.println("---Suma----");
    int suma =0;
    suma =val1+val2 ;
}

public void  potencia(){
    double resultado ;
    resultado=Math.pow(val1,val2 );
    System.out.println("La potencia :"+resultado);
}
public static void main(String[] args) {
    Operaciones op1= new Operaciones();
    op1.Suma();

}
}
