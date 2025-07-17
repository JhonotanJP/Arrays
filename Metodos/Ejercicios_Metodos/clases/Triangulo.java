
import java.util.Scanner;

//ingresar los lados del triangulo
//imprimir los lados
//imprimir el lado mayor
//imprimir si es equilatero 
// imprimir si el traingulo ingresado es correcto

public class Triangulo {
    
    private int lado1 ,lado2 ,lado3 ;
   private Scanner  Teclado ;
   public void IngreseLadosTriangulo(){
    Teclado= new Scanner(System.in);
    System.out.println("----- Ingresar Lados de Triangulo ----");
    System.out.println("ingrese lado 1");
    lado1 =Teclado.nextInt();
    System.out.println("ingrese lado 2");
    lado2  =Teclado.nextInt();
    System.out.println("ingrese lado 3");
    lado3 =Teclado.nextInt();
   }
   public void ImprimirLadosTriangulos(){
    System.out.println("--Imprimir Lados de Triangulo ---");
    System.out.println("LaDO 1 : "+lado1);
    System.out.println("LaDO 2 : "+lado2);
    System.out.println("LaDO 3 : "+lado3);
   }
   public void ImprimirLadoMayor(){
    System.out.println("----Imprimir lado Mayor ----");
    System.out.print("Lado Mayor :");
    if (lado1 >lado2 && lado1 > lado3 ) {
        System.out.println(lado1);
    }else {
    if(lado2 >lado3 ){
        System.out.println(lado2);
    }else{
        System.out.println(lado3);
        
    }
}
   }
   public void ImprimirEquilatero (){
    System.out.println("----Imprimir si es equilatero---- ");
    if(lado1==lado3 && lado2 ==lado3){
        System.out.println("El Triangulo es Equilatero ");
    }else{
        System.out.println("El triangulo no es Equilatero ");
    }
   }
   public void TrianguloCorrecto(){
    System.out.println("----Imprimir  Si ek triangulo existe ---- ");
    if((lado1 + lado2 )>lado3  && (lado2+lado3)>lado1 && (lado1 +lado3 )> lado2){
        System.out.println("El Triangulo es Correcto");
    }else{
        System.out.println("el triangulo no es Correcto  ");
    }
   }

      public static void main(String[] args) {
       Triangulo triangulo1=new Triangulo();
       triangulo1.IngreseLadosTriangulo();
       triangulo1.ImprimirLadosTriangulos();
    triangulo1.ImprimirLadoMayor();
    triangulo1.ImprimirEquilatero();
    triangulo1.TrianguloCorrecto();
   }
   


}
