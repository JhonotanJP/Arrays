
import java.util.Scanner;


//ingresar 3valores
//Imprimir datoss
//desplegar cual es el mayor 
public class MayorMenorv2 {
    private  int v1,v2 , v3,numeromayor,numeromenor ;
    private Scanner teclado ;
///private int v1 ,v2,v3 
public void Cargavalores(){
     teclado = new Scanner(System.in );
    System.out.println("ingrese el primer valor ");
    v1 = teclado.nextInt();
    System.out.println("ingrese el segundo valor ");
    v2 = teclado.nextInt();
    System.out.println("ingrese el tercer  valor ");
    v3= teclado.nextInt();
    //Imprimir valores
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    //invocar a los metodos de mayor y menor 
    numeromayor =CalcularMayor(v1, v2, v3);
    numeromenor=CalcularMenor(v1, v2, v3);
    //Imprimir los resultados 
    System.out.println("Numero mayor : "+numeromayor);
    System.out.println("Numero menor : "+ numeromenor);



}
public int  CalcularMayor (int v1 ,int v2 ,int v3 ){
    int mayor =0;
    if (v1>v2 && v1>v3 ) {
        mayor =v1 ;
    }else {
        if (v2>v3) {
            mayor=v2 ;

        }else{
            mayor = v3 ;
        }
    }
    return mayor ;
}
public int CalcularMenor (int v1 ,int v2 ,int v3){
    int menor =0 ;
    if(v1<v2 && v1<v3 ){
        menor = v1 ;
    }else{
        if(v2<v3){
            menor =v2 ;
        }else{
            menor =v3 ;
        }
    }
return menor ;
}



public static void main(String[] args) {
    MayorMenor Mayormenor = new MayorMenor();
    Mayormenor.Cargavalores();
    int numeromayor,numeromenor ;
    //invocara   a los metodos de mayor a menor 
  
  
}

}
