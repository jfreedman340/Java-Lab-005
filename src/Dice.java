import java.util.Random;
import java.util.random.RandomGenerator;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice (int sides) {
        this.sides = sides;
        randomGenerator = new Random(); //instance of random class

    }
    public void roll () {
        this.sideFacingUp = randomGenerator.nextInt(1, sides);
    }

    public int view () {
        return sideFacingUp;
    }
}
