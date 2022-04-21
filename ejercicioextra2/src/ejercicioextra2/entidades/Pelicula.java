
package ejercicioextra2.entidades;


public class Pelicula {

    private String titulo;
    private double duracionEnHoras;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracionEnHoras, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracionEnHoras = duracionEnHoras;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(double duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionEnHoras=" + duracionEnHoras + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
}
