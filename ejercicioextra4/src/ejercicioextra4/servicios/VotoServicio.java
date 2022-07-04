package ejercicioextra4.servicios;

import ejercicioextra4.entidades.*;
import java.util.*;

public class VotoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Voto crearInstanciaDeVoto(Alumno alumnoQueVota, HashSet<Alumno> listaDeAlumnosVotados) {

        Voto voto = new Voto(alumnoQueVota, listaDeAlumnosVotados);

        return voto;

    }

    public void votar3Veces(Voto voto) {

        HashSet<Alumno> ListaDe3AlumnosVotados = new HashSet();
        int contadorVotos = 0;
        String opcionVoto;
        System.out.println(voto.getAlumnoQueVota().getNombreCompleto() + ", ¿A quien desea votar?");
        System.out.println("Debe votar a 3 alumnos");
        System.out.println("No puede votarse a sí mismo ni votar al mismo alumno, más de una vez");

        while (ListaDe3AlumnosVotados.size()<3) {

            for (Alumno alumno : voto.getListaDeAlumnosVotados()) {

                if(!alumno.getNombreCompleto().toString().equals(voto.getAlumnoQueVota().toString())){
                    
                    System.out.println(alumno.getNombreCompleto());
                    
                }

            }

            opcionVoto = leer.next();

            for (Alumno alumno : voto.getListaDeAlumnosVotados()) {

                if (alumno.getNombreCompleto().toString().equalsIgnoreCase(opcionVoto) && !alumno.getNombreCompleto().toString().equalsIgnoreCase(voto.getAlumnoQueVota().getNombreCompleto().toString())) {

                    System.out.println("Has votado a " + alumno.getNombreCompleto());
                    alumno.setCantidadDeVotos(contadorVotos + 1);
                    ListaDe3AlumnosVotados.add(alumno);

                }

            }

        }

        System.out.println("Lista de los 3 alumnos que votaste: " + ListaDe3AlumnosVotados);
        
    }

    public void mostrarVotosQueRecibieronLosAlumnos(HashSet<Alumno> listaAlumnos) {
        
        for (Alumno alumno : listaAlumnos) {
            
            System.out.println(alumno.getNombreCompleto() + " : " + alumno.getCantidadDeVotos());
            
        }
        
    }
    
}
