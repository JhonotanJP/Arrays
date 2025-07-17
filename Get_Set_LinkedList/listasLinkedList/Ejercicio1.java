package listasLinkedList;

import java.util.LinkedList;

public class Ejercicio1 {
    public static void Imprimir (LinkedList<String>_lista){
        System.out.println("--------------Imprimir lista--------------------");
        for (Object elemento : _lista) {
            System.out.println(elemento);
            
        }
    }
public static void main(String[] args) {
    

LinkedList<String> lista = new LinkedList<>();
LinkedList<String> lista2 = new LinkedList<>();
    lista.add("Juan");
    lista.add("Luis");
    lista.add("Andres");
    lista.add("Pedro");
    

    Imprimir(lista);
    lista.add(1,"Ana");
    Imprimir(lista);
    lista.remove(0);
    Imprimir(lista);
    lista.remove("Luis");
    Imprimir(lista);
    //Cuantos elementos tiene la lista
    System.out.println("Cantidad elementos  :"+lista.size());
    //validar la existencia de 
    if(lista.contains("Ana")){
        System.out.println("Si existe ");
    }else{
        System.out.println("No existe");
    }

    //Obtener elementos por posicion
    System.out.println(lista.get(1));
    System.out.println(lista.getFirst());
    System.out.println(lista.getLast());

       //Clonar
   lista2 = (LinkedList)lista.clone();
   Imprimir(lista2);
    //Encerar una Lista 
    lista.clear();
   Imprimir(lista);


    



}
}
