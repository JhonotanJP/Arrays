package Constructores;

import java.util.Scanner;

public class estudiante{
    public String nombre ;
    public String cedula ;
    public String facultad ;
    public String carrera  ;
    public int credito ;
public void ImprimirDatosEstudiantes(){
System.out.println("---Datos Estudiante -----");
System.out.println("Nombre :"+ nombre);
System.out.println("Cedula :"+ cedula);
System.out.println("Facultad :"+ facultad);
System.out.println("Carrera :"+ carrera);
System.out.println("Creditos :"+ credito);
}
public void CargarDatosEstudiantes(){

Scanner teclado = new Scanner(System.in);
System.out.println("---Datos Estudiante -----");
System.out.println("Ingrese los datos ");
System.out.print("Nombre :");
nombre = teclado.nextLine();
System.out.print("Cedula :");
cedula = teclado.nextLine();
System.out.print("Facultad :");
facultad = teclado.nextLine();
System.out.print("Carrera :");
carrera = teclado.nextLine();
System.out.print("Creditos : ");
credito= teclado.nextInt();
}

public void CrearEstudianteParametros(String _nombre ,String _cedula,
                                        String _facultad ,String _carrera,int _credito){
    nombre=_nombre ;
    cedula=_cedula;
    facultad=_facultad;
    carrera = _carrera ;
    credito=_credito;

     
}

    public static void main(String[] args) {
        estudiante estudiante1 = new estudiante();
estudiante1.nombre="Juan Lopez";
estudiante1.cedula="1801";
estudiante1.facultad="FISEI";
estudiante1.carrera="TI";
estudiante1.credito=32;

/// imprimir  los datos del estudiante 1 
//estudiante1.ImprimirDatosEstudiantes();
  //estudiante estudiante2 = new estudiante();
//estudiante2.CargarDatosEstudiantes();
//zestudiante2.ImprimirDatosEstudiantes();

estudiante estudiante3 = new estudiante() ;
estudiante3.CrearEstudianteParametros("Jose","1701" , "Ficm", "Mecanica", 150);
estudiante3.ImprimirDatosEstudiantes();
    }

}
