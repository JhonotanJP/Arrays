public class ConvertidorStringArrays {
    public static void main(String[] args) {
        String cedula ="180309";
        String Frutas = "xxmanzana,uva ,limon";



        //System.out.println(cedula.substring(0,2));
        //System.out.println(cedula.charAt(0)  + cedula.charAt(1));
        String delimitador2=",";
        String delimitador1="";



        String [] vectorCedula = cedula.split("");

        String[] VectorFrutas = Frutas.split(delimitador2);

        System.out.println(vectorCedula);
        for (int i = 0; i < vectorCedula.length; i++) {
            System.out.println(vectorCedula[i]);
            
        }
        for (int i = 0; i < vectorCedula.length; i++) {
            System.out.println(VectorFrutas[i]);
            
        }
        ///convertirmos de  vectore a string 
       // String numeros =String.join(delimitador1, vectorCedula);
        //System.out.println(numeros);
        String ensalada =String.join(delimitador1, vectorCedula);
        System.out.println(ensalada);
        



    }




}
