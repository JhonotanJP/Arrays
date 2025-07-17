public class  Ejercicio5{

public static void main(String[] args) {
    double [][] CantidadProductos= new double[][]{
        {1,4,5,6,7,8,9,3},
        {3,5,6,2,3,1,7,9},
        {9,5,6,7,2,3,5,3}
    };
    double suma ;
    //item N°1 :Mostrar el inventario total de cada producto.
    System.out.println("ITEM N° 1");
    System.out.println("Mostrar el inventario total de cada producto..");
    for (int c = 0; c < CantidadProductos[0].length; c++) {
        suma=0 ;
        for (int f = 0; f < CantidadProductos.length; f++) {
            suma=CantidadProductos[f][c]+suma;
        }
        System.out.println("Producto "+(c+1)+" Cantidad "+suma);
    }
    //ITEM N°2 : Calcular el inventario total en el almacén 1.
    System.out.println("ITEM N° 2");
    System.out.print("Inventario total de almacen 1 :");
    suma=0 ;
        for (int c = 0; c < CantidadProductos[0].length; c++) {
            suma=CantidadProductos[0][c]+suma;
        }
    System.out.print(suma);
    //item N° 3 : Mostrar el stock del producto 4 en el almacén 2.
    System.out.println("Item N° 3 :");
    System.out.println(" Producto 4 Almacen 2 :"+CantidadProductos[1][3]);
    //item N° 4 : Calcular el valor total del inventario de la cadena, asumiendo que el precio de
//cada producto es: p1= $ 100, p2= $ 200, p3= $ 50, p4= $ 40, p5= $ 80, p6= $ 100,
//p7= $ 60, p8= $ 50,
        double [][] TotalPrecioAlmacenes = new double[3][8];
        double[] precioProducto=new double[]{
            100,200,50,40,80,100,60,50
        };
        for (int f = 0; f < CantidadProductos.length; f++) {
            for (int c = 0; c < CantidadProductos[0].length; c++) {
                TotalPrecioAlmacenes[f][c]=precioProducto[c]*CantidadProductos[f][c];   
            }     
        }
        System.out.println("Item 4 :");
        System.out.println("Inventario por precio de los productosXcantidad :");
        for (int f = 0; f < TotalPrecioAlmacenes.length; f++) {
            for (int c = 0; c < TotalPrecioAlmacenes[0].length; c++) {
                System.out.print(TotalPrecioAlmacenes[f][c]+"\t");
                
            }
            System.out.print("\n");
            
        }
        //item N° 5  : Determinar el almacén con mayor cantidad de productos.
        suma=0 ;
        double mayor =0 ;
        double PosicionMayor =0;
        double [] CantidadP = new double[3];
        for (int f = 0; f < CantidadProductos.length; f++) {
            suma=0;
            for (int c = 0; c < CantidadProductos[0].length; c++) {
                suma=CantidadProductos[f][c]+suma ;
            }
            CantidadP[f]=suma ;
            
        }
        for (int i = 0; i < CantidadP.length; i++) {
            if (CantidadP[i]>mayor) {
                mayor=CantidadP[i];
                PosicionMayor=i ;

            }
        }
        System.out.println("ITEM N° 5 :");
        System.out.println("El Almacen "+(PosicionMayor+1)+" tiene la mayor cantidad de productos con "+mayor);




}
    
}