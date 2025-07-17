import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int rondasGanadasUsuario = 0;
        int rondasGanadasComputadora = 0;

        while (rondasGanadasUsuario < 2 && rondasGanadasComputadora < 2) {
            System.out.print("Elige: piedra, papel o tijeras: ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            // Validar entrada
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
                System.out.println("Entrada no válida. Por favor, elige 'piedra', 'papel' o 'tijeras'.");
                continue; // Volver a pedir la entrada
            }

            // Generar elección de la computadora
            int eleccionComputadora = random.nextInt(3); // 0: piedra, 1: papel, 2: tijeras
            String eleccionComputadoraStr = "";
            if (eleccionComputadora == 0) {
                eleccionComputadoraStr = "piedra";
            }
            if (eleccionComputadora == 1) {
                eleccionComputadoraStr = "papel";
            }
            if (eleccionComputadora == 2) {
                eleccionComputadoraStr = "tijeras";
            }

            System.out.println("La computadora eligió: " + eleccionComputadoraStr);

            // Determinar el ganador de la ronda
            if (eleccionUsuario.equals(eleccionComputadoraStr)) {
                System.out.println("¡Es un empate!");
            } else {
                if (eleccionUsuario.equals("piedra")) {
                    if (eleccionComputadoraStr.equals("tijeras")) {
                        System.out.println("¡Ganaste esta ronda!");
                        rondasGanadasUsuario++;
                    } else {
                        System.out.println("¡La computadora ganó esta ronda!");
                        rondasGanadasComputadora++;
                    }
                }
                if (eleccionUsuario.equals("papel")) {
                    if (eleccionComputadoraStr.equals("piedra")) {
                        System.out.println("¡Ganaste esta ronda!");
                        rondasGanadasUsuario++;
                    } else {
                        System.out.println("¡La computadora ganó esta ronda!");
                        rondasGanadasComputadora++;
                    }
                }
                if (eleccionUsuario.equals("tijeras")) {
                    if (eleccionComputadoraStr.equals("papel")) {
                        System.out.println("¡Ganaste esta ronda!");
                        rondasGanadasUsuario++;
                    } else {
                        System.out.println("¡La computadora ganó esta ronda!");
                        rondasGanadasComputadora++;
                    }
                }
            }

            System.out.println("Rondas ganadas - Tú: " + rondasGanadasUsuario + ", Computadora: " + rondasGanadasComputadora);
            System.out.println();
        }

        // Determinar el ganador del juego
        if (rondasGanadasUsuario > rondasGanadasComputadora) {
            System.out.println("¡Felicidades! Ganaste el juego.");
        } else {
            System.out.println("La computadora ganó el juego. ¡Mejor suerte la próxima vez!");
        }

        scanner.close();
    }
}