
package ejercicioextra4.servicios;

import ejercicioextra4.entidades.Alumno;
import ejercicioextra4.entidades.Voto;
import java.util.HashSet;


public class ServicioVoto {

    public Voto crearInstanciaDeVoto(Alumno alumnoQueVota, HashSet<Alumno> listaDeAlumnosVotados){
        
        Voto voto = new Voto(alumnoQueVota, listaDeAlumnosVotados);
        
        return voto;
        
    }
    
}
