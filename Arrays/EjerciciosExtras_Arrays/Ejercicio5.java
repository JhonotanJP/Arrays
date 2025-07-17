
import java.util.Scanner;

//Programa que declare un vector de diez elementos enteros y pida números para rellenarlo 
//hasta que se llene el vector o se introduzca un número negativo.
//Entonces se debe imprimir el vector (sólo los elementos introducidos).
public class Ejercicio5 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    ///declara el vector 
    int [] numero=new int[10];
    //crear un contador para saber cuantas veces se va a repetir si se coloca un numero negativo 
    int contador=0;
    System.out.println("Ingrese un numero (negativos para finalizar)");
    //forma para ingresar datos por teclado 
    for (int i = 0; i < numero.length; i++) {
        //se declara una variable 
      int entrada=teclado.nextInt();
      //si la variable es menor cero va parar de pedir numeros
      if(entrada<0){
        break ;
      }
      //si la variable es mayor a cero va almacenar en la posicion correspondiente
      entrada=numero[i];
      //para saber cuantas veces se repite 
      contador ++ ;
    }
    //se utiliza otra veces el for para imprimir 
    System.out.println("--- Impresion de numero ");
    for (int i = 0; i < contador; i++) {
        System.out.println(numero[i]);
        
    }
}

}
