package ejercicioextra2.entidades;

import java.util.Arrays;

public class Cine {

    private Pelicula peliculaReproduciendo;
    private Sala salaConEspectadores;
    private double precioDeEntrada;

    public Cine() {
    }

    public Cine(Pelicula peliculaReproduciendo, Sala salaConEspectadores, double precioDeEntrada) {
        this.peliculaReproduciendo = peliculaReproduciendo;
        this.salaConEspectadores = salaConEspectadores;
        this.precioDeEntrada = precioDeEntrada;
    }

    public Pelicula getPeliculaReproduciendo() {
        return peliculaReproduciendo;
    }

    public void setPeliculaReproduciendo(Pelicula peliculaReproduciendo) {
        this.peliculaReproduciendo = peliculaReproduciendo;
    }

    public Sala getSalaConEspectadores() {
        return salaConEspectadores;
    }

    public void setSalaConEspectadores(Sala salaConEspectadores) {
        this.salaConEspectadores = salaConEspectadores;
    }

    public double getPrecioDeEntrada() {
        return precioDeEntrada;
    }

    public void setPrecioDeEntrada(double precioDeEntrada) {
        this.precioDeEntrada = precioDeEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "peliculaReproduciendo=" + peliculaReproduciendo + ", salaConEspectadores=" + salaConEspectadores + ", precioDeEntrada=" + precioDeEntrada + '}';
    }

}
