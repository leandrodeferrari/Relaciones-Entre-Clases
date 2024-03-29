package ejercicio2.servicios;

import ejercicio2.entidades.*;
import java.util.*;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int cantidadJugadores;
    ArrayList<Jugador> listaJugadores;

    public void decidirNumeroDeJugadores() {

        System.out.println("Ingrese la cantidad de jugadores que van a jugar");
        System.out.println("(Máximo 6 jugadores)");
        cantidadJugadores = leer.nextInt();

        if (cantidadJugadores > 6) {

            cantidadJugadores = 6;

        }

    }

    public ArrayList<Jugador> llenarJugadores() {

        JugadorServicio servicioJugador = new JugadorServicio();
        listaJugadores = new ArrayList();

        for (int i = 0; i < cantidadJugadores; i++) {

            System.out.println("Ingrese los datos del jugador N°" + (i + 1));
            Jugador jugadorUsuario = servicioJugador.crearJugador();

            listaJugadores.add(jugadorUsuario);

        }

        return listaJugadores;

    }

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {

        Juego juegoUsuario = new Juego();

        juegoUsuario.setJugadores(jugadores);
        juegoUsuario.setRevolver(revolver);

        return juegoUsuario;

    }

    public void ronda(Juego juego) {

        JugadorServicio servicioJugador = new JugadorServicio();
        boolean bandera = false;
        int cantidadRondas = 0;
        int numeroJugador = 0;

        while (bandera == false) {

            if (numeroJugador >= cantidadJugadores) {

                numeroJugador = 0;

            }

            cantidadRondas++;
            
            System.out.println(cantidadRondas + "° ronda");

            System.out.println("Jugador " + (numeroJugador + 1));

            bandera = servicioJugador.disparo(juego.getRevolver(), listaJugadores.get(numeroJugador));

            if (bandera == true) {

                System.out.println("¡BANG!");
                System.out.println(listaJugadores.get(numeroJugador).getNombre() + ", ¡Perdiste!");
                break;

            } else {

                System.out.println("...");
                System.out.println("No ha salido nada. ¡Safaste!");

            }

            numeroJugador++;

        }

    }

    public void jugar() {

        RevolverDeAguaServicio servicioRevolver = new RevolverDeAguaServicio();

        System.out.println("¡Comienza el juego!");
        System.out.println("");
        decidirNumeroDeJugadores();
        System.out.println("");
        llenarJugadores();
        System.out.println("");
        RevolverDeAgua revolver = servicioRevolver.llenarRevolver();
        Juego juego = llenarJuego(listaJugadores, revolver);
        System.out.println("");
        ronda(juego);
        System.out.println("");
        listaJugadores.clear();

    }

}
