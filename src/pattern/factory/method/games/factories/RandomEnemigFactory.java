package src.pattern.factory.method.games.factories;

import src.pattern.factory.method.games.enemigs.Enemig;
import src.pattern.factory.method.games.enemigs.impl.Boo;
import src.pattern.factory.method.games.enemigs.impl.Gomba;
import src.pattern.factory.method.games.enemigs.impl.Koopa;

import java.util.Random;

public class RandomEnemigFactory extends EnemigFactory {
    @Override
    public Enemig createEnemig() {
        Random random = new Random();
        double randomNumber = random.nextDouble(); // Genera un número aleatorio entre 0 y 1

        if (randomNumber < 0.33) {
            return new Gomba();
        } else if (randomNumber < 0.66) {
            return new Boo();
        } else {
            return new Koopa();
        }
    }
}

