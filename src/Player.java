import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Player {
    private String name;
    private int score;

    public Player (String name) {
        this.name = name;


    }

    public String getName () {
        return name;
    }

    public void toss (Dice d1) {
        d1.roll();
        score = d1.view();
    }

    public int getScore() {
        return score;
    }

}
