
import java.util.Scanner;

public class Ejercicio7 {
private Scanner teclado ;
public void Ingreso (){ 
teclado=new Scanner(System.in);
System.out.println("Ingrese la palabra ");
String palabra = teclado.nextLine();
///calcular el palindromo con un Si
if(Palindromo(palabra)==true){
    System.out.println("la palabra es palindromo ");
}else{
    System.out.println("la palabra no es palindromo ");
}

}

//calcular la palabras si es palindromo 
public boolean Palindromo(String p){
    int izquierda = 0;
    int derecha = p.length() - 1;
    boolean esPalindromo = true;
    //REPETIR HASTA QUE LA LETRA SEA AL REVEZ
    while (izquierda < derecha) {
        //SI LA LETRA ES DISTINTO ES FALSO 
        if (p.charAt(izquierda) != p.charAt(derecha)) {
            esPalindromo = false;
            break;
        }
        izquierda++;
        derecha--;
    }
    //regresar el bollean 
    return esPalindromo;
}
public static void main(String[] args) {
    Ejercicio7 ej = new Ejercicio7();//instanciar la clase 
    ej.Ingreso();
}
}
