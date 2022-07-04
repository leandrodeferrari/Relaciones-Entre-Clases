package ejercicio2.entidades;

public class Jugador {

    private int idJugador = 0;
    private String nombre;
    private boolean estaMojado;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombre, boolean estaMojado) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.estaMojado = estaMojado;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaMojado() {
        return estaMojado;
    }

    public void setEstaMojado(boolean estaMojado) {
        this.estaMojado = estaMojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", estaMojado=" + estaMojado + '}';
    }
    
}
