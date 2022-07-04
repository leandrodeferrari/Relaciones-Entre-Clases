package ejercicio1.servicios;

import ejercicio1.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        String nombre, apellido;
        int edad;
        long documentoDeIdentidad;
        
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese el apeliido");
        apellido = leer.next();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        System.out.println("Ingrese el número de documento");
        documentoDeIdentidad = leer.nextLong();
        
        Persona personaUsuario = new Persona(nombre, apellido, edad, documentoDeIdentidad);
        
        return personaUsuario;
        
    }
    
    public void mostrarDatosDeLaPersona(Persona personaUsuario){
        
        System.out.println(personaUsuario.toString());
        
    }
    
}
