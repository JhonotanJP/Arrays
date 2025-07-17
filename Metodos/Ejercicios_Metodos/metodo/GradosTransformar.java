
import java.util.Scanner;

////Ingresde transformar de grados fahrenheit o de celsius 
/// Ingreso de la temperaturta 
/// Imprimir la temperatura convertir 
/// Preguntar si quiere seguir haciendo 

public class GradosTransformar {
    private Scanner teclado;
    private int repetir;

    public void IngresoGrados() {
        do {
            teclado = new Scanner(System.in);
            double Grados, Fin;
            int TipoGrado;
            System.out.println("Ingrese los grados ");
            Grados = teclado.nextDouble();
            System.out.println("Ingrese 1: para Farenheit a Celsius o 2 : Para Celsius a Farenheit");
            TipoGrado = teclado.nextInt();
            if (TipoGrado == 1) {
                Fin = GradosCelsius(Grados);
                System.out.println("Los grados en Celsius es  " + Fin);
            } else {
                if (TipoGrado == 2) {
                    Fin = GradosGFarenheit(Grados);
                    System.out.println("Los grados en Farenheit es  " + Fin);
                } else {
                    System.out.println("El numero ingresado no coincide ");
                }
            }
            System.out.println("Ingrese 1 : para repetir ");
            repetir = teclado.nextInt();
        } while (repetir == 1);

    }

    public double GradosGFarenheit(double Grados) {
        System.out.println("----De Farenheit A Celsisus----");
        Grados = (Grados * 1.8) + 32;
        return Grados;

    }

    public double GradosCelsius(double Grados) {
        System.out.println("----De Celsius A Farenheit----");
        Grados = (Grados - 32) / 1.8;
        return Grados;

    }
    public int Factorial(int numero){
        int resultado=1 ;
        if(numero<0){
            return -999;
                }
                if(numero==0||numero==1){
                    return 1 ;
                }
    
    for(int i =1 ;i<=numero ;i++){
        resultado=numero*i;

    }
    return resultado;
}

    public static void main(String[] args) {
        GradosTransformar grados = new GradosTransformar();
        grados.IngresoGrados();
    }

}
