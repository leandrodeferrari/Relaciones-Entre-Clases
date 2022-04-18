package ejercicio3.entidades;

import ejercicio3.enumeraciones.NumeroDeCarta;
import ejercicio3.enumeraciones.PaloCarta;
import java.util.Objects;

public class Carta {

    private Integer numeroDeCarta;
    private String paloDeCarta;

    public Carta() {
        
        int numeroAleatorioCarta = (int) (Math.random() * 10);
        int numeroAleatorioPalo = (int) (Math.random() * 4);
        
        this.numeroDeCarta = NumeroDeCarta.values()[numeroAleatorioCarta].getNumero();
        this.paloDeCarta = PaloCarta.values()[numeroAleatorioPalo].getNombre();
        
    }

    public Carta(Integer numeroDeCarta, String paloDeCarta) {
        this.numeroDeCarta = numeroDeCarta;
        this.paloDeCarta = paloDeCarta;
    }

    public Integer getNumeroDeCarta() {
        return numeroDeCarta;
    }

    public void setNumeroDeCarta(Integer numeroDeCarta) {
        this.numeroDeCarta = numeroDeCarta;
    }

    public String getPaloDeCarta() {
        return paloDeCarta;
    }

    public void setPaloDeCarta(String paloDeCarta) {
        this.paloDeCarta = paloDeCarta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.numeroDeCarta);
        hash = 89 * hash + Objects.hashCode(this.paloDeCarta);
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
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.paloDeCarta, other.paloDeCarta)) {
            return false;
        }
        if (!Objects.equals(this.numeroDeCarta, other.numeroDeCarta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carta{" + "numeroDeCarta=" + numeroDeCarta + ", paloDeCarta=" + paloDeCarta + '}';
    }

}
