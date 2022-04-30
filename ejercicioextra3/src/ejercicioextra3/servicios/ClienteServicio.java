package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Cliente;
import java.util.Scanner;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {

        String nombre, apellido, domicilio, correoElectronico;
        Integer documentoDeIdentidad, numeroDeTelefono;

        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su apellido");
        apellido = leer.next();
        System.out.println("Ingrese su número de documento");
        documentoDeIdentidad = leer.nextInt();
        System.out.println("Ingrese su domicilio (calle y número)");
        domicilio = leer.next();
        System.out.println("Ingrese su correo electrónico");
        correoElectronico = leer.next();
        System.out.println("Ingrese su número de teléfono (solo números)");
        numeroDeTelefono = leer.nextInt();

        Cliente cliente = new Cliente(nombre, apellido, documentoDeIdentidad, domicilio, correoElectronico, numeroDeTelefono);

        return cliente;

    }

}
