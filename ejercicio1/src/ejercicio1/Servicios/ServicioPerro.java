
package ejercicio1.Servicios;

import ejercicio1.Entidades.Perro;
import java.util.Scanner;


public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        String nombrePerro, razaPerro, tamanioPerro;
        int edadPerro;
        
        System.out.println("Ingrese el nombre de su perro");
        nombrePerro = leer.next();
        System.out.println("Ingrese la raza de su perro");
        razaPerro = leer.next();
        System.out.println("Ingrese la edad de su perro");
        edadPerro = leer.nextInt();
        System.out.println("Ingrese el tamaño de su perro (CHICO/MEDIANO/GRANDE)");
        tamanioPerro = leer.next();
        
        Perro perroUsuario = new Perro(nombrePerro, razaPerro, edadPerro, tamanioPerro);
        
        return perroUsuario;
        
    }
    
}
