package src.pattern.abs.factory.games.factories;

import src.pattern.abs.factory.games.objetcslevel.ObjectLevel;
import src.pattern.abs.factory.games.obstacules.Obstacule;
import src.pattern.factory.method.games.enemigs.Enemig;
import src.pattern.factory.method.games.factories.EnemigFactory;

public abstract class LevelFactory {
    public abstract ObjectLevel createObject();
    public abstract Obstacule createObstacule();
    public abstract EnemigFactory createEnemig();

}
