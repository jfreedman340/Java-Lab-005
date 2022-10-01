import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {
    Player p1;
    Player p2;
    Dice die;
    public Game (Player p1, Player p2, Dice die) {
        // Defining our variables in the Game constructor
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }


    public void play() {
        Player current = this.p1;
        takeTurn(current);
        nextPlayer(this.p2);
        takeTurn(this.p2);
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
        // Showing the user who the winner and loser is, or if both sides were equal and nobody wins.
        if (p1.getScore() > p2.getScore()) {
            System.out.println(p1.getName() + " Is the winner! His score is " + p1.getScore() + "\n"
                    + p2.getName() + " is the loser and his score is " + p2.getScore());

            return p1.getName();

        } else if (p1.getScore() < p2.getScore()) {
            System.out.println(p2.getName() + " Is the winner! His score is " + p2.getScore() + "\n"
                    + p1.getName() + " is the loser and his score is " + p1.getScore());

            return p2.getName();

        } else {
            // Just in case the user enters a number less than or equal to zero
            System.out.println("Equal scores, no one wins! Both scores are " + p1.getScore());

            return p1.getName() + " and " + p2.getName();
        }

    }

    public static void main(String[] args) {
        //Running the game

        Integer inputValue = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");

        inputValue = scanner.nextInt();

        if (inputValue > 0) {
            Player player1 = new Player("Tesla");
            Player player2 = new Player("Edison");
            Dice dice = new Dice(inputValue);
            Game game = new Game(player1, player2, dice);
            game.play();
            game.announceWinner();
        }
       else {
            System.out.println(inputValue + " is invalid! Please enter integer greater than 0!");
        }
    }
}
