package src.pattern.factory.method.games.enemigs.impl;

import src.pattern.factory.method.games.enemigs.Enemig;

public class Boo implements Enemig {
    @Override
    public void name() {
        System.out.println("Boo");
    }

    @Override
    public void power() {

        System.out.println("Fuerza: 2");
    }

    @Override
    public void higher() {
        System.out.println("Altura: 3");
    }

    @Override
    public void lives() {
        System.out.println("vidas: 10");
    }

    @Override
    public void speed() {
        System.out.println("velocidad: 10");
    }
}
