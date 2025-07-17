import java.util.Scanner ;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//llamar al teclado
        Double compra ,des,montof;//variables
        System.out.println("ingrese el precio de la compra ");
        compra = teclado.nextDouble();//leer la compra
        if(compra>=100&& compra<500 ){
            des=compra*0.10;
        }else{
            if(compra>=500){
                des=compra*0.20;
            }else{
                des=0.00;
            }

        }
        montof=compra-des;
System.out.println("El descuento es de "+ des);//el descuento
System.out.println("Monto final es de "+ montof);//el precio final a pagar
teclado.close();//cerrar teclado
    }
}
