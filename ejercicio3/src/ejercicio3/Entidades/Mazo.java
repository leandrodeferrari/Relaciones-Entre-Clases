
package ejercicio3.Entidades;

import java.util.HashSet;


public class Mazo {

    HashSet<Carta> barajaDeCartas;

    public Mazo() {
    }

    public Mazo(HashSet<Carta> barajaDeCartas) {
        this.barajaDeCartas = barajaDeCartas;
    }

    public HashSet<Carta> getBarajaDeCartas() {
        return barajaDeCartas;
    }

    public void setBarajaDeCartas(HashSet<Carta> barajaDeCartas) {
        this.barajaDeCartas = barajaDeCartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "barajaDeCartas=" + barajaDeCartas + '}';
    }
    
}
