public class Ejercicio4 {

public static void main(String[] args) {
    double [] precioArticulos = new double[]{10,20,30,40,50};
    double[][] montosRecaudados= new double[4][5];
    double[] SucursalTotal= new double[4];
    int [][] CantidadesVendidas= new int[][]{
        {5	,6	,10	,1	,1},
        { 3	,4	,5,	3	,10 },
        { 10	,2	,3	,8 ,6 },
        {4,	3	,2	,5	,2 }
    };
    //item1 : Las cantidades totales de cada artículo.
    System.out.println("ITEM N° 1");
    System.out.println("Las cantidades totales de cada artículo.");
    double sumatoria ;
    for (int c = 0; c < CantidadesVendidas[0].length; c++) {
        sumatoria=0 ;
        for (int f = 0; f < CantidadesVendidas.length; f++) {
            sumatoria=CantidadesVendidas[f][c]+sumatoria;

        }
        System.out.println("Cantidad Articulo :"+(c+1)+" = "+sumatoria);
        
    }

    ///item 2 : La cantidad de artículos en la sucursal 2.
    System.out.println("ITEM N° 2");
    System.out.println("La cantidad de artículos en la sucursal 2.");
   sumatoria=0;
    for (int c = 0; c <CantidadesVendidas[0].length; c++) {
        sumatoria=CantidadesVendidas[1][c]+sumatoria;
        
    }
    System.out.println("La cantidad de articulos en la sucursal 2 = "+sumatoria);

    //item 3 :La cantidad del articulo 3 en la sucursal 1.
    System.out.println("ITEM N° 3");
    System.out.println("La cantidad del articulo 3 en la sucursal 1.");
    System.out.println(CantidadesVendidas[0][2]);

    //item 4 : La recaudación total de cada sucursal.
for (int f = 0; f < CantidadesVendidas.length; f++) {
    for (int c = 0; c < CantidadesVendidas[0].length; c++) {
       montosRecaudados[f][c]= CantidadesVendidas[f][c]*precioArticulos[c];
    }

}

for (int f = 0; f < montosRecaudados.length; f++) {
    for (int c = 0; c < montosRecaudados[0].length; c++) {
        System.out.print(montosRecaudados[f][c]+"\t");
        
    }
    System.out.print("\n");
    
}
System.out.println(" ITEM N° 4 :");
for (int f = 0; f < montosRecaudados.length; f++) {
    sumatoria=0;
    for (int c = 0; c < montosRecaudados[0].length; c++) {
    sumatoria=sumatoria+montosRecaudados[f][c];
    SucursalTotal[f]=sumatoria ;

}
        System.out.println("Monto Sucursal : "+(f+1)+" = "+sumatoria);
}
//item 5 La recaudación total de la empresa.
System.out.println("ITEM N° 5");
System.out.println(" La recaudacion total de la empresa ");
sumatoria =0 ;
for (int f = 0; f < montosRecaudados.length; f++) {
    for (int c = 0; c < montosRecaudados[0].length; c++) {
    sumatoria=sumatoria+montosRecaudados[f][c];
}
}System.out.println("la recaudacion total ="+sumatoria);
//item 6 • La sucursal de mayor recaudación.
double mayor=0 ;
int SucursalMayor=0;
for (int i = 0; i < SucursalTotal.length; i++) {
    if(SucursalTotal[i]>mayor){
        mayor=SucursalTotal[i];
        SucursalMayor=i ;
    }

}
System.out.println("ITEM N°6");
System.out.print("La sucursal de mayor recaudación es : la sucursal "+(SucursalMayor+1)+" con "+mayor);








}




}
