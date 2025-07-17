import java.util.LinkedList;

public class App {

    public static String DevolverHtmlDetalleFactura(LinkedList<DetalleFactura> listaDF) {

        String CodigoHtml = " ";

        CodigoHtml += "<table border='1'>";  // tabla con borde
        CodigoHtml += "<tr><th>Producto</th><th>Precio</th><th>Cantidad</th><th>Subtotal</th></tr>";
       
        for (DetalleFactura op1: listaDF) {
            CodigoHtml+="<tr> <td>"+op1.getProducto()+"</td> <td>"+op1.getPrecio()+"</td><td>"+op1.getCantidad()+"</td><td>"+op1.getSubtotal()+"</td></tr>";
      
        }
        CodigoHtml += "</table>";


        return CodigoHtml ;
    }
   
    public static String DevolverHtmlCliente(Cliente _cliente){
        //<tr><td>Telefono :</td><td>09948646419</td></tr>
        String codigoHtml ="";
        codigoHtml+="<table >";
        codigoHtml+="<tr><td>Nombre :</td><td>"+_cliente.getNombre()+" </td></tr>\r\n" ;
    
        codigoHtml+="<tr><td>Cedula :</td> <td>"+_cliente.getCedula()+" <td></tr>";
        codigoHtml+="<tr><td>Telefono :</td><td>"+_cliente.getTelefono()+"</td></tr>";
        codigoHtml+="<tr><td>Correo : </td><td>"+_cliente.getCorreo()+"</td></tr>";
        codigoHtml+="<tr><td>Dirrecion :</td><td>"+_cliente.getDireccion()+"</td></tr>";
        return codigoHtml ;
    }
    public static String DevolverHtmlCabecera(){
        String codigoHtml ="";
        codigoHtml+="<h1> Empresa XYZ</h1>\r\n" ;
        codigoHtml+=    "    <h3>Ruc : </h3>\r\n" ;
        codigoHtml+="    <h3>Numero : </h3>\r\n"  ;
        codigoHtml+=  "    <h4>Fecha :25/06/2025 </h4>";
        return codigoHtml ;

    }

public static String GenerarComprobante(Cliente _cliente ,LinkedList<DetalleFactura> listaDF){
    String codigoHtml ="";
    codigoHtml+="<!DOCTYPE html>";
    codigoHtml+= "<html lang=\"es\">\r\n" ;
    codigoHtml+=    "<head>\r\n" ;
    codigoHtml+=  "    <meta charset=\"UTF-8\">\r\n" ;
    codigoHtml+=  "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" ;
    codigoHtml+=      "    <title>Factura</title>\r\n" ;
    codigoHtml+=  "</head>\r\n" ;
    codigoHtml+= "<body>";
    codigoHtml+=DevolverHtmlCabecera();
    codigoHtml+= DevolverHtmlCliente(_cliente);
 
    codigoHtml+= DevolverHtmlDetalleFactura(listaDF);
    codigoHtml+=CalcularTotales(listaDF);

    codigoHtml+="<body>";
     codigoHtml+="</html>";




    return codigoHtml ;
}
public static String CalcularTotales(LinkedList<DetalleFactura> listaDF) {
    double subtotal = 0;

    for (DetalleFactura item : listaDF) {
        subtotal += item.getSubtotal();
    }

    double iva = subtotal * 0.12;
    double total = subtotal + iva;

    String codigoHtml = "<br><table border='1'>";
    codigoHtml += "<tr><td><strong>Subtotal:</strong></td><td>" + String.format("%.2f", subtotal) + "</td></tr>";
    codigoHtml += "<tr><td><strong>IVA (12%):</strong></td><td>" + String.format("%.2f", iva) + "</td></tr>";
    codigoHtml += "<tr><td><strong>Total:</strong></td><td>" + String.format("%.2f", total) + "</td></tr>";
    codigoHtml += "</table>";

    return codigoHtml;
}







    public static void main(String[] args) throws Exception {
Cliente cliente  =new Cliente("jhonantan","123214","000421","kkfksak","dsadsa");

        LinkedList<DetalleFactura> listaDetalleFactura = new LinkedList<>();


        listaDetalleFactura.add(new DetalleFactura("CPU", 500, 1, 500));
        listaDetalleFactura.add(new DetalleFactura("Monitor", 200, 2, 400));
        listaDetalleFactura.add(new DetalleFactura("Set Gamer", 150, 1, 150));

       // String html = DevolverHtmlDetalleFactura(listaDetalleFactura);
        //System.out.println(html);  // Imprime el HTML generado
        //System.out.println(DevolverHtmlCliente(cliente));
        System.out.println(GenerarComprobante(cliente,listaDetalleFactura));

    }
}
