package ejercicioextra2.servicios;

import ejercicioextra2.entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula() {
        
        String tituloPelicula, directorPelicula;
        int edadMinimaPelicula;
        double duracionEnHorasDeLaPelicula;
        
        System.out.println("Ingrese el título de la película");
        tituloPelicula = leer.next();
        
        System.out.println("Ingrese la duración de la película, en horas");
        duracionEnHorasDeLaPelicula = leer.nextDouble();
        
        System.out.println("Ingrese la edad mínima de la película");
        edadMinimaPelicula = leer.nextInt();
        
        System.out.println("Ingrese el director de la película");
        directorPelicula = leer.next();
        
        Pelicula pelicula = new Pelicula(tituloPelicula, duracionEnHorasDeLaPelicula, edadMinimaPelicula, directorPelicula);
        
        return pelicula;
     
    }

}
