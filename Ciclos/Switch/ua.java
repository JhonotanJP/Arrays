package visual.code.jhonatan;

import java.util.Scanner;

public class ua {
    public static void main(String[] args) {
        int diasemana;
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese el dia de la semana");
        diasemana= teclado.nextInt();
        switch (diasemana) {
            case 1:
            System.out.println("Domingo" );
                break;
        case 2:
        System.out.println("Lunes");
        break;
        case 3:
        System.out.println("Martes");
        break;
         case 4: 
         System.out.println("miercoles");
         break;
         case 5:
         System.out.println("JUEVES");
         break;
         case 6:
         System.out.println("Viernes");
         break;
         case 7:
         System.out.println("Sabado");
         break;
            default:
            System.out.println("EL valor de ingreso es incorrecto");
                break;
        }
        teclado.close();
    }

}
