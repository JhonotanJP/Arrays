import java.util.Scanner ;
public class Ejercicio2 {

public static double NotasMasAltas(int n1,int n2,int n3){
    double suma ;
    if(n1>n2 && n2>n3){
        suma=n1+n2 ;
    }else{
        if(n2>n1&&n2>n3){
            suma=n2+n3 ;
        }else{
            suma= n1+n3 ;
        }
    }
   double  promedio=suma /2 ;
return promedio ;
}
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int nota1 ,nota2,nota3 ;
    System.out.println("Ingrese tres notas para el promedio ");
    System.out.println("Ingrese la nota 1 ");
    nota1 =teclado.nextInt();
    System.out.println("Ingrese la nota 2 ");
    nota2 =teclado.nextInt();
    System.out.println("Ingrese la nota 3 ");
    nota3 =teclado.nextInt();
    System.out.print("El promedio es  : ");
    System.out.println(NotasMasAltas(nota1, nota2, nota3));


    

}
}
