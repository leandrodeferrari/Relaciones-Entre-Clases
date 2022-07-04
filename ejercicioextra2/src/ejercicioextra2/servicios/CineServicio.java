package ejercicioextra2.servicios;

import ejercicioextra2.entidades.*;

public class CineServicio {

    public Cine crearCine(){
        
        PeliculaServicio ServicioPelicula = new PeliculaServicio();
        Pelicula peliculaCine = ServicioPelicula.crearPelicula();
        
        SalaServicio servicioSala = new SalaServicio();
        Sala sala = servicioSala.crearSalaSinEspectadores();
        
        int precioCine = (int) (Math.random()*1000+1);
        System.out.println("Precio de la entrada: " + precioCine);
        
        Cine cine = new Cine(peliculaCine, sala, precioCine);
        
        return cine;
        
    }
    
}
