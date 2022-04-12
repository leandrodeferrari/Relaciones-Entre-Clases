package ejercicio2.Servicios;

import ejercicio2.Entidades.Jugador;
import ejercicio2.Entidades.RevolverDeAgua;
import java.util.Scanner;

public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int idJugador = 0;
    
    public Jugador crearJugador() {

        String nombre;
        idJugador++;
        
        if (idJugador >= 7) {

            idJugador = 0;

        }

        System.out.println("Ingrese su nombre");
        nombre = leer.next() + " (Jugador " + idJugador + ")";

        boolean estaMojado = false;

        Jugador jugadorUsuario = new Jugador(idJugador, nombre, estaMojado);

        return jugadorUsuario;

    }

    public boolean disparo(RevolverDeAgua revolver, Jugador jugadorUsuario) {

        ServicioRevolverDeAgua servicioRevolver = new ServicioRevolverDeAgua();

        jugadorUsuario.setEstaMojado(servicioRevolver.mojar(revolver));

        if (jugadorUsuario.isEstaMojado() == false) {

            servicioRevolver.siguienteChorro(revolver);
            return false;

        } else {

            return true;

        }

    }

}
