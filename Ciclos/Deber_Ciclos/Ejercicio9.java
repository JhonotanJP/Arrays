 import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args) { 
    Scanner teclado=new Scanner(System.in);
    //datos de entrada
     int num1 ,num2 ; 
     //Datos de salida 
     int divisoresnum1 = 0,divisoresnum2=0; 
     int divisor1 = 1,divisor2=1; 
     //ingreso de datos 
     System.out.println("ingrese primer numero ");
      num1=teclado.nextInt();
       System.out.println("ingrese segundo numero");
       num2=teclado.nextInt();
        //Repetir hasta que num1 sea igual al divisor
         do { 
            //si num1 el modulo con divisor es igual 0 hacer
             if(num1%divisor1==0){ 
                //donde divisoresnum1 va ser un acumulador del divisor 
                divisoresnum1=divisoresnum1+divisor1; } 
                //divisor mas 1 hasta que la condicion se cumpla
             divisor1++;
//de misma manera con el segundo numero
} while (divisor1<num1);

    do {
        //si num2 el modulo con divisor es igual 0 hacer
        if(num2%divisor2==0){
            //donde divisoresnum2 va ser un acumulador del divisor
            divisoresnum2=divisoresnum2+divisor2;
        }
         //divisor mas 1 hasta que la condicion se cumpla
      divisor2++;  
        
    } while (divisor2<num2);
    //si numero1 es igual a divisiores del numero2  y viseversa entonces son amigos 
    if (num1==divisoresnum2 && num2==divisoresnum2) {
        System.out.println(num1 +" y "+num2+" son amigos");
        //sino no son amigos
    }else{
        System.out.println(num1+" y "+num2+" no son  amigos ");
    }

    teclado.close();
}
}