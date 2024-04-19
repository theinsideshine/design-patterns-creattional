package src.pattern.factory.method.games.enemigs.impl;

import src.pattern.factory.method.games.enemigs.Enemig;

public class Gomba implements Enemig {


    @Override
    public void name() { System.out.println("Gomba");
    }
    @Override
    public void power() {
        System.out.println("Fuerza: 6");
    }

    @Override
    public void higher() {
        System.out.println("Altura: 7");

    }

    @Override
    public void lives() {
        System.out.println("vidas: 6");
    }

    @Override
    public void speed() {
        System.out.println("velocidad: 5");
    }
}
