
package ejercicio3.Servicios;

import ejercicio3.Entidades.Carta;
import ejercicio3.Entidades.Mazo;
import java.util.HashSet;


public class ServicioMazo {

    HashSet<Carta> baraja;
    
    public HashSet<Carta> crearBaraja(){
        
        baraja = new HashSet();
        
        while (baraja.size()!=40) {
            
            Carta cartaUsuario = new Carta();
            
            baraja.add(cartaUsuario);
            
        }
        
        return baraja;
        
    }
    
    public Mazo llenarBaraja(){
        
        Mazo mazoJuego = new Mazo();
        
        mazoJuego.setBarajaDeCartas(baraja);
        
        return mazoJuego;
        
    }
    
}
