package ejercicioextra3.entidades;

import java.util.Date;

public class Poliza {

    private int numeroDePoliza;
    private Date fechaDeInicio;
    private Date fechaDeFinalizacion;
    private int cantidadDeCuotas;
    private String formaDePago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;
    private String tipoDeCobertura;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private static int contadorPolizas;
    
    public Poliza() {
        this.numeroDePoliza = ++Poliza.contadorPolizas;
    }

    public Poliza(Date fechaDeInicio, Date fechaDeFinalizacion, int cantidadDeCuotas, String formaDePago, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo, String tipoDeCobertura, Vehiculo vehiculo, Cliente cliente) {
        this();
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }   
    
    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public static int getContadorPolizas() {
        return Poliza.contadorPolizas;
    } 
    
    @Override
    public String toString() {
        return "Poliza{" + "numeroDePoliza=" + numeroDePoliza + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFinalizacion=" + fechaDeFinalizacion + ", cantidadDeCuotas=" + cantidadDeCuotas + ", formaDePago=" + formaDePago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoDeCobertura=" + tipoDeCobertura + ", vehiculo=" + vehiculo + ", cliente=" + cliente + '}';
    }

}
