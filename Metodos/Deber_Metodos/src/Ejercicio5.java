import  java.util.Scanner;
public class Ejercicio5 {
    private Scanner teclado ;

    public void Ingreso(){
        teclado= new Scanner(System.in);
        Double nota1,nota2,nota3 ;
        System.out.println("Ingrese nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("Ingrese nota 3");
        nota3 = teclado.nextDouble();
        //llamamos a la funcion del prodemio
        System.out.println("--------El promedio es  ----");
        System.out.println(Promedio(nota1, nota2, nota3));

    }
    ///el metodo para saber cual deles son los mayores y luego sacar el promedio 
    public double Promedio(double n1,double n2,double n3  ){
        double suma,promedio ;
        if (n1 >n2 &&n3>n2 ){
            suma =n1+n3 ;
        }else {
            if(n2>n1 && n3 >n1 ){
                suma = n2 +n3 ;
            }else{
                suma =n2+n1 ;
            }
        }
        promedio=suma/2 ;
        return promedio;
    }
    public static void main(String[] args) {
        Ejercicio5 ej =new Ejercicio5(); ///insatanciar la clase 
        ej.Ingreso();
    }



}
