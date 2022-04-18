
package ejercicio1.servicios;

import ejercicio1.entidades.Perro;
import java.util.Scanner;


public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        String nombrePerro, razaPerro, tamanioPerro;
        int edadPerro;
        
        System.out.println("Ingrese el nombre del perro");
        nombrePerro = leer.next();
        System.out.println("Ingrese la raza del perro");
        razaPerro = leer.next();
        System.out.println("Ingrese la edad del perro");
        edadPerro = leer.nextInt();
        System.out.println("Ingrese el tamaño del perro (CHICO/MEDIANO/GRANDE)");
        tamanioPerro = leer.next();
        
        Perro perroUsuario = new Perro(nombrePerro, razaPerro, edadPerro, tamanioPerro);
        
        return perroUsuario;
        
    }
    
}
