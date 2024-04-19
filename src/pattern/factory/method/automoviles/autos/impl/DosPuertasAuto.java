package src.pattern.factory.method.automoviles.autos.impl;


import src.pattern.factory.method.automoviles.autos.Auto;

// DosPuertasAuto.java
public class DosPuertasAuto implements Auto {
    @Override
    public void ensamblaje() {
        System.out.println("Assembling a two-door car...");
    }
}
