import java.util.Scanner ;
public class Ejercicio3 {
private Scanner teclado ;
private int repetir ;
  
public void Ingreso (){
    do { 
    teclado =new Scanner(System.in );
    int rinicial , rfinal ;
    System.out.println("Ingrese rango inicial " );
    rinicial=teclado.nextInt();
    System.out.println("Ingrese rango final ");
    rfinal=teclado.nextInt();
    //Numeros totales 
    System.out.println("---Total Numeros ");
    System.out.println(NumerosTotales(rinicial, rfinal));
    //Numeros Pares
    System.out.println("---Numeros pares");
    System.out.println(NumeroPares(rinicial, rfinal));
    //Numeros Impares 
    System.out.println("----- Numero Impares -----");
    System.out.println(NumeroImpares(rinicial, rfinal));
    //Numeros Primos 
    System.out.println("---Numeros Primos ----");
    System.out.println(NumerosPrimos(rinicial, rfinal));
    System.out.println("------Desea Repetir ------");
    System.out.println("Ingrese 1: Para repetir  ingrese 2 : Para Salir ");
    repetir=teclado.nextInt();
    }while (repetir ==1 );

}
//Total de numeros en el rango 
public int NumerosTotales(int ri,int rf){
int Contador =  0  ;
for (int i = ri ; i <= rf; i++) {
    Contador++;
}
return Contador;
}
//Total de numeros pares en el rango 
public int NumeroPares (int ri ,int rf ){
    int Pares = 0;
    for (int i = ri ; i <=rf ; i++) {
        if(i %2==0){
            Pares++;
        }
    }
    return Pares ;
}
//Total de numeros im pares en el rango 
public int NumeroImpares (int ri ,int rf ){
    int ImPares =0;
    for (int i = ri ; i <=rf ; i++) {
        if(i %2==1){
            ImPares++;
        }
    }
    return ImPares ;
}
//Total de numeros primos  en el rango 
public int NumerosPrimos (int ri,int rf){

    int cprimos =0;
    for (int i = ri; i <= rf ; i++) {
        boolean primo =true ;
        for (int j = 2; j < i; j++) {

            if (i %j ==0){
                primo = false ;
                break ;
            }
            
        }
        if (primo == true ){
            cprimos++ ;
        }

    }
    return cprimos ;
}

public static void main(String[] args) {
    //Instanciar la classe 
    Ejercicio3 op = new Ejercicio3();
    op.Ingreso();
}




}
