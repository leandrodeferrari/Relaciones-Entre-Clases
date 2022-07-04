package ejercicioextra4.entidades;

import java.util.HashSet;

public class Voto {

    private Alumno alumnoQueVota;
    private HashSet<Alumno> listaDeAlumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoQueVota, HashSet<Alumno> listaDeAlumnosVotados) {
        this.alumnoQueVota = alumnoQueVota;
        this.listaDeAlumnosVotados = listaDeAlumnosVotados;
    }

    public HashSet<Alumno> getListaDeAlumnosVotados() {
        return listaDeAlumnosVotados;
    }

    public void setListaDeAlumnosVotados(HashSet<Alumno> listaDeAlumnosVotados) {
        this.listaDeAlumnosVotados = listaDeAlumnosVotados;
    }  
    
    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoQueVota=" + alumnoQueVota + ", listaDeAlumnosVotados=" + listaDeAlumnosVotados.toString() + '}';
    }
    
}
