package ejercicio3.Enumeraciones;

public enum NumeroDeCarta {
    UNO(1),DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6),SIETE(7),DIEZ(10),ONCE(11),DOCE(12);
    
    private Integer numero;

    private NumeroDeCarta() {
    }

    private NumeroDeCarta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
