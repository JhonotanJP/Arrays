import java.util.Scanner;

public class ej3 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    ///datos de entrada
    int ni,nf,i;
    //Datos de salida
    int ep=0;
    //ingreso de datos
    System.out.println("ingrese inicio");
    ni=teclado.nextInt();
    System.out.println("inbgerse fin");
    nf=teclado.nextInt();
    //i es igual inicio
    i=ni ;
    //finalizar hasta que i sea igual fin
    while (i<=nf) {
        //si i es par hacer
        if (i%2==0) {
            //ep es contador 
            ep=ep+1;
        }
        //ir aumentando uno mas
        i++;
        
    }
    //imprimir acumulador 
    System.out.println(ep);
    teclado.close();
}
}
