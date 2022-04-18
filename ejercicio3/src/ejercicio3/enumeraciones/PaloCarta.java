package ejercicio3.enumeraciones;

public enum PaloCarta {
    ESPADA("espada"),BASTO("basto"),ORO("oro"),COPA("copa");
    
    private String nombre;

    private PaloCarta() {
    }

    private PaloCarta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
