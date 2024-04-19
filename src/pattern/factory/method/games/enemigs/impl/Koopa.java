package src.pattern.factory.method.games.enemigs.impl;

import src.pattern.factory.method.games.enemigs.Enemig;

public class Koopa implements Enemig {


    @Override
    public void name() {
        System.out.println("Koopa");
    }

    @Override
    public void power() {
        System.out.println("Fuerza: 4");
    }

    @Override
    public void higher() {
        System.out.println("Altura: 8");
    }

    @Override
    public void lives() {
        System.out.println("vidas: 8");
    }

    @Override
    public void speed() {
        System.out.println("velocidad: 2");
    }
}
