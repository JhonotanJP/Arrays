
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class App{


    public static LinkedList<Delito> CargarDelitosdeArchivosTexto(String _ruta){
        //Declarar la lista
        LinkedList<Delito> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))){
            String linea ;
           
            //Controlar la primer linea 
         boolean primeraLinea= true ;
             while((linea = reader.readLine()) != null){
                 //saltar la cabecera 
                 if(primeraLinea==true ){
                     primeraLinea=false ;
                     continue ;
                 }
                 String[] partes=linea.split(";");
                 if(partes.length==6){
                     String provincia =partes[0];
                     String delito =partes[1]; 
                     boolean judicializado =Boolean.parseBoolean(partes[2]);
                     String victima =partes[3];
                     double monto =Double.parseDouble(partes[4]);
                     int año = Integer.parseInt(partes[5]);
 
                     Delito delito1 = new Delito(provincia, delito, judicializado, victima,monto,año);
                     lista.add(delito1);
 
                 }
             }
         
 
 
 
         } catch (IOException ex) {
             System.out.println(" Hubo un error al momento de cargar el archivo"+"\n" + ex.getMessage());
         }
         catch (Exception ex){
             System.out.println("Hubo un error en el proceso"+"\n"+ ex.getMessage());
 
         }

         return lista ;
    }
    private static void AgregarDelitoEnArchivoTexto(String ruta ) {
        Delito  nuevoDelito = new Delito("Esmeraldas", "Robo", true, "EEL",1010,2020);
        try (FileWriter fw = new FileWriter(ruta,true)){
            ///Agregamos el objeto en formato el archivo 
            /// ///salto de linea 
            fw.write("\n"+nuevoDelito.ConvertirFormatoCSV());

            
        } catch (IOException e) {
            System.out.println("Hubo un error al momento de escribir el archivo : "+"\n"+e.getMessage());
        }
        catch (Exception ex){
            System.out.println("Hubo un error en el proceso"+"\n"+ ex.getMessage());

        }
    }
    private static void Imprimir(LinkedList<Delito> lista) {
        System.out.println("----------Imprimiendo lista delitos ---------------");
        for (Delito delito :lista) {
            System.out.println(delito);
        }
    }
    






    private static void ResolverPregunta1 ( LinkedList<Delito>lista_){
        double sumatoriaEsmeraldas=0,sumatoriaGuayas =0;

        for (Delito delito  : lista_) {
            if (delito.getAño()==2022) {
    
            

            if (delito.getProvincia().equals("Esmeradas")) {
                sumatoriaEsmeraldas+=delito.getMonto();
                System.out.println(sumatoriaEsmeraldas);
            }
            if (delito.getProvincia().equals("Guayas")) {
                sumatoriaGuayas+=delito.getMonto();

            }
        }
        }
        LinkedList<Pregunta1>ListaP1 = new LinkedList<>();
        ListaP1.add(new Pregunta1("Esmeraldas", sumatoriaEsmeraldas));
        ListaP1.add(new Pregunta1("Guayas", sumatoriaGuayas));
        for (Pregunta1 pregunta1 : ListaP1) {
         System.out.println(pregunta1.toString());   
        }

    }
    public static void main(String[] args) throws Exception {
      
        //relativo
        String ruta ="src/DelitosProvincia.csv";
        LinkedList<Delito>lista ;
       lista = CargarDelitosdeArchivosTexto(ruta);
        
       // Imprimir(lista);
        //Agregar Delito al archivo 
        //AgregarDelitoEnArchivoTexto(ruta);
      //lista=CargarDelitosdeArchivosTexto(ruta);
      //Imprimir(lista);
        
        //calcual es precujucio economico que hemos tenido por provincia costa 
        
        //pregunta 1
        ResolverPregunta1(lista);
    }
    


}
