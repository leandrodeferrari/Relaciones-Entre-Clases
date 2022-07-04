package ejercicio1.entidades;

import java.util.HashSet;

public class Adopcion {

    private HashSet<Perro> listaDePerros;
    private HashSet<Persona> listaDePersonas;

    public Adopcion() {
    }

    public Adopcion(HashSet<Perro> listaDePerros, HashSet<Persona> listaDePersonas) {
        this.listaDePerros = listaDePerros;
        this.listaDePersonas = listaDePersonas;
    }

    public HashSet<Perro> getListaDePerros() {
        return listaDePerros;
    }

    public void setListaDePerros(HashSet<Perro> listaDePerros) {
        this.listaDePerros = listaDePerros;
    }

    public HashSet<Persona> getListaDePersonas() {
        return listaDePersonas;
    }

    public void setListaDePersonas(HashSet<Persona> listaDePersonas) {
        this.listaDePersonas = listaDePersonas;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "listaDePerros=" + listaDePerros + ", listaDePersonas=" + listaDePersonas + '}';
    }
            
} 
