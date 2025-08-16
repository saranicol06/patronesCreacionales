
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class  HorneadorPizzaIntegral implements Horneador {

    public void hornear() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza Integral con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
