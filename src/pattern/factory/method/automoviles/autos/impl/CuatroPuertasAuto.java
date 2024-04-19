package src.pattern.factory.method.automoviles.autos.impl;


import src.pattern.factory.method.automoviles.autos.Auto;

// CuatroPuertasAuto.java
public class CuatroPuertasAuto implements Auto {
    @Override
    public void ensamblaje() {
        System.out.println("Assembling a four-door car...");
    }
}

