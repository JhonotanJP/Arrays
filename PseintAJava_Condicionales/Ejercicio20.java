import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num;
        int az = random.nextInt(10) + 1; // Número aleatorio entre 1 y 10

        System.out.println("Adivina un número del 1 al 10");

        do {
            num = input.nextInt();

            if (az < num) {
                System.out.println("Te pasaste, intenta con un número menor");
            } else if (az > num) {
                System.out.println("Te pasaste, intenta con un número mayor");
            }
        } while (num != az);

        System.out.println("¡Lo adivinaste!!!");

        input.close();
    }
}
