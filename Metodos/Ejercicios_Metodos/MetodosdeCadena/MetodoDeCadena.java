public class MetodoDeCadena {
    public void MetodoChartAt(){
        String cadena = "hola mundo ";
        char resultado = cadena.charAt(0);
        int longitud =cadena.length();
        for(int i=0;i<longitud;i++){
            System.out.println(cadena.charAt(i));
        }

    }
   
    public void MetodoCompare(){
        String cadena1="hola";
        String cadena2="hola mundo ";
        System.out.println(cadena1.compareTo(cadena2));
    }
    
    public void MetodoCompareIgnorandoMayusculasMinusculas(){
        String cadena1="hola";
        String cadena2="hola mundo ";
        System.out.println(cadena1.compareToIgnoreCase(cadena2));
    }
    public void CocatenarCadenas(){
        String cadena1 ="Andres ";
        String cadena2 ="Camilo ";
        String cadena3 ="Ruiz ";
        System.out.println(cadena1.concat(cadena2).concat(cadena3));
    }

public static void main(String[] args) {
    MetodoDeCadena obj= new MetodoDeCadena();
   // obj.MetodoChartAt();
obj.CocatenarCadenas();
}
}
