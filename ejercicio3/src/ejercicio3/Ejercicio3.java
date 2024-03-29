package ejercicio3;

import ejercicio3.servicios.ServicioMazo;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // 3. Realizar una baraja de cartas españolas orientada a objetos. Una carta 
        // tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo 
        // (espadas, bastos, oros y copas). Esta clase debe contener un método toString() 
        // que retorne el número de carta y el palo. La baraja estará compuesta 
        // por un conjunto de cartas, 40 exactamente.
        // 
        // Las operaciones que podrá realizar la baraja son: 
        //
        // a) barajar(): cambia de posición todas las cartas aleatoriamente.
        // b) siguienteCarta(): devuelve la siguiente carta que está en la baraja, 
        // cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
        // c) cartasDisponibles(): indica el número de cartas que aún se puede repartir.
        // d) darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
        // número de cartas. En caso de que haya menos cartas que las pedidas, no 
        // devolveremos nada, pero debemos indicárselo al usuario.
        // e) cartasMonton(): mostramos aquellas cartas que ya han salido, 
        // si no ha salido ninguna indicárselo al usuario.
        // f) mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, 
        // si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
        
        ServicioMazo servicio = new ServicioMazo();
        servicio.Menu();
        
    }
    
}
