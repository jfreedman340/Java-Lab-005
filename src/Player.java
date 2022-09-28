import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Player {
    private String name;
    private int score;

    public Player (String name) {
        this.name = name;
        this.score = 0;


    }

    public void getName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.next();
    }

    public void toss (Dice d1) {
        d1.roll();
        score = d1.view();

    }

    public int getScore() {
        return score;

    }

}
