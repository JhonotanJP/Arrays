import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio12{
    
  
        public static void main(String[] args) {
            boolean hayMayores= false ;
            String nombre ;
            int edad ;

            Scanner teclado = new Scanner(System.in);
    
            // Almacenar nombres y edades
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Integer> edades = new ArrayList<>();
    
            // Lectura de datos
            while (true) {
                System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
                nombre = teclado.nextLine();
    
                if (nombre.equals("*")) {
                    break;
                }
    
                System.out.print("Ingrese la edad de " + nombre + ": ");
             edad = teclado.nextInt();
                teclado.nextLine(); 
    
                nombres.add(nombre);
                edades.add(edad);
            }
    
            System.out.println("\nAlumnos mayores de edad:");
        
            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) >= 18) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                    hayMayores = true;
                }
            }
            if (!hayMayores) {
                System.out.println("Ninguno.");
            }

    
            
        }
    }
    