import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Ingrese tres números para ordenar de mayor a menor");

        System.out.print("Ingrese primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Ingrese tercer número: ");
        num3 = input.nextDouble();

        // Si el primer número es mayor
        if (num1 > num2 && num1 > num3) {
            System.out.println("1ro: " + num1);
            if (num2 > num3) {
                System.out.println("2do: " + num2);
                System.out.println("3ro: " + num3);
            } else {
                System.out.println("2do: " + num3);
                System.out.println("3ro: " + num2);
            }
        }

        // Si el segundo número es mayor
        if (num2 > num1 && num2 > num3) {
            System.out.println("1ro: " + num2);
            if (num1 > num3) {
                System.out.println("2do: " + num1);
                System.out.println("3ro: " + num3);
            } else {
                System.out.println("2do: " + num3);
                System.out.println("3ro: " + num1);
            }
        }

        // Si el tercer número es mayor
        if (num3 > num1 && num3 > num2) {
            System.out.println("1ro: " + num3);
            if (num2 > num1) {
                System.out.println("2do: " + num2);
                System.out.println("3ro: " + num1);
            } else {
                System.out.println("2do: " + num1);
                System.out.println("3ro: " + num2);
            }
        }

        input.close();
    }
}
