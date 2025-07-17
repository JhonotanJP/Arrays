public class Minetras {

    public static void main(String[] args) {
        int contador = 1;  // Inicializamos el contador en 1

        // Mientras el contador sea menor o igual a 5, ejecuta el ciclo
        while (contador <= 5) {
            System.out.println("Contador es: " + contador);
            contador++; // Incrementamos el contador en 1 para evitar ciclo infinito
        }

        System.out.println("Ciclo while terminado");
    }
}
