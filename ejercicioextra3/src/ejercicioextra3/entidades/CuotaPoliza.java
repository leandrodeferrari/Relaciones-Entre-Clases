package ejercicioextra3.entidades;

import java.util.Date;

public class CuotaPoliza {

    private int numeroDeCuota;
    private double montoTotalDeCuota;
    private boolean estaPago;
    private Date fechaDeVencimiento;
    private String formaDePago;
    private Poliza poliza;

    public CuotaPoliza() {
    }

    public CuotaPoliza(int numeroDeCuota, double montoTotalDeCuota, boolean estaPago, Date fechaDeVencimiento, String formaDePago, Poliza poliza) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotalDeCuota = montoTotalDeCuota;
        this.estaPago = estaPago;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.formaDePago = formaDePago;
        this.poliza = poliza;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public double getMontoTotalDeCuota() {
        return montoTotalDeCuota;
    }

    public void setMontoTotalDeCuota(double montoTotalDeCuota) {
        this.montoTotalDeCuota = montoTotalDeCuota;
    }

    public boolean isEstaPago() {
        return estaPago;
    }

    public void setEstaPago(boolean estaPago) {
        this.estaPago = estaPago;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "CuotaPoliza{" + "numeroDeCuota=" + numeroDeCuota + ", montoTotalDeCuota=" + montoTotalDeCuota + ", estaPago=" + estaPago + ", fechaDeVencimiento=" + fechaDeVencimiento + ", formaDePago=" + formaDePago + ", poliza=" + poliza + '}';
    }

}
