package edu.unisabana.pizzafactory.model;

public class FabricaPizzaIntegral implements FabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }

}
