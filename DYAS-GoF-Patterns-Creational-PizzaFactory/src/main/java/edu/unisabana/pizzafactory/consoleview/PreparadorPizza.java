
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.FabricaPizzaIntegral;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.amasador;



import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione tipo de pizza: 1) Delgada  2) Gruesa  3) Integral");
        int opcion = sc.nextInt();

        FabricaPizza fabrica;
        switch (opcion) {
            case 1: fabrica = new FabricaPizzaDelgada(); break;
            case 2: fabrica = new FabricaPizzaGruesa(); break;
            case 3: fabrica = new FabricaPizzaIntegral(); break;
            default: throw new IllegalArgumentException("Opción inválida");
        }
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();            
            pp.prepararPizza(fabrica, ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(FabricaPizza fabrica,Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        amasador am = new AmasadorPizzaDelgada();
        Horneador hpd = new HorneadorPizzaDelgada();
        Moldeador mp = new MoldeadorPizzaDelgada();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
