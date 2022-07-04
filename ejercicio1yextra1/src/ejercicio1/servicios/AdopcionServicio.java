package ejercicio1.servicios;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;

public class AdopcionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Perro> listaDePerros;
    HashSet<Persona> listaDePersonas;

    public HashSet<Perro> listandoPerros() {

        listaDePerros = new HashSet();
        PerroServicio servicioPerro = new PerroServicio();
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
        PersonaServicio servicioPersona = new PersonaServicio();
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

        System.out.println("Listado de perros en adopción:");
        
        for (Perro listaDePerro : listaDePerros) {
            
            System.out.print(listaDePerro.getNombre() + " ");
            
        }

        System.out.println("");

        System.out.println("Ingrese el nombre del perro que desea adoptar");
        nombrePerro = leer.next();

        for (Perro perro : listaDePerros) {

            if (perro.getNombre().equals(nombrePerro) && perro.getTutor() == null) {

                System.out.println("¡Felicidades! Has adoptado a " + perro.getNombre());
                perro.setTutor(persona);
                persona.getPerros().add(perro);
                bandera = true;

            }

        }

        if (bandera == false) {

            System.out.println("Lo siento, el perro que desea adoptar no existe "
                    + "en nuestra lista o ya tiene tutor");

        }

    }

    public void mostrarPersonasConSusPerros() {

        for (Persona persona : listaDePersonas) {

            System.out.println(persona);

        }

    }

}
