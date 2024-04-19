package src.pattern.abs.factory.games.objetcslevel.impl;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;

public class Coin implements ObjectLevel {
    @Override
    public void name() {
        System.out.println("Soy un moneda");
    }
}
