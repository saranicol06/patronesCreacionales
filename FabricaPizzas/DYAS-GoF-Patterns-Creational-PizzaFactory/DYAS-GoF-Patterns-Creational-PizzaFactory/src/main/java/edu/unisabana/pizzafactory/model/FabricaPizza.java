package edu.unisabana.pizzafactory.model;

public interface FabricaPizza {
    amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}
