import java.util.Scanner ;
public class Ejercicio1{
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        int num2 ,num1,num3;
        num1=teclado.nextInt();
        num2=teclado.nextInt();
        num3=teclado.nextInt();
        if (num1==num2 ) {
            System.out.println("son iguales");
        }else{
        System.out.println("no son iguales");
        }


    }
}
