package core.basesyntax;

import java.util.Random;

class Lottery extends ColorSupplier {
    Ball getRandomBall() {
        Random random = new Random();
        int randomIndex = random.nextInt(100);
        Ball ballGenerate = new Ball();
        ballGenerate.setBallColor(getRandomColor());
        ballGenerate.setBallNumber(randomIndex);
        return ballGenerate;
    }
}