import java.util.Scanner ;
public class Ejercicio6 {

    public static void main(String[]args){
Scanner teclado = new Scanner (System.in);//llamar al teclado
int nota ;//variable entra
String letra ;//variable de salida
System.out.println( "Notas americanas");
System.out.println("ingrese la nota de  0-100");
nota= teclado.nextInt();
if(nota<0||nota>100){//condiccion
System.out.println("la nota debe ser entre 0 y 100");//restriccion
}else{
if(nota<69 ){//la variable letra sera la nota dependiento de la calificacion
    letra="F";
}else{
    if(nota<70&&nota>=69){
letra="D";
    }else{
        if(nota<80&&nota>=70){
            letra="C";    
        }else{
            if(nota<90&&nota>=80){
                letra="B";
            }else{
            letra="A";
            }
        }
    }
}
System.out.println("la calificacion en america es "+letra);//imprimir repuesta


}


teclado.close();//cerrrar  al teclado
    } 

}