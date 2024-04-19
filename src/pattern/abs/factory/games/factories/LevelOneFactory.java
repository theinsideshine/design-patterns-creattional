package src.pattern.abs.factory.games.factories;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;
import src.pattern.abs.factory.games.objetcslevel.impl.Coin;
import src.pattern.abs.factory.games.obstacules.Brick;
import src.pattern.abs.factory.games.obstacules.Obstacule;
import src.pattern.factory.method.games.factories.EnemigFactory;
import src.pattern.factory.method.games.factories.GombaFactory;

public class LevelOneFactory extends  LevelFactory{
    @Override
    public ObjectLevel createObject() {
        return new Coin();
    }

    @Override
    public Obstacule createObstacule() {
        return new Brick();
    }

    @Override
    public EnemigFactory createEnemig() {
        return new GombaFactory();
    }
}
