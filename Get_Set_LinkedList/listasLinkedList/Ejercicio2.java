package listasLinkedList;

import java.util.LinkedList;

public class Ejercicio2{


    public static void main(String[] args) {
        LinkedList<Automovil> listaAutomoviles=new LinkedList<>();
        Automovil auto1 = new Automovil("VW", "fol", 2011, 8000);
        Automovil auto2 = new Automovil("toyota", "Corola", 2020, 19000);
        int contador  =0; 
        double sumatoria=0,promedio =0;
        listaAutomoviles.add(auto1);
        listaAutomoviles.add(auto2 );
        //agregar objetos directamente  en la lista 

        listaAutomoviles.add (new Automovil("KIA", "Cerato", 2015,12500));
        listaAutomoviles.add(new Automovil("Honda", "CIVIC", 2017, 21500));
        listaAutomoviles.add(new Automovil("Honda", "Focus",2025, 34000));
        listaAutomoviles.add(new Automovil("Chevrolet", "cRUZE",2014, 19000));
        //Imprimiendo Vehiculos 
        ImprimirAutomoviles(listaAutomoviles);
       // System.out.println(auto1.toString());
       

       //agregar un elemneto al incio 
       listaAutomoviles.addFirst(new Automovil("BMW", "M1",2024, 45000));
       System.out.println("Agregado  al Incio :"+listaAutomoviles.getFirst().toString());
       //agregar un elemneto al incio 
       listaAutomoviles.addLast(new Automovil("Mercedes", "Mq",2024, 57000));
       System.out.println("Agregado  al Final  :"+listaAutomoviles.getLast().toString());


        ImprimirAutomoviles(listaAutomoviles);

        ///Buscar autos de una marca especifica 
        System.out.println("Buscar autos de una marca especifica");
        String  _marcaBuscada = "TOYOTA";
        for(Automovil automovil : listaAutomoviles){
            if(automovil.getMarca().toUpperCase().equals(_marcaBuscada.toUpperCase())){
                System.out.println(automovil.getModelo()+" - "+automovil.getPrecio());
            }
        }
        for (Automovil automovil : listaAutomoviles) {
            if (automovil.getAño()>2016 ) {
                contador++ ;
                sumatoria+=automovil.getPrecio();
                
            }
            
        }
        promedio=sumatoria/contador ;
        System.out.println(promedio);

        promedio=0;
        contador =0;
        sumatoria =0;
        for (Automovil automovil : listaAutomoviles) {
            if ((automovil.getAño()>2016)&& (automovil.getMarca().equals("Honda"))) {
                contador++ ;
                sumatoria+=automovil.getPrecio();
                
            }
            
        }
        promedio=sumatoria/contador ;
        System.out.println(promedio);



 










    }

    private static void ImprimirAutomoviles(LinkedList<Automovil> listaAutomoviles) {
        System.out.println("---------------Imprimiendo Automoviles ---------------------");
        for (Automovil auto : listaAutomoviles) {
            System.out.println(auto.getMarca()+"\t"+
                         auto.getModelo()+"\t"+
                         auto.getAño()+"\t"+
                         auto.getPrecio()+"\t"
      
            );
        }
    }

}
