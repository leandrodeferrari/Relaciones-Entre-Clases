package ejercicio1.entidades;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private Persona tutor;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, String raza, int edad, String tamanio, Persona tutor) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Persona getTutor() {
        return tutor;
    }

    public void setTutor(Persona tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        String nombreTutor = tutor.getNombre();
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", tutor=" + nombreTutor + '}';
    }

}
