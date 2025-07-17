import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class AppProductos {

    public static LinkedList<ProductoExportacion> cargarProductos(String ruta) {
        LinkedList<ProductoExportacion> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            boolean primeraLinea = true;
            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }
                String[] partes = linea.split(",");
                if (partes.length == 7) {
                    int id = Integer.parseInt(partes[0]);
                    String mes = partes[1];
                    int anio = Integer.parseInt(partes[2]);
                    String pais = partes[3];
                    String tipoProducto = partes[4];
                    double pesoToneladas = Double.parseDouble(partes[5]);
                    double monto = Double.parseDouble(partes[6]);

                    ProductoExportacion p = new ProductoExportacion(id, mes, anio, pais, tipoProducto, pesoToneladas, monto);
                    lista.add(p);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo:\n" + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Error general:\n" + e.getMessage());
        }
        return lista;
    }

    public static void resolverPregunta1(LinkedList<ProductoExportacion> lista) {
        double totalNicaragua = 0;
        double totalBrasil = 0;

        for (ProductoExportacion p : lista) {
            if (p.getAnio() == 2022) {
                if (p.getPais().equalsIgnoreCase("Nicaragua")) {
                    totalNicaragua += p.getMontoMillonesDolares();
                }
                if (p.getPais().equalsIgnoreCase("Brasil")) {
                    totalBrasil += p.getMontoMillonesDolares();
                }
            }
        }

        System.out.println("Exportaciones 2022:");
        System.out.println("Nicaragua: $" + totalNicaragua + " millones");
        System.out.println("Brasil: $" + totalBrasil + " millones");
    }

    public static void main(String[] args) {
        String ruta = "src/Productos.csv"; // Cambia si tu archivo está en otra ruta
        LinkedList<ProductoExportacion> lista = cargarProductos(ruta);
        resolverPregunta1(lista);
    }
}

