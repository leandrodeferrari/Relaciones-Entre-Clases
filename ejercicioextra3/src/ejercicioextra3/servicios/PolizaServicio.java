package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Cliente;
import ejercicioextra3.entidades.Poliza;
import ejercicioextra3.entidades.Vehiculo;
import java.util.Date;
import java.util.Scanner;

public class PolizaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Poliza crearPoliza() {

        int cantidadDeCuotas;
        String formaDePago, opcionGranizo, tipoDeCobertura;
        Date fechaDeInicio, fechaDeFinalizacion;
        double montoTotalAsegurado, montoMaximoGranizo;
        boolean incluyeGranizo;
        Vehiculo vehiculo;
        VehiculoServicio servicioVehiculo = new VehiculoServicio();
        Cliente cliente;
        ClienteServicio servicioCliente = new ClienteServicio();
        
        System.out.println("Fecha de inicio:");
        fechaDeInicio = obtenerFecha();
        
        System.out.println("Fecha de finalizacion");
        fechaDeFinalizacion = obtenerFecha();
        
        System.out.println("Ingrese la cantidad de cuotas de su poliza");
        cantidadDeCuotas = leer.nextInt();
        
        System.out.println("Ingrese la forma de pago");
        formaDePago = leer.next();
        
        System.out.println("ingrese el monto total asegurado");
        montoTotalAsegurado = leer.nextDouble();
        
        incluyeGranizo = eleccionGranizo();
        
        if (incluyeGranizo == true) {

            System.out.println("Ingrese el monto máximo de granizo");
            montoMaximoGranizo = leer.nextDouble();

        } else {
            
             montoMaximoGranizo = 0;
            
        }
        
        System.out.println("Ingrese el tipo de cobertura");
        tipoDeCobertura = leer.next();
        
        System.out.println("vehículo:");
        vehiculo = servicioVehiculo.crearVehiculo();
        
        System.out.println("Cliente:");
        cliente = servicioCliente.crearCliente();
        
        Poliza poliza = new Poliza(fechaDeInicio, fechaDeFinalizacion, cantidadDeCuotas, formaDePago, montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo, tipoDeCobertura, vehiculo, cliente);

        return poliza;

    }

    private boolean eleccionGranizo() {

        int opcion;

        System.out.println("¿Incluye granizo?");
        System.out.println("(Si elige una opción que no existe, se eligirá por defecto la opción 2)");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcion = leer.nextInt();

        return opcion == 1;

    }

    private Date obtenerFecha(){
        
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
