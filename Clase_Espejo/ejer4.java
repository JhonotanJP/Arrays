import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ejer4 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    //Datos de entrada
    int  numero; 
    //Datos de salida
    int  accion=1 ;
    String mensaje; 
   do {
        
System.out.println("INGRESE 1 SALUDAR , 2. DESPEDIDA 3 ,SALIR");
    numero=teclado.nextInt();
switch (numero) {
    case 1:
        mensaje="saludos !!";
        break;
    case 2:
        mensaje="Adios !!";
    break ;
    default:
        mensaje="Escoja una opcion correcta ";
        accion=0;
        break;
}
} while (accion!=0);
System.out.println(mensaje);

}
}
