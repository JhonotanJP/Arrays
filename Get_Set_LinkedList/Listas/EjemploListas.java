package Listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {
    ///Crear 
public static void main(String[] args) {
 List<String> listaNombres = new ArrayList<>();
List<Integer> listaNumeros =new ArrayList<>();
//agreagamso elementos lista
listaNombres.add("Juan");
listaNombres.add ("Ana");
listaNombres.add("Andrea");

listaNumeros.add(10);
listaNumeros.add(20);
listaNumeros.add(30);
listaNumeros.add(0,40);
listaNumeros.add(2,50);
listaNumeros.add(60);
//imprimir 
System.out.println(listaNombres);
System.out.println(listaNumeros);


for(String nombre : listaNombres){
System.out.println(nombre);
}
System.out.println("-----Multiplo dde 8 ---------");
int contador =0;
for (Integer numero : listaNumeros ){
    if (numero%8==0) {
        System.out.println("Multiplo = "+numero);
        contador ++ ;
        
    }
    System.out.println(numero);

}
System.out.println("Se encontrarorn = "+contador+" numeros divisibles para 8");

for (String nombre: listaNombres) {
    if(nombre=="Ana"){
        System.out.println("Ana si existe ");
    }
}
/////////--------------------------------------------------------------------
/// 2 grupos
/// Promedio tdo el curso
/// Promedio de los alumnos menos de 7--Cuantos so n:
List<Double>notasG1=new ArrayList<>();
List<Double>notasG2=new ArrayList<>();
List<Double>notasTotales=new ArrayList<>();
notasG1.add(10.0);
notasG1.add(9.0);
notasG1.add(3.0);
notasG1.add(4.0);

notasG2.add(8.5);
notasG2.add(7.4);
notasG2.add(2.3);
notasG2.add(5.5);

notasTotales.addAll(notasG1);
notasTotales.addAll(notasG2);
System.out.println(notasTotales);
///promedio 
double sumatoria =0 ,promedio=0;
for (Double notas: notasTotales) {
    sumatoria+=notas ;

}
promedio= sumatoria /notasTotales.size();
System.out.println("El promedio del curso es : "+promedio);


sumatoria =0 ;
promedio=0;
 contador =0;
 for (Double notas: notasTotales) {
   if (notas<7) {
        sumatoria+=notas ;
        contador ++ ;
   }

}
promedio =sumatoria/contador ;
System.out.println("Promedio  : "+promedio+" - Numeros de estudiantes = "+contador);














}
}
