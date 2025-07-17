public class EjemploDoWhile {

    public static void main(String[] args) {
        int contador = 1;  // Inicializamos el contador en 1

        // El ciclo do-while ejecuta el bloque al menos una vez,
        // y luego verifica la condición para decidir si continúa.
        do {
            System.out.println("Contador es: " + contador);
            contador++;  // Incrementamos el contador
        } while (contador <= 5);  // Condición para continuar el ciclo

        System.out.println("Ciclo do-while terminado");
    }
}
