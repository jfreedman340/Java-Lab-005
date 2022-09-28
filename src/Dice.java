import java.util.Random;
import java.util.random.RandomGenerator;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public void roll () {
        RandomGenerator rand = new Random(); //instance of random class
        this.sides = 5;
        //generate random values from 1-6
        this.sideFacingUp = rand.nextInt(sides+1);
    }

    public int view () {
        System.out.println(sideFacingUp);
        return sideFacingUp;
    }
}
