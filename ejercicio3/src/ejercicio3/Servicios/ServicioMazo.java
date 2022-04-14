package ejercicio3.Servicios;

import ejercicio3.Entidades.Carta;
import ejercicio3.Entidades.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioMazo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Carta> baraja;
    HashSet<Carta> cartasDelMonton = cartasDelMonton = new HashSet();

    ;
    

    public Mazo llenarBaraja() {

        Mazo mazoJuego = new Mazo();
        baraja = new HashSet();

        while (baraja.size() != 40) {

            Carta cartaUsuario = new Carta();

            baraja.add(cartaUsuario);

        }

        mazoJuego.setBarajaDeCartas(baraja);

        return mazoJuego;

    }

    public Mazo barajar(Mazo mazo) {

        System.out.println("Barajando...");

        ArrayList<Carta> listaCartas = new ArrayList(mazo.getBarajaDeCartas());
        Collections.shuffle(listaCartas);
        HashSet<Carta> listaCartasDesordenadas = new HashSet(listaCartas);

        mazo.setBarajaDeCartas(listaCartasDesordenadas);
        return mazo;

    }

    public Carta siguienteCarta(Mazo mazo) {

        Carta cartaSiguiente = new Carta();
        Iterator<Carta> it = mazo.getBarajaDeCartas().iterator();
        boolean bandera = false;

        while (it.hasNext() && bandera == false) {

            cartaSiguiente = it.next();
            cartasDelMonton.add(cartaSiguiente);
            mazo.setCartasDelMonton(cartasDelMonton);
            it.remove();
            bandera = true;

        }

        if (bandera == false) {

            System.out.println("Lo siento, no hay más cartas");
            cartaSiguiente = null;

        }

        return cartaSiguiente;

    }

    public int cartasDisponibles(Mazo mazo) {

        int cartasDisponibles = mazo.getBarajaDeCartas().size();
        System.out.println("Cartas en la baraja: " + cartasDisponibles);
        return cartasDisponibles;

    }

    public HashSet<Carta> darCartas(Mazo mazo) {
        
        HashSet<Carta> cartasAgarradas = new HashSet();
        int numeroDeCartas;
        
        System.out.println("Ingrese el número de cartas que desea agarrar");
        numeroDeCartas = leer.nextInt();
        
        if(mazo.getBarajaDeCartas().size()<numeroDeCartas){
            
            System.out.println("Lo siento, no hay suficientes cartas para agarrar");
            cartasAgarradas = null;
            
        } else {
            
            for (int i = 0; i < numeroDeCartas; i++) {
                
                cartasAgarradas.add(siguienteCarta(mazo)); 
                
            }
            
        }
        
        return cartasAgarradas;
        
    }

    public void mostrarCartasDelMonton(Mazo mazo){
        
        if(mazo.getCartasDelMonton()==null){
            
            System.out.println("No han salido cartas");
            
        } else {
            
            System.out.println("Cartas del monton:");
            System.out.println(mazo.getCartasDelMonton());
            
        }
        
    }

    public void mostrarBaraja(Mazo mazo){
        
        System.out.println("Cartas que quedan en la baraja:");
        System.out.println(mazo.getBarajaDeCartas());
        
    }
    
}
