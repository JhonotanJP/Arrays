



public class sobrecargas {
    public int sumar(int numero1,int numero2 ){
        return numero1 +numero2; 
    }
    public double sumar(double numero1 ,double numero2){
return numero1+numero2;
    }
    public double sumar(double numero1 ,double numero2,double numero3){
        return numero1+numero2+numero3;
            }
    public static void main(String[] args) {
        sobrecargas obj =new sobrecargas();
        System.out.println(obj.sumar(1000, 1000));
        System.out.println(obj.sumar(3.1416, 2.71));
        System.out.println(obj.sumar(3.1416, 2.71,5.25));
       
    }
    }


