import java.util.Scanner;

public class Ejercicio5 {
 public static void main (String[]args){
Scanner teclado=new Scanner(System.in);//llamar al teeclado
int num1,num2 ;//variables de entrada
System.out.println("Ingrese dos numeros para saber si es divibles");
System.out.println("Ingrese Primer Numero ");
num1=teclado.nextInt();//leer numero 1
System.out.println("Ingrese Segundo Numero ");
num2=teclado.nextInt();//leer numero 2
//condicion
if(num1%num2==0){
System.out.println("El "+num1+" Es Divisible  a "+num2);//si el numero 1 es divible al numero 2  escribir
}else {
    System.out.println("El "+num1+" no es divisible a "+num2 );//si el numero 1 no es divisible al numerp 2 escribir
}





teclado.close();//cerrar al teclado
 }

}
