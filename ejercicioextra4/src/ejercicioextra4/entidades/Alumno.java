package ejercicioextra4.entidades;

import ejercicioextra4.enumeraciones.*;
import java.util.Objects;

public class Alumno {

    private NombreDeAlumno nombreCompleto;
    private Dni documentoDeIdentidad;
    private int cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(NombreDeAlumno nombreCompleto, Dni documentoDeIdentidad, int cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public NombreDeAlumno getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombreDeAlumno nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Dni getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(Dni documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.documentoDeIdentidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.documentoDeIdentidad != other.documentoDeIdentidad) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", documentoDeIdentidad=" + documentoDeIdentidad + ", cantidadDeVotos=" + cantidadDeVotos + '}';
    }

}
