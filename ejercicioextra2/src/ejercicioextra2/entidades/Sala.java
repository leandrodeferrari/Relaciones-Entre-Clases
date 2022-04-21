
package ejercicioextra2.entidades;

import java.util.ArrayList;


public class Sala {

    private String[][] sala;
    private ArrayList<Espectador> listaDeEspectadores;
    private int asientosOcupados;
    private int asientosDesocupados;
    public static final int CANTIDAD_MAXIMA_DE_ASIENTOS = 48;

    public Sala() {
        this.asientosOcupados = 0;
        this.asientosDesocupados = 48;
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

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + ", listaDeEspectadores=" + listaDeEspectadores + ", asientosOcupados=" + asientosOcupados + ", asientosDesocupados=" + asientosDesocupados + '}';
    }
    
}
