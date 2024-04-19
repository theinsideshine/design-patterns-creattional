package src.pattern.abs.factory.games.objetcslevel.impl;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;

public class Live implements ObjectLevel {
    @Override
    public void name() {
        System.out.println("Soy una vida");
    }
}
