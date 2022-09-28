import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {
    Player p1;
    Player p2;
    Dice die;
    public Game (Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    public void play(Player current) {
        current = this.p1;
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return p2;
        }
        else {
            return p1;
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

    public static void main(String[] args) {
    }
}
