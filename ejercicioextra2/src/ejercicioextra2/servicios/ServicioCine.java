
package ejercicioextra2.servicios;

import ejercicioextra2.entidades.Cine;
import ejercicioextra2.entidades.Pelicula;


public class ServicioCine {

    public Cine crearCine(){
        
        ServicioPelicula ServicioPelicula = new ServicioPelicula();
        Pelicula peliculaCine = ServicioPelicula.crearPelicula();
        
        double precioCine = Math.random()*500+1;
        
        // Sala
        
        
        Cine cine = new Cine();
        
        return cine;
        
    }
    
}
