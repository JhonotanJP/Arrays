
import java.util.Scanner;

public class Ejercicio7{

    public static void calcularPago(String tipoCliente, String formaPago, double monto) {
        double total = 0;
        double diferencia = 0;
        String tipo = "";

        if (tipoCliente.equalsIgnoreCase("G")) {
            if (formaPago.equalsIgnoreCase("C")) {
                diferencia = monto * 0.15;
                total = monto - diferencia;
                tipo = "descuento";
            } else if (formaPago.equalsIgnoreCase("P")) {
                diferencia = monto * 0.10;
                total = monto + diferencia;
                tipo = "recargo";
            }
        } else if (tipoCliente.equalsIgnoreCase("A")) {
            if (formaPago.equalsIgnoreCase("C")) {
                diferencia = monto * 0.20;
                total = monto - diferencia;
                tipo = "descuento";
            } else if (formaPago.equalsIgnoreCase("P")) {
                diferencia = monto * 0.05;
                total = monto + diferencia;
                tipo = "recargo";
            }
        } else {
            System.out.println("Tipo de cliente inválido.");
            return;
        }

        // Mostrar resultados
        System.out.printf("Monto original: %.2f\n", monto);
        System.out.printf("Monto de %s: %.2f\n", tipo, diferencia);
        System.out.printf("Total a pagar: %.2f\n", total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipoCliente, formaPago;
        double monto;

        System.out.print("Ingrese el tipo de cliente (G = Público general, A = Afiliado): ");
        tipoCliente = teclado.next();

        System.out.print("Ingrese la forma de pago (C = Contado, P = Plazos): ");
        formaPago = teclado.next();

        System.out.print("Ingrese el monto de la compra: ");
        monto = teclado.nextDouble();

        calcularPago(tipoCliente, formaPago, monto);

    }
}
