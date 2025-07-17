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
    



    public Cliente(String nombre, String cedula, int edad, String cuentaBancaria, double saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        CuentaBancaria = cuentaBancaria;
        this.saldo = saldo;
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
        if(_cedula.length()==4){
            if(_cedula.substring(0,2)=="18"){
                this.cedula=_cedula ;
            }else{
                System.out.println("La cedula no pertenece a Tungurahua");
            }
          
        }else{
            System.out.println("La longitud cedula es incorrecto ");
        }

    }
    //Getter edad
    public int getEdad(){
        return  edad ;
    }
    //setter edadd
    public void SetterEdad(int edad_){
        this.edad = edad_;

    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        CuentaBancaria = cuentaBancaria;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ImprimirDatosCliente(){
        System.out.println(
            "------- Datos del cliente ------- :"+"\n"+
            "Cliente  :"+this.nombre+"\n"+
            "Cedula : "+this.cedula +"\n"+
            "Edad : "+this.edad+"\n"+
            "N° Cuenta  : "+this.CuentaBancaria+"\n"+
            "Saldo : "+this.saldo +"\n"+
            " ------------------------"
        );
    }
    


}
