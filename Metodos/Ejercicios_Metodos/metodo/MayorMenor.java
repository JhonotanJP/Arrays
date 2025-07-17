
import java.util.Scanner;


//ingresar 3valores
//Imprimir datoss
//desplegar cual es el mayor 
public class MayorMenor {
///private int v1 ,v2,v3 
public void Cargavalores(){
    Scanner   teclado = new Scanner(System.in );
    int valor1,valor2,valor3 ,numeromayor,numeromenor ;
    System.out.println("ingrese el primer valor ");
    valor1 = teclado.nextInt();
    System.out.println("ingrese el segundo valor ");
    valor2 = teclado.nextInt();
    System.out.println("ingrese el tercer  valor ");
    valor3= teclado.nextInt();
    //Imprimir valores
    System.out.println(valor1);
    System.out.println(valor2);
    System.out.println(valor3);
    //invocar a los metodos de mayor y menor 
    numeromayor =CalcularMayor(valor1, valor2, valor3);
    numeromenor=CalcularMenor(valor1, valor2, valor3);
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
  
}

}
