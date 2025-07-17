package Listas;

public class Persona {
private String nombre ;
private String genro ;
private int edad ;
public Persona(String nombre, String genro, int edad) {
    this.nombre = nombre;
    this.genro = genro;
    this.edad = edad;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenro(String genro) {
        this.genro = genro;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenro() {
        return genro;
    }

    public int getEdad() {
        return edad;
    }


}
