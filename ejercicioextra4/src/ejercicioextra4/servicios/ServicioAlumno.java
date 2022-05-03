package ejercicioextra4.servicios;

import ejercicioextra4.entidades.Alumno;
import ejercicioextra4.enumeraciones.Dni;
import ejercicioextra4.enumeraciones.NombreDeAlumno;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {

        NombreDeAlumno nombreCompleto;
        int numeroRandomNombre = (int) (Math.random()*9+1);
        int numeroRandomDni = (int) (Math.random()*9+1);
        Dni documentoDeIdentidad;

        System.out.println("Ingrese su nombre completo");
        nombreCompleto = NombreDeAlumno.values()[numeroRandomNombre];

        System.out.println("Ingrese su número de documento");
        documentoDeIdentidad = Dni.values()[numeroRandomDni];

        Alumno alumno = new Alumno(nombreCompleto, documentoDeIdentidad, 0);

        return alumno;

    }

}
