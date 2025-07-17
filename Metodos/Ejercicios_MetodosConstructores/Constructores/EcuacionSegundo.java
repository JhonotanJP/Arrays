package Constructores;
import  java.util.Scanner ;
public class EcuacionSegundo{
    public double a ;
    public double b ;
    public double c ;
    public Scanner teclado ;


    public EcuacionSegundo(double a_ ,double b_ ,double c_ ) {
    a_=a;
    b_=b;
    c_=c;



    }
    public void General (){
       double gene= Math.pow(b, 2)-(4*a*c);
       if (gene <=0){
        System.out.println("la raiz pertenece a los imaginarios ");
    
       }else{
        double general1=(-b+Math.sqrt(gene))/2*a;
        double general2=(-b-Math.sqrt(gene))/2*a;
        if (general1==general2 ){
            System.out.println("x se intersecta en el mismo punto ");
        }  
        System.out.println("El numero  X1 = "+general1);
        System.out.println("El numero  X2 = "+general2);
        

         }

     

      }



      public  EcuacionSegundo(){

      }
    
    


public static void main(String[] args) {


    EcuacionSegundo ob =new EcuacionSegundo(2, 4, 5);

}

}
