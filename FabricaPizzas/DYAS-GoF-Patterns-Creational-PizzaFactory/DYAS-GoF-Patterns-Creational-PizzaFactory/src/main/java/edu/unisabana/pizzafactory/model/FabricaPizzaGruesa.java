package edu.unisabana.pizzafactory.model;

public class FabricaPizzaGruesa implements FabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new AmasadorPizzaGuesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}