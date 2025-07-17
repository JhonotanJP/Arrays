import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);//llamar al teclado
        double num1,num2,resultado;//variables de entra y salida
        int seleccionOp; //variable para la operacion
        System.out.println("ingrese Primer Numero ");
        num1=teclado.nextDouble();//leer numero 1
        System.out.println("Ingrese Segundo Numero ");
        num2=teclado.nextDouble();//leer numero 2
        System.out.println( "Ingrese 1.Suma  2.Resta 3.Multiplicacion  4.Division  ");//opciones
        seleccionOp= teclado.nextInt();
        resultado=0;
        if(seleccionOp==1){
            resultado=num1+num2;//suma
        }else{
            if(seleccionOp==2){
                resultado=num1-num2;//resta
            }else {
                if(seleccionOp==3){
                    resultado=num1*num2;//multiplicacion
                }else{
                    if(seleccionOp==4){
                        resultado=num1 /num2;//division
                    }else{
                    System.out.println("la operacion no coincide");//restriccion
                    }
                }

            }

        }
        System.out.println("El Resultado Es "+resultado);//resultado

teclado.close();











    }
}
