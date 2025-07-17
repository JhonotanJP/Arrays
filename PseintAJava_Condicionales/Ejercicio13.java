import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;

        System.out.println("Ingrese una nota para mostrarla de la forma: Insuficiente, Suficiente, Satisfactorio");
        System.out.print("Ingrese la nota de 0 a 10: ");
        nota = input.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe ser mayor o igual a cero y menor o igual a diez.");
        } else {
            if (nota >= 0 && nota <= 6) {
                System.out.println("Insuficiente");
            } else if (nota > 6 && nota <= 8) {
                System.out.println("Suficiente");
            } else {
                System.out.println("Satisfactorio");
            }
        }

        input.close();
    }
}
