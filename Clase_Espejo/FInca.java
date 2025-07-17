import java.util.Scanner;

public class FInca {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    String nombreCultivo;
    int cantidad ;
    double  precioUnitario,totalposcultubo;
    double totalFactura=0 ;
    System.out.println("seleccione el  tipo  de e cultivo 1. maiz 2. tomate 3. papas 4 .arroz ");
    int opcion =teclado.nextInt();
    switch (opcion) {
        case 1:
            nombreCultivo="maiz";
            break;
        case 2:
            nombreCultivo="tomate ";
            break;
        case 3:
        nombreCultivo="papas";
        break;
        case 4:
        nombreCultivo="arroz";
        break ;
        default:
        nombreCultivo="no existe";
            break;
            }
            System.out.println(" ingrese la cantidad de producto de "+nombreCultivo+ "el kilogramos o unidades");
            cantidad=teclado.nextInt();
            if (cantidad<=0) {
                System.out.println("la cantidad debe ser mayor a cero " );
                return;
            }
            System.out.println("ingrese el precio del producto");
            precioUnitario=teclado.nextDouble();
            if (precioUnitario<=0) {
                System.out.println("el precio debe ser mayor a cero");
                return;
            }
            totalposcultubo=cantidad *precioUnitario;
            System.out.println("factura del producto");
            System.out.println("====================");
            System.out.println("cultivo"+nombreCultivo);
            System.out.println("cantidad del producto "+cantidad);
            System.out.println("precio unitario "+precioUnitario);
            System.out.println("total por cultivo "+totalposcultubo);
            totalFactura+=totalposcultubo;
            System.out.println("total de la factura "+totalFactura);

}
}
