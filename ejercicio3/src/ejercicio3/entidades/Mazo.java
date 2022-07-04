package ejercicio3.entidades;

import java.util.HashSet;

public class Mazo {

    private HashSet<Carta> barajaDeCartas;
    private HashSet<Carta> cartasDelMonton;

    public Mazo() {
    }

    public Mazo(HashSet<Carta> barajaDeCartas, HashSet<Carta> cartasDelMonton) {
        this.barajaDeCartas = barajaDeCartas;
        this.cartasDelMonton = cartasDelMonton;
    }

    public HashSet<Carta> getBarajaDeCartas() {
        return barajaDeCartas;
    }

    public void setBarajaDeCartas(HashSet<Carta> barajaDeCartas) {
        this.barajaDeCartas = barajaDeCartas;
    }

    public HashSet<Carta> getCartasDelMonton() {
        return cartasDelMonton;
    }

    public void setCartasDelMonton(HashSet<Carta> cartasDelMonton) {
        this.cartasDelMonton = cartasDelMonton;
    }

    @Override
    public String toString() {
        return "Mazo{" + "barajaDeCartas=" + barajaDeCartas + ", cartasDelMonton=" + cartasDelMonton + '}';
    }
    
}
