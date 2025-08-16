
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaGuesa implements amasador {

    
    
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGuesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza Gruesa con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
