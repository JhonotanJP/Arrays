import java.util.Scanner;
public class Ejercicio1 {

    private Scanner teclado ;
    public void Factorial (){
        teclado = new Scanner(System.in );
        int numero;
        System.out.println("------Factorial--------");
        System.out.println("Ingrese un numero ");
        numero = teclado.nextInt();
        //llamar a la funcion para calcular el factorial 
       System.out.println( For(numero));

    }
    ///calcular el factorial con ciclo for en  un metodod 
    public  int For(int numer ){
        int contador=1; //donde inicializamos una variable que luego va regresar 
        for (int i = 1; i <=numer; i++) {
            contador =contador *i ;//donde el contador se va seguir acumulando hasta que i sea igual numero 
        }
        return contador  ;
    }


    public static void main(String[] args) throws Exception {
       Ejercicio1 fa =new Ejercicio1() ; ///para poder realizar hay que instanciar 
       fa.Factorial();
    }
}
