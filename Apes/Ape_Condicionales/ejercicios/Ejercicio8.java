import java.util.Scanner ;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1 ,num2 ,num3;
System.out.println("ingrese primer numero");
num1=teclado.nextInt();
System.out.println("ingrese segundo numero");
num2=teclado.nextInt();
System.out.println("ingrese tercer numero");
num3=teclado.nextInt();
if(num1>num2&&num2>num3){
    System.out.println("Estan ordenados de  mayor a menor");
}else{
    if(num3>num2&&num2>num1){
        System.out.println("estan ordenados menor a mayor");
    }else{
        System.out.println("no estan ordenados");
    }

}


teclado.close();

    }
}
