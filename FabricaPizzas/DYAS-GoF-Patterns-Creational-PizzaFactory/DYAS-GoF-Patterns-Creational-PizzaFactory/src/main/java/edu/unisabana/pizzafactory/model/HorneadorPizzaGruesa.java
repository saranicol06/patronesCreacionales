
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class  HorneadorPizzaGruesa implements Horneador {

    public void hornear() {
        Logger.getLogger(AmasadorPizzaGuesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza Gruesa con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
