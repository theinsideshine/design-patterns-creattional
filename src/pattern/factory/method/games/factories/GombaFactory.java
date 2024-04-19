package src.pattern.factory.method.games.factories;

import src.pattern.factory.method.games.enemigs.Enemig;
import src.pattern.factory.method.games.enemigs.impl.Boo;
import src.pattern.factory.method.games.enemigs.impl.Gomba;

public class GombaFactory extends EnemigFactory {
    @Override
    public Enemig createEnemig() {
        return new Gomba();
    }
}
