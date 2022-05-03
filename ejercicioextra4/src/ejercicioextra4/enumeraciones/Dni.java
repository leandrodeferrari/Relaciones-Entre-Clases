
package ejercicioextra4.enumeraciones;

public enum Dni {
    DNI1(34567567), DNI(23412890), DNI3(56789345), DNI4(12345901), DNI5(90123567), DNI6(78345789), 
    DNI7(23888765), DNI8(34890456), DNI9(55456345), DNI10(9456345);
    
    private Integer documentoDeIdentidad;

    private Dni() {
    }

    private Dni(Integer documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public Integer getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(Integer documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    @Override
    public String toString() {
        return "Dni{" + "documentoDeIdentidad=" + documentoDeIdentidad + '}';
    }
    
}
