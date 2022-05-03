package ejercicioextra4.servicios;

import ejercicioextra4.entidades.Alumno;
import ejercicioextra4.entidades.Simulador;
import ejercicioextra4.entidades.Voto;
import java.util.HashSet;
import java.util.Iterator;

public class ServicioSimulador {

    HashSet<Alumno> listaDeAlumnos;

    public Simulador crearSimulacion() {

        Simulador simulador = new Simulador();
        listaDeAlumnos = new HashSet();
        Alumno alumno;
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        while (listaDeAlumnos.size() < 5) {

            alumno = servicioAlumno.crearAlumno();
            listaDeAlumnos.add(alumno);

        }

        simulador.setListaDeAlumnos(listaDeAlumnos);

        mostrarListaDeAlumnos(simulador);

        ServicioVoto servicioVoto = new ServicioVoto();

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
