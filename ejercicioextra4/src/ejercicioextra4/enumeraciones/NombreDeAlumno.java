package ejercicioextra4.enumeraciones;

public enum NombreDeAlumno {
    ALUMNO1("Leandro Deferrari"), ALUMNO2("Juan Pergola"), ALUMNO3("Agustin Dedico"), 
    ALUMNO4("Lucas Clivio"), ALUMNO5("Nahuel Audisio"), ALUMNO6("Daiana Urquilla"), 
    ALUMNO7("Jorge Triarico"), ALUMNO8("Joel Medina"), ALUMNO9("Gimena Sacco"), ALUMNO10("Armando Ruiz");
    
    private String nombreCompleto;

    private NombreDeAlumno() {
    }

    private NombreDeAlumno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "NombreDeAlumno{" + "nombreCompleto=" + nombreCompleto + '}';
    }
    
}
