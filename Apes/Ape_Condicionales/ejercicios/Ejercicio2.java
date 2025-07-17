import java.util.Scanner;//Llamar al teclado
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        double num;//Definir variable de entrada
        System.out.println("Raiz cuadrada de un numero  ");
System.out.println("Ingrese un numero : ");         
num= teclado.nextDouble();//leer la variable
if(num<0){
System.out.println("El numero pertenece a los imaginarios");//Si la raiz es negativa no se podra hacer 
}else{
 System.out.println("La raiz cuadrada de "+num+" es "+Math.sqrt(num));//Resultado
}




teclado.close(); // Cerrar el escáner

    }
}
