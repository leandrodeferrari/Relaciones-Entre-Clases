package ejercicioextra4.entidades;

import java.util.HashSet;

public class Simulador {

    private HashSet<Alumno> listaDeAlumnos;

    public Simulador() {
    }

    public Simulador(HashSet<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public HashSet<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(HashSet<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    @Override
    public String toString() {
        return "Slimulador{" + "listaDeAlumnos=" + listaDeAlumnos.toString() + '}';
    }

}
