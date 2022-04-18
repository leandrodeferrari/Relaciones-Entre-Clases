
package ejercicio2.servicios;

import ejercicio2.entidades.RevolverDeAgua;


public class ServicioRevolverDeAgua {

    public RevolverDeAgua llenarRevolver(){
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        
        revolver.setPosicionActual((int) (Math.random()* 6));
        revolver.setPosicionAgua((int) (Math.random() * 6));
        
        return revolver;
        
    }
    
    public boolean mojar(RevolverDeAgua revolver){
        
        return (revolver.getPosicionAgua()==revolver.getPosicionActual());
        
    }
    
    public void siguienteChorro(RevolverDeAgua revolver){
        
        if(revolver.getPosicionActual()==5){
            
            revolver.setPosicionActual(0);
            
        } else {
            
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
            
        }
        
    }
    
}
