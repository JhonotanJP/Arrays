package Constructores;

public class EstudiantesConstructor {
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
    //constructor
    public EstudiantesConstructor(){

    }
    public EstudiantesConstructor(String _nombre ,String _cedula,
                                    String _facultad ,String _carrera,int _credito){
        nombre=_nombre ;
        cedula=_cedula;
        facultad=_facultad;
        carrera = _carrera ;
        credito=_credito;

    }
    public EstudiantesConstructor(String _nombre ,String _cedula ,int _credito){
        nombre=_nombre ;
        cedula=_cedula;
        credito=_credito;



    }
    public static void main(String[] args) {
    EstudiantesConstructor estudianteConstructor1 = new EstudiantesConstructor();
    estudianteConstructor1.nombre="Juan Lopez";
estudianteConstructor1.cedula="1801";
estudianteConstructor1.facultad="FISEI";
estudianteConstructor1.carrera="TI";
estudianteConstructor1.credito=32;
estudianteConstructor1.ImprimirDatosEstudiantes();

EstudiantesConstructor estudiantesConstructor2 =new EstudiantesConstructor("Luis", "46565", "Fisei", "TI", 654);
EstudiantesConstructor estudiantesConstructor3 =new EstudiantesConstructor("Carlos", "46435", "Fisei", "TI", 974);
EstudiantesConstructor estudiantesConstructor4= new EstudiantesConstructor("Gabriela Soto ", "783465834834", 128);
EstudiantesConstructor estudiantesConstructor5= new EstudiantesConstructor("Andres Cepeda", "83834", 148);

    }

}
