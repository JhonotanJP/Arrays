
import java.util.Scanner;

public class Ejercicio3 {
    public  static  String EtapaVida(int edad){
        String Etapa = null;
        if(edad <0 ){
          System.out.println("la edad no coincide !!!!1");
          Etapa=" ";
        }else{
            if(edad>=0 && edad<=2){
                Etapa="Bebe " ;
            }else{
                if(edad>=3 && edad<=5){
                    Etapa="Niño " ;
                }else{
                    if(edad>=6 && edad<=12){
                        Etapa="Pubertad " ;
                    }else{
                        if(edad>=13 && edad<=18){
                            Etapa="Adolescente " ;
                        }else{
                            if(edad>=19 && edad<=25){
                                Etapa="Joven " ;
                            }else{
                                if(edad>=26 && edad<=60){
                                    Etapa="Adulto " ;
                                }else{
                                    if(edad>61){
                                        Etapa="Anciano" ;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

return Etapa;
    }




public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in); 
   int edad ;
   System.out.println("Ingrese su edad :");
   edad = teclado.nextInt();
   System.out.println(EtapaVida(edad));



}
    }
