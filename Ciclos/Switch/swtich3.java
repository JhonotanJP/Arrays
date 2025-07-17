package visual.code.jhonatan;

import java.util.Scanner;

public class swtich3 {
public static void main(String[] args) { //
    //enere,abril,septiembre,noviembre descuenton 21%
    //febrero ,marzo,julio,agfosto descuento  13 %
    //mayo,junio,octubre,diciembre descuento 25 %
    Scanner teclado =new Scanner(System.in);
    float compra,descuento ;
    int  mes ;
    System.out.println("ingrese el valor de la compra");
    compra =teclado.nextFloat();
    System.out.println("ingree el mes del  la compra");
    mes=teclado.nextInt();
    switch (mes) {
        case 1:
        case 4:
        case 9:
        case 11:
            descuento=compra *0.21f;
            System.out.println("el descuento es de "+descuento);
            break;
        case 2,3,7,8 :
        descuento=compra*0.13f;
        System.out.println("el descuento es de "+descuento);
        case 5,6,10,12:
        descuento=compra*0.25f;
        System.out.println("el descuento es de "+descuento);
        break;
        default:
        System.out.println("el mes no coincide");
            break;
    }
    teclado .close();

}
}
