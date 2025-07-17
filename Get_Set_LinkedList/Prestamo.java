public class Prestamo {
private  double Monto ;
private  int  Plazo ;
private  String TipodePrestamo ;
private int edad ;
private String cedula ;
public void Prestamo(double monto ,int plazo ,String tipodeprestamo,int edad,String cedula){
 this.Monto =monto ;
 this.Plazo=plazo ;
 this.TipodePrestamo=tipodeprestamo ;
 this.edad =edad ;
 this.cedula = cedula ;
}

//get
public Double getMonto(){
 return  Monto;
}
public int getPlazo(){
    return Plazo ;
}

public String getTipoPrestamo (){
    return TipodePrestamo ;

}
public String getTipodePrestamo() {
    return TipodePrestamo;
}
public int getEdad() {
    return edad;
}
public String getCedula() {
    return cedula;
}
//set
public void setMonto(double _monto ){
    this.Monto=_monto ;

}
public void setPlazo(int _plazo){
    this.Plazo = _plazo ;
}
public void setTipodePrestamo(String tipodePrestamo) {
    TipodePrestamo = tipodePrestamo;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public void setCedula(String cedula) {
    this.cedula = cedula;
}









}
