import java.util.Scanner;

public class Ejercicio4 {
    private Scanner teclado;
    private int repetir;

    public void Ingreso() {
        do { 
        teclado = new Scanner(System.in);
        System.out.println("---- Ingrese una frase ----");
        String frase = teclado.nextLine();
        //funcion para saber cuantas palabras existen en la frase 
        System.out.println("--Palabras de la frase  -- ");
                System.out.println(CantidaPalabras(frase));
                //funcion para saber cuantas letras existen en la frase 
                System.out.println("-----Letras de la Frase -------");      
                System.out.println(CantidadLetras(frase));  
                //funcion para saber cuantas vocales existen 
                System.out.println("-----Vocales -------");
                System.out.println(CantidadVocales(frase));
                System.out.println("Desea repetir la frase ");
                System.out.println("Ingrese 1 : Para repetir 2 : Para salir ");
                repetir=teclado.nextInt();
        }while(repetir==1);
    }
    //FUNCION DE CANTIDAD DE PALABRAS 
    public int CantidaPalabras(String fra){
        String[] palabras = fra.split(" ");
        int TotalPalabras=palabras.length;
        return TotalPalabras;
    }
    //FUNCION DE CANDIDADA DE LETRAS 
    public int CantidadLetras(String fra){
        int letras= fra.length();
        return letras ;
    }
    ///FUNCION DE LA CANTIDAD DE LAS VOLCALES 
    public int CantidadVocales(String fra ){
        int contadorVocales = 0;
        for (int i = 0; i < fra.length(); i++) {
            char c = Character.toLowerCase(fra.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        return contadorVocales;

    }

    public static void main(String[] args) {
        Ejercicio4 OP = new Ejercicio4();//INSTANCIAR LA CLASE  
        OP.Ingreso();
    }
}
