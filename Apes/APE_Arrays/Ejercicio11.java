import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio11 {
    
  
        public static void main(String[] args) {
            String nombre ;
            int edad ;
            int sumaMenores = 0;
            int contadorMenores = 0;
            boolean hayMayores = false ;
            Scanner scanner = new Scanner(System.in);
    
            // Almacenar nombres y edades
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Integer> edades = new ArrayList<>();
    
            // Lectura de datos
            while (true) {
                System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
                nombre = scanner.nextLine();
    
                if (nombre.equals("*")) {
                    break;
                }
    
                System.out.print("Ingrese la edad de " + nombre + ": ");
                 edad = scanner.nextInt();
                scanner.nextLine(); 
    
                nombres.add(nombre);
                edades.add(edad);
            }
    
            System.out.println("\nAlumnos mayores de edad:");
            hayMayores = false;
            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) >= 18) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                    hayMayores = true;
                }
            }
            if (!hayMayores) {
                System.out.println("Ninguno.");
            }
    
        
    
            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) < 18) {
                    sumaMenores += edades.get(i);
                    contadorMenores++;
                }
            }
    
            if (contadorMenores > 0) {
                double promedio = (double) sumaMenores / contadorMenores;
                System.out.println("\nPromedio de edad de los alumnos menores de edad: " + promedio);
            } else {
                System.out.println("\nNo hay alumnos menores de edad para calcular el promedio.");
            }
        }
    }
    

