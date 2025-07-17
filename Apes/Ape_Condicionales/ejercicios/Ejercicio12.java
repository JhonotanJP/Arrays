import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//llamar al teclado
        int l1,l2,l3 ;//variables de entrada(lados)
        System.out.println("Tipo de Triangulo segun sus lados");
        System.out.println("ingrese primer lado");
        l1=teclado.nextInt();//leer lado 1
        System.out.println("ingrese segundo lado ");
        l2=teclado.nextInt();//leer lado 2
        System.out.println("ingrese tercer lado ");
        l3=teclado.nextInt();//leer lado3 
        if(l1==l2&&l1==l3&&l2==l3){
            System.out.println("El Triangulo es Equilatero ");//todos iguales
        }else{
            if(l1==l2||l1==l3|l2==l3){
                System.out.println("El Triangulo es Isosceles");//dos iguales
            }else{
           System.out.println("EL Triangulo es Escaleno ");//ninguno igual
                }
            }
        
teclado.close();//cerrar al teclado 
    }
}
