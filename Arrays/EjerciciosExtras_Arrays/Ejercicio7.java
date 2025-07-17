//Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) 
//y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector.
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //declarar el vector de 12
        String[] nombreMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // declara el vector de los dias
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        //pedir al usuario que ingrese el mes 
        System.out.print("Ingresa un número de mes (1 a 12): ");
        int numeroMes = teclado.nextInt();
        //verificar el si el mes es correcto
        if (numeroMes >= 1 && numeroMes <= 12) {
            int indice = numeroMes - 1;
            System.out.println("El mes " + nombreMeses[indice] + " tiene " + diasMeses[indice] + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }

        teclado.close();
    }
}
