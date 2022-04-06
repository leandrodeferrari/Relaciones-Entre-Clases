
package ejercicio1.Servicios;

import ejercicio1.Entidades.Perro;
import ejercicio1.Entidades.Persona;
import java.util.Scanner;


public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        String nombre, apellido;
        int edad;
        long documentoDeIdentidad;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su apeliido");
        apellido = leer.next();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        System.out.println("Ingrese su número de documento");
        documentoDeIdentidad = leer.nextLong();
        
        Persona personaUsuario = new Persona(nombre, apellido, edad, documentoDeIdentidad);
        
        return personaUsuario;
        
    }
    
    public Perro adoptarPerro(){
        
        System.out.println("¡Felicidades, ya has adoptado un perrito!");
        System.out.println("Ahora, por favor, ingrese los datos de tu nuevo acompañante");
        ServicioPerro servicio = new ServicioPerro();
        Perro perroPersona = servicio.crearPerro();
        
        return perroPersona;
        
    }
    
    public void mostrarDatosDeLaPersona(Persona personaUsuario){
        
        System.out.println(personaUsuario.toString());
        
    }
    
}
