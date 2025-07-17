import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear objeto para leer datos del usuario
        Scanner input = new Scanner(System.in);

        // Declarar variables
        double a, b, c;
        double discriminante, x1, x2;

        // Mensaje de introducción
        System.out.println("Se utilizará la fórmula ax² + bx + c = 0");

        // Ingreso de datos
        System.out.print("Ingrese a: ");
        a = input.nextDouble();

        System.out.print("Ingrese b: ");
        b = input.nextDouble();

        System.out.print("Ingrese c: ");
        c = input.nextDouble();

        // Verificar si 'a' es cero (no sería ecuación cuadrática)
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado porque a = 0.");
        } else {
            // Calcular el discriminante
            discriminante = (b * b) - (4 * a * c);

            // Verificar si el discriminante es mayor o igual a cero
            if (discriminante >= 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                // Mostrar resultados
                System.out.println("El resultado es:");
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            } else {
                System.out.println("No se puede resolver, ya que no pertenece a los números reales.");
            }
        }
    }
}