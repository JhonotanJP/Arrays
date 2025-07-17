import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("Ingrese dos números para ordenar de mayor a menor");

        System.out.print("Ingrese primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese segundo número: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("1ro: " + num1);
            System.out.println("2do: " + num2);
        }

        if (num2 > num1) {
            System.out.println("1ro: " + num2);
            System.out.println("2do: " + num1);
        }

        // Si son iguales, no imprime nada. ¿Quieres que maneje ese caso?

        input.close();
    }
}
