
package ejercicioextra2.servicios;

import ejercicioextra2.entidades.Espectador;
import java.util.Scanner;


public class ServicioEspectador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspectador(){
        
        String nombreEspectador;
        int edadEspectador;
        double dineroDisponibleDelEspectador;
        
        System.out.println("ingrese su nombre");
        nombreEspectador = leer.next();
        
        System.out.println("Ingrese su edad");
        edadEspectador = leer.nextInt();
        
        System.out.println("Ingres su dinero disponible");
        dineroDisponibleDelEspectador = leer.nextDouble();
        
        Espectador espectador = new Espectador(nombreEspectador, edadEspectador, dineroDisponibleDelEspectador);
        
        return espectador;
        
    }
    
}
