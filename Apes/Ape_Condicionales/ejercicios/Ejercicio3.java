import java.util.Scanner ;

public class Ejercicio3 {
    public static void main (String[]args ){
Scanner teclado =new Scanner (System.in);//Llamar al Scanner 
int num;
System.out.println("Ingrese un  numero para indentificar si es par" );
num=teclado.nextInt();
//Para resolver utilizariamos el  modulo si el modeulo=0 entonces es par sino no es par

if(num%2==0){
    System.out.println("El numero es par  ");
}else {
    System.out.println("El numero no es par ");
}


teclado.close ();//Cerrar Scanner 
    }


}
