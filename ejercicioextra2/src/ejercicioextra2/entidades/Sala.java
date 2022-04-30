package ejercicioextra2.entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Sala {

    private String[][] sala;
    private ArrayList<Espectador> listaDeEspectadores;
    private int asientosOcupados;
    private int asientosDesocupados;
    public final int CANTIDAD_MAXIMA_DE_ASIENTOS = 48;

    public Sala() {
        this.asientosOcupados = 0;
        this.asientosDesocupados = CANTIDAD_MAXIMA_DE_ASIENTOS;
    }

    public Sala(String[][] sala, ArrayList<Espectador> listaDeEspectadores) {
        this();
        this.sala = sala;
        this.listaDeEspectadores = listaDeEspectadores;
    }

    public String getSala(int f, int c) {
        return sala[f][c];
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getListaDeEspectadores() {
        return listaDeEspectadores;
    }

    public void setListaDeEspectadores(ArrayList<Espectador> listaDeEspectadores) {
        this.listaDeEspectadores = listaDeEspectadores;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public int getAsientosDesocupados() {
        return asientosDesocupados;
    }

    public void setAsientosDesocupados(int asientosDesocupados) {
        this.asientosDesocupados = asientosDesocupados;
    }

    public int getCANTIDAD_MAXIMA_DE_ASIENTOS() {
        return CANTIDAD_MAXIMA_DE_ASIENTOS;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + Arrays.toString(sala) + ", listaDeEspectadores=" + listaDeEspectadores + ", asientosOcupados=" + asientosOcupados + ", asientosDesocupados=" + asientosDesocupados + '}';
    }

}
