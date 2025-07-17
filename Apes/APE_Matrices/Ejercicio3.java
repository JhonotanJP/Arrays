public class Ejercicio3 {
public static void main(String[] args) {
    int[][] marco = new int[5][15];
    
for (int f = 0; f < marco.length; f++) {
   for (int c = 0; c < marco[0].length; c++) {
    if (c==0 || f==0||f==4||c==14) {
        marco[f][c]=1;
    } 

   }
    
}
//item N °1 : Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
 // posiciones o elementos que delimitan la tabla
for (int f = 0; f < marco.length; f++) {
    for (int c = 0; c < marco[0].length; c++) {
        System.out.print(marco[f][c]+"\t");

    }
    System.out.print("\n");
}

}
}
