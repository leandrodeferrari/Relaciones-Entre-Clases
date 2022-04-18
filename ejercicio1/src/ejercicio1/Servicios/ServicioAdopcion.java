package ejercicio1.Servicios;

import ejercicio1.Entidades.Perro;
import ejercicio1.Entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;

public class ServicioAdopcion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Perro> listaDePerros;
    HashSet<Persona> listaDePersonas;

    public HashSet<Perro> listandoPerros() {

        listaDePerros = new HashSet();
        ServicioPerro servicioPerro = new ServicioPerro();
        int cantidadDePerros;

        System.out.println("¿Cuántos perros desea agregar al listado?");
        cantidadDePerros = leer.nextInt();

        for (int i = 0; i < cantidadDePerros; i++) {

            listaDePerros.add(servicioPerro.crearPerro());

        }

        return listaDePerros;

    }

    public HashSet<Persona> listandoPersonas() {

        listaDePersonas = new HashSet();
        ServicioPersona servicioPersona = new ServicioPersona();
        int cantidadDePersonas;

        System.out.println("¿Cuántas personas desea agregar al listado?");
        cantidadDePersonas = leer.nextInt();

        for (int i = 0; i < cantidadDePersonas; i++) {

            listaDePersonas.add(servicioPersona.crearPersona());

        }

        return listaDePersonas;

    }

    public void adoptarSegunListadoDePersonas() {

        for (Persona persona : listaDePersonas) {

            if (quiereAdoptar(persona.getNombre(), persona.getApellido())) {

                System.out.println("¡Buenísimo! Continuemos con la adopción");
                adoptar(persona);

            }

        }

    }

    public boolean quiereAdoptar(String nombre, String apellido) {

        String opcion;

        System.out.println(nombre + " " + apellido + ", ¿Desea adopar un perro? SI/NO");
        opcion = leer.next();

        while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no")) {

            System.out.println("Ha ingresado una opción inválida, vuelva a intentarlo");
            opcion = leer.next();

        }

        return opcion.equalsIgnoreCase("si");

    }

    public void adoptar(Persona persona) {

        String nombrePerro;
        boolean bandera = false;

//        System.out.println("Listado de perros en adopción:");
//        System.out.println(listaDePerros.toString());
//        System.out.println("");
        System.out.println("Ingrese el nombre del perro que desea adoptar");
        nombrePerro = leer.next();

        for (Perro perro : listaDePerros) {

            if (perro.getNombre().equals(nombrePerro) && perro.getTutor() == null) {

                System.out.println("¡Felicidades! Has adoptado a " + perro.getNombre());
                perro.setTutor(persona);
                persona.getPerros().add(perro);
                bandera = true;
// Bucle infinito de llamadas en el tostring
//System.out.println(persona);
            }

        }

        if (bandera == false) {

            System.out.println("Lo siento, el perro que desea adoptar no existe "
                    + "en nuestra lista o ya tiene tutor");

        }

    }

}
