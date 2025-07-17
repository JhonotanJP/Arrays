import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args)  {
        Scanner teclado= new Scanner(System.in);//llamar al tecclado
        int num1 ,num2,num3; //variables de entrada
        System.out.println("Ingrese tres numeros ");
System.out.println("Ingrese Primer Numero ");
num1=teclado.nextInt();//leer numero 1
System.out.println("Ingrese Segundo Numero ");
num2=teclado.nextInt();//leer numero 2
System.out.println("Ingrese Tercer Numero ");
num3=teclado.nextInt();//leer numero 3
if(num1>num2&&num3>num1 || num1>num3&&num2>num1 ){
 System.out.println("El numero de medio es "+num1);//si el numero 1 es la mitad
}else{
if(num2>num1 &&num3>num2||num2>num3&&num1>num2 ){
System.out.println("El numero de medio es "+num2);//si el numero 2 es la mitad
}else{
if(num3>num1 &&num2 >num3||num3>num2&&num1>num3 ){
    System.out.println("El numero de medio  es "+num3);//si el numero 3 es la mitad

}else {
    System.out.println("Son iguales");//SI existen dos numeros iguales no habra un medio
}
}
}


teclado.close();//cerrar el teclado

    }
}