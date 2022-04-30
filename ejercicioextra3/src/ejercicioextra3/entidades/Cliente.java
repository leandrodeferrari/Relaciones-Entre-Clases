package ejercicioextra3.entidades;

public class Cliente {

    private String nombre;
    private String apellido;
    private Integer documentoDeIdentidad;
    private String domicilio;
    private String correoElectronico;
    private Integer numeroDeTelefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Integer documentoDeIdentidad, String domicilio, String correoElectronico, Integer numeroDeTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.domicilio = domicilio;
        this.correoElectronico = correoElectronico;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(Integer documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(Integer numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documentoDeIdentidad=" + documentoDeIdentidad + ", domicilio=" + domicilio + ", correoElectronico=" + correoElectronico + ", numeroDeTelefono=" + numeroDeTelefono + '}';
    }

}
