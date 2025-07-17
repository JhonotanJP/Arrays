public class Cliente {
    //Encapsulamienton -Atributos privados
    private String nombre ;
    private String cedula  ;
    private int edad ;
    private String CuentaBancaria ;
    private double saldo ;

    public Cliente(String nombre_ ,String _cedula ,int _edad){
        this.nombre =nombre_;
        this.cedula=_cedula;
        this.edad=_edad;
    }
    //Getter nombre 
    public String getNombre(){
        return nombre ;
    }
    //Setter nombre 
    public void setNombre (String _nombre){
        this.nombre=_nombre;
    }
    //Getter cedula 
    public String getCedula (){
        return  cedula;
    }
    //Setter cedula
    public void setCedula(String _cedula){
        this.cedula=_cedula;

    }
    //Getter edad
    public int getEdad(){
        return  edad ;
    }
    //setter edadd
    public void SetterEdad(int edad_){
        this.edad = edad_;

    }


}
