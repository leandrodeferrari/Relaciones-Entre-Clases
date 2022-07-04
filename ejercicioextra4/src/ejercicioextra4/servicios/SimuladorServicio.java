package ejercicioextra4.servicios;

import ejercicioextra4.entidades.*;
import java.util.*;

public class SimuladorServicio {

    private HashSet<Alumno> listaDeAlumnos;

    public Simulador crearSimulacion() {

        Simulador simulador = new Simulador();
        listaDeAlumnos = new HashSet();
        Alumno alumno;
        AlumnoServicio servicioAlumno = new AlumnoServicio();

        while (listaDeAlumnos.size() < 5) {

            alumno = servicioAlumno.crearAlumno();
            listaDeAlumnos.add(alumno);

        }

        simulador.setListaDeAlumnos(listaDeAlumnos);

        mostrarListaDeAlumnos(simulador);

        VotoServicio servicioVoto = new VotoServicio();

        Iterator<Alumno> it = simulador.getListaDeAlumnos().iterator();
        
        while(it.hasNext()){
            
            Voto voto = servicioVoto.crearInstanciaDeVoto(it.next(), simulador.getListaDeAlumnos());
            servicioVoto.votar3Veces(voto);
            
        }
        
        servicioVoto.mostrarVotosQueRecibieronLosAlumnos(simulador.getListaDeAlumnos());

        return simulador;

    }

    public void mostrarListaDeAlumnos(Simulador simulador) {

        for (Alumno alumno : simulador.getListaDeAlumnos()) {

            System.out.println(alumno);

        }

    }

}
