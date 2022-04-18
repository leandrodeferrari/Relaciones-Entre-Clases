package ejercicio1.Entidades;

import java.util.HashSet;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long documentoDeIdentidad;
    private HashSet<Perro> perros;

    public Persona() {
        perros = new HashSet();
    }

    public Persona(String nombre, String apellido, int edad, long documentoDeIdentidad) {
        perros = new HashSet();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public Persona(String nombre, String apellido, int edad, long documentoDeIdentidad, HashSet<Perro> perros) {
        perros = new HashSet();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(long documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public HashSet<Perro> getPerros() {
        return perros;
    }

    public void setPerro(HashSet<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documentoDeIdentidad=" + documentoDeIdentidad + ", perros=" + perros.toString() + '}';
    }

}
