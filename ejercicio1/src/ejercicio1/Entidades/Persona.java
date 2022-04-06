
package ejercicio1.Entidades;


public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long documentoDeIdentidad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documentoDeIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documentoDeIdentidad = documentoDeIdentidad;
    }
    
    public Persona(String nombre, String apellido, int edad, long documentoDeIdentidad, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.perro = perro;
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

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documentoDeIdentidad=" + documentoDeIdentidad + ", perro=" + perro + '}';
    }
    
}
