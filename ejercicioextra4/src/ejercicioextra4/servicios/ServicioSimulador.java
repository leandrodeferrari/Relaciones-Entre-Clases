package ejercicioextra4.servicios;

import ejercicioextra4.entidades.Alumno;
import ejercicioextra4.entidades.Simulador;
import java.util.HashSet;

public class ServicioSimulador {

    HashSet<Alumno> listaDeAlumnos;

    public Simulador crearSimulacion() {

        Simulador simulador = new Simulador();
        listaDeAlumnos = new HashSet();
        Alumno alumno;
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        while (listaDeAlumnos.size() < 10) {

            alumno = servicioAlumno.crearAlumno();
            listaDeAlumnos.add(alumno);

        }

        // poner alumno en alumno y setear en alumno que vota.
        // y restarlo a la lista.
        
        simulador.setListaDeAlumnos(listaDeAlumnos);

        mostrarListaDeAlumnos(simulador);
        
        // proseguir con la simulacion del voto.
        
        return simulador;

    }

    public void mostrarListaDeAlumnos(Simulador simulador) {

        for (Alumno alumno : simulador.getListaDeAlumnos()) {

            System.out.println(alumno);

        }

    }

}
