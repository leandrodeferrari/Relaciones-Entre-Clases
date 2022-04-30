
package ejercicioextra2.servicios;

import ejercicioextra2.entidades.Cine;
import ejercicioextra2.entidades.Pelicula;
import ejercicioextra2.entidades.Sala;


public class ServicioCine {

    public Cine crearCine(){
        
        ServicioPelicula ServicioPelicula = new ServicioPelicula();
        Pelicula peliculaCine = ServicioPelicula.crearPelicula();
        
        ServicioSala servicioSala = new ServicioSala();
        Sala sala = servicioSala.crearSalaSinEspectadores();
        
        int precioCine = (int) (Math.random()*1000+1);
        System.out.println("Precio de la entrada: " + precioCine);
        
        Cine cine = new Cine(peliculaCine, sala, precioCine);
        
        return cine;
        
    }
    
}
