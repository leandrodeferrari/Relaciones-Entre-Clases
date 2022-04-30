package ejercicioextra3.servicios;

import ejercicioextra3.entidades.CuotaPoliza;
import ejercicioextra3.entidades.Poliza;
import java.util.Date;
import java.util.Scanner;

public class CuotaPolizaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuotaPoliza crearCuotaPoliza(){
        
        int numeroDeCuota;
        double montoTotalDeCuota;
        boolean estaPago;
        String formaDePago;
        Date fechaDeVencimiento;
        Poliza poliza;
        PolizaServicio servicioPoliza = new PolizaServicio();
        
        System.out.println("Ingrese el número de cuota");
        numeroDeCuota = leer.nextInt();
        
        System.out.println("Ingrese el monto total de cuota");
        montoTotalDeCuota = leer.nextDouble();
        
        estaPago = elegirSiEstaPago();
        
        System.out.println("Fecha de vencimiento:");
        fechaDeVencimiento = obtenerFecha();
        
        System.out.println("Ingrese la forma de pago de su cuota");
        formaDePago = leer.next();
        
        System.out.println("Poliza:");
        poliza = servicioPoliza.crearPoliza();
        
        CuotaPoliza cuotaPoliza = new CuotaPoliza(numeroDeCuota, montoTotalDeCuota, estaPago, fechaDeVencimiento, formaDePago, poliza);
        
        return cuotaPoliza;
        
    }
    
    private boolean elegirSiEstaPago() {
        
        int opcion;
        
        System.out.println("¿Está pago?");
        System.out.println("(Si elige una opción erronea, se elige la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();
        
        return opcion == 1;
        
    }
    
    private Date obtenerFecha() {
        
        int dia, mes, anio;
        
        System.out.println("Ingrese el día");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año (4 dígitos)");
        anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        return fecha;
        
    }
    
}
