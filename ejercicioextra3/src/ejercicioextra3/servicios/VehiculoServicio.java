package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {

        String marca, modelo, numeroDeMotor, chasis, color, tipo;
        int anio;

        System.out.println("Ingrese la marca del vehículo");
        marca = leer.next();

        System.out.println("Ingrese el modelo de su vehículo");
        modelo = leer.next();

        System.out.println("Ingrese el año de su vehículo");
        anio = leer.nextInt();

        System.out.println("Ingrese el número de motor de su vehículo");
        numeroDeMotor = leer.next();

        System.out.println("Ingrese el chasis de su vehículo");
        chasis = leer.next();

        System.out.println("Ingrese el color de su vehículo");
        color = leer.next();

        System.out.println("Ingrese el tipo de su vehículo (Camioneta, sedán, etc.))");
        tipo = leer.next();

        Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, numeroDeMotor, chasis, color, tipo);

        return vehiculo;

    }

}
