
package ejercicio1;

import ejercicio1.Entidades.Persona;
import ejercicio1.Servicios.ServicioPersona;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // 1. Realizar un programa para que una Persona pueda adoptar un Perro.
        // Vamos a contar de dos clases. Perro, que tendrá como atributos: 
        // nombre, raza, edad y tamaño; y la clase Persona con atributos: 
        // nombre, apellido, edad, documento y Perro.
        // Ahora deberemos en el main crear dos Personas y dos Perros. Después, 
        // vamos a tener que pensar la lógica necesaria para asignarle a cada 
        // Persona un Perro y por ultimo, mostrar desde la clase Persona, 
        // la información del Perro y de la Persona.
        
        ServicioPersona servicio = new ServicioPersona();
        
        Persona persona1 = servicio.crearPersona();
        Persona persona2 = servicio.crearPersona();
        
        persona1.setPerro(servicio.adoptarPerro());
        persona2.setPerro(servicio.adoptarPerro());
        
        servicio.mostrarDatosDeLaPersona(persona1);
        servicio.mostrarDatosDeLaPersona(persona2);
        
    }

}
