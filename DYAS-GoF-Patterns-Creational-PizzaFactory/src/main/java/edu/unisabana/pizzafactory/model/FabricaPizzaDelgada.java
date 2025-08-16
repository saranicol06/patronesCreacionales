package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada implements FabricaPizza{
     @Override
    public amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }

}
