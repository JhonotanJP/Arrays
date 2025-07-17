//Queremos guardar los nombres y la edades de los alumnos de un curso.
/// Realiza un programa que introduzca el nombre y la edad de cada alumno.
/// // El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*)
// Al finalizar se mostrará los siguientes datos:
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio9{
    
  
        public static void main(String[] args) {
            boolean hayMayores= false ;
            String nombre ;
            int edad ;

            Scanner teclado = new Scanner(System.in);
    
            // Almacenar nombres y edades
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Integer> edades = new ArrayList<>();
    
            // Ingreso del nombre 
            while (true) {
                System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
                nombre = teclado.nextLine();
                //acabar de pedir datos hasta que 
                if (nombre.equals("*")) {
                    break;
                }
                //ingreso de la edad 
                System.out.print("Ingrese la edad de " + nombre + ": ");
             edad = teclado.nextInt();
                teclado.nextLine(); 
    
                nombres.add(nombre);
                edades.add(edad);
            }
    
            System.out.println("\nAlumnos mayores de edad:");
            //Imprimir los datos que son mayores de 18
            for (int i = 0; i < edades.size(); i++) {
                if (edades.get(i) >= 18) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                    hayMayores = true;
                }
            }
            //sino se cumple
            if (!hayMayores) {
                System.out.println("Ninguno.");
            }

    
            
        }
    }
    
