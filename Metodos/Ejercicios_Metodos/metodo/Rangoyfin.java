
import java.util.Scanner;

public class Rangoyfin {
private Scanner teclado ;
private int rangoinicial ;
private int rangofinal;
public void LecturaRango(){
     teclado=new Scanner(System.in);
    System.out.println("ingrese inicio");
    rangoinicial=teclado.nextInt();
    System.out.println("ingrese final");
    rangoinicial=teclado.nextInt();
}
public void ImprimirValores(){
    for(int i =rangoinicial;i<= rangofinal;i++){
    System.out.print(i+"   ");;
    }
    System.out.println(" ");
}
public int DevolverCantidadElementos(){
    int cantidad=0 ;
    for(int i =rangoinicial;i<= rangofinal;i++){
        cantidad ++;
    }
    return cantidad  ;
}
public int DevolveSumatotiaElementos(){
    int sumatoria=0 ;
    for(int i =rangoinicial;i<= rangofinal;i++){
        sumatoria+=i;
    }
    return sumatoria ;

}
public double DevolverPromedioElementos(){
    double promedio =(double)DevolveSumatotiaElementos()/DevolverCantidadElementos();
    return  promedio;
}
public void ConvertirFarenheit(){
    GradosTransformar convetir = new GradosTransformar();
    for(int i =rangoinicial;i<= rangofinal;i++){
        System.out.println(convetir.GradosGFarenheit(i));
    }

}
public static void main(String[] args) {
    Rangoyfin secuencia = new Rangoyfin();
    secuencia.LecturaRango();
    secuencia.ConvertirFarenheit();
}
}
