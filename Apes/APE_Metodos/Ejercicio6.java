
import java.util.Scanner;

public class Ejercicio6 {
private Scanner teclado ;
public void Ingreso(){
    teclado= new Scanner(System.in );
    int numero ;
    System.out.println("Ingrese un numero ");
    numero=teclado.nextInt();
    //llamar a la suma de impares
    System.out.println(".....Suma de Impares---------");
    System.out.println(DigitosImpares(numero));
    //llamar a la suma de pares 
    System.out.println("----Suma de Pares ------");
    System.out.println(DigitosPares(numero));

}
///funcion para calcular la suma de impares 
public int DigitosImpares(int n){
    int SumaPares=0 ,SumaImpares =0;
    while(n!=0){ 
    int digito = n %10 ;
    if (digito %2 ==0){
        SumaPares= SumaPares+ digito;
    }else {
        SumaImpares=SumaImpares+digito ;
    }
    n=n/10;
    }
     return SumaImpares ;
}
//funcion para clacular la suma de pares  
public int DigitosPares(int n){
    int SumaPares=0 ,SumaImpares =0;
    while(n!=0){ 
    int digito = n %10 ;
    if (digito %2 ==0){
        SumaPares= SumaPares+ digito;
    }else {
        SumaImpares=SumaImpares+digito ;
    }
    n=n/10;
    }
    return SumaPares ;
}
public static void main(String[] args) {
    Ejercicio6 ej = new Ejercicio6();//instanciar la clase 
    ej.Ingreso();
}


}
