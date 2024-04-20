package src.pattern.abs.factory.games.factories;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;
import src.pattern.abs.factory.games.objetcslevel.impl.Coin;
import src.pattern.abs.factory.games.objetcslevel.impl.Live;
import src.pattern.abs.factory.games.obstacules.Brick;
import src.pattern.abs.factory.games.obstacules.Cube;
import src.pattern.abs.factory.games.obstacules.Obstacule;
import src.pattern.factory.method.games.factories.EnemigFactory;
import src.pattern.factory.method.games.factories.GombaFactory;
import src.pattern.factory.method.games.factories.RandomDifficultEnemigFactory;
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

    public EnemigFactory createEnemigFactory() {
        return new GombaFactory();
    }

    @Override
    public EnemigFactory createRandomEnemigFactory() {
        return new RandomEnemigFactory();
    }

    @Override
    public EnemigFactory createRandomDifficultEnemigFactory() {
        return new RandomDifficultEnemigFactory();
    }
}
