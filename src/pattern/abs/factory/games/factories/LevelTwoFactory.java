package src.pattern.abs.factory.games.factories;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;
import src.pattern.abs.factory.games.objetcslevel.impl.Coin;
import src.pattern.abs.factory.games.objetcslevel.impl.Live;
import src.pattern.abs.factory.games.obstacules.Brick;
import src.pattern.abs.factory.games.obstacules.Cube;
import src.pattern.abs.factory.games.obstacules.Obstacule;
import src.pattern.factory.method.games.factories.EnemigFactory;
import src.pattern.factory.method.games.factories.RandomEnemigFactory;

public class LevelTwoFactory extends  LevelFactory{
    @Override
    public ObjectLevel createObject() {
        return new Live();
    }

    @Override
    public Obstacule createObstacule() {
        return new Cube();
    }

    @Override
    public EnemigFactory createEnemig() {
        return new RandomEnemigFactory();
    }
}
