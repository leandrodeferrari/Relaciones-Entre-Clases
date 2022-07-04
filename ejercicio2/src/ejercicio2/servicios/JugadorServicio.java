package ejercicio2.servicios;

import ejercicio2.entidades.*;
import java.util.Scanner;

public class JugadorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int idJugador = 0;
    
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

        RevolverDeAguaServicio servicioRevolver = new RevolverDeAguaServicio();

        jugadorUsuario.setEstaMojado(servicioRevolver.mojar(revolver));

        if (jugadorUsuario.isEstaMojado() == false) {

            servicioRevolver.siguienteChorro(revolver);
            return false;

        } else {

            return true;

        }

    }

}
