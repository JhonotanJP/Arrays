package visual.code.jhonatan;

import java.util.Scanner;

public class whils {
public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    int limite ;
    int num=1;
    int sumatoria=0;
    System.out.println("ingrese un limite ");
    limite = teclado.nextInt();
    while (num <= limite) {
        System.out.println(num);
        sumatoria=num+sumatoria;
        num=num+1;

    }
    System.out.println(sumatoria);
    teclado.close();
}
}
