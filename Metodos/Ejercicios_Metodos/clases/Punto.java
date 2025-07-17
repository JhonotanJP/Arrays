//ingresar una coordenada x ,y 
//imprimir dn qque cuadrante se encuentra el punto 
import  java.util.Scanner;
public class Punto {
    private int  x,y ;

    private Scanner  Teclado ;
    public void ingresecoordenadas(){
        Teclado= new Scanner (System.in );
        System.out.println("---Ingreso de coordenadas ");
        System.out.println("ingrese X :");
        x=Teclado.nextInt();
        System.out.println("Ingrese Y :");
        y =Teclado.nextInt();
    }
    public void cuadrante(){
        System.out.println("----Imprimir Cuadrante ");
        if ( x>0 && y>0 ){
            System.out.println("Se Encuentra en el primer cuadrante ");
        }else{
            if(x<0 && y>0 ){
                System.out.println("Se Encuentra en el  segundo cuadrante ");
            }else {
                if( x<0 && y< 0 ){
                    System.out.println("Se Encuentra en el tercer cuadrante ");
                }else{
                    if(x>0 &&y<0 ){
                        System.out.println("Se Encuentra en le cuarto cuadrante ");
                    }else{
                        System.out.println("Se Encuentra en el origen ");
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        Punto punto1 = new Punto();
        punto1.ingresecoordenadas();
        punto1.cuadrante();
    }



}
