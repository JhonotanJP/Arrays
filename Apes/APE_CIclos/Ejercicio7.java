import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    //Datos de entrada
    int num1 ;
    //datos de salida
    int i=1, multiplo ;
    //ingreso de datos
System.out.println("Ingrese  cuantos multiplos de 5 ");
num1=teclado.nextInt();
//repetir hasta que el numero sea igual a i que va empezar desde 1
do {
    //para sacar el multiplo se multiplica i que va ir aumentando 1 mas hasta ser igual a numero 
    multiplo =i*5;
    //imprimir cada multiplo
    System.out.println(multiplo);
    //aumentar mas 1 hasta que el ciclo finalice
    i++;

} while (i<=num1);
teclado.close();
}
    
}