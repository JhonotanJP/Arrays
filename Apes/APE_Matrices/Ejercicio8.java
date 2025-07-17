public class Ejercicio8 {
    public static void main(String[] args) {
        double[][] Cramer = new double[][]{
            {7, 4, 13},
            {5, -2, 19}
        };
        //item 1 : utilizando el método de determinantes (Cramer)
        double D = Cramer[0][0] * Cramer[1][1] - Cramer[1][0] * Cramer[0][1];

        double Dx = Cramer[0][2] * Cramer[1][1] - Cramer[1][2] * Cramer[0][1];


        double Dy = Cramer[0][0] * Cramer[1][2] - Cramer[1][0] * Cramer[0][2];

        if (D == 0) {
            System.out.println("El sistema no tiene solución única (determinante cero).");
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("item 1 : Calcular Determinante :");
            System.out.println("Solución del sistema:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
