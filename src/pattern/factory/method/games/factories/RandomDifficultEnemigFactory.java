package src.pattern.factory.method.games.factories;

import src.pattern.factory.method.games.enemigs.Enemig;
import src.pattern.factory.method.games.enemigs.impl.Boo;
import src.pattern.factory.method.games.enemigs.impl.Gomba;
import src.pattern.factory.method.games.enemigs.impl.Koopa;
import src.pattern.factory.method.games.enemigs.impl.Xennon;

import java.util.Random;

public class RandomDifficultEnemigFactory extends EnemigFactory {
    @Override
    public Enemig createEnemig() {
        Random random = new Random();
        double randomNumber = random.nextDouble(); // Genera un número aleatorio entre 0 y 1

        if (randomNumber < 0.5) {
            return new Koopa();
        } else {
            return new Xennon();
        }
    }
}

