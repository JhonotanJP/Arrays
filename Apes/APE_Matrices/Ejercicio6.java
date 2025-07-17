public class Ejercicio6 {
public static void main(String[] args) {
    double [][] asistencia = new double[][]{
        {8,1,2,4,5},
        {4,5,9,1,3},
        {5,6,7,9,1},
        {1,6,1,3,4}
    };
    
    //item1 : Informar la asistencia total por materia.
    double suma ;
    System.out.println("Item N° 1 : Asistencia total por materia ");
    for (int c = 0; c < asistencia[0].length; c++) {
        suma= 0;
        for (int f = 0; f< asistencia.length; f++) {
            suma=asistencia[f][c]+suma ;
        }
System.out.println("La materia "+(c+1)+" : " +suma+" Asistencias ");        
    }

//item 2 : Mostrar la asistencia total en la facultad 3.
    suma=0 ;
    System.out.println("Item N° 2 : Asistencia de la faculatad 3 ");
    for (int c = 0; c < asistencia[0].length; c++) {
        suma=asistencia[2][c]+suma;
        
    }
    System.out.println("La Facultad 3  la asistencia total es : "+suma);

    //item 3 : Mostrar la asistencia en la materia 2 de la facultad 1.
    System.out.println(" item N° 3 : Asistencia en  materia 2 en  la facultad 1 ");
    System.out.println(asistencia[0][1]);

    //item 4 : Calcular el porcentaje de asistencia en cada facultad.
     double [] AsistenciaFacultad = new double[4];
     System.out.println("item N ° 4 :  Promedio de asistencia de cada facultad ");
    for (int f = 0; f < asistencia.length; f++) {
        suma=0 ;
        for (int c = 0; c < asistencia[0].length; c++) {
            suma=asistencia[f][c]+suma ;
        }
        AsistenciaFacultad[f]=suma ;
        System.out.println( " Promedio de la facultad "+(f+1)+ " : "+suma/asistencia.length);
    }
    //item 5 : Determinar la facultad con la mayor asistencia.
    double mayor = 0 ; 
    int CualFacultad=0 ; 
    for (int i = 0; i <AsistenciaFacultad.length; i++) {
        if(AsistenciaFacultad[i]>mayor){
            mayor =AsistenciaFacultad[i] ;
            CualFacultad=i ;
        }
    }
    System.out.println(" La facultad "+(CualFacultad+1)+" posee la mayor asistencia  con "+mayor);
    




}
}
