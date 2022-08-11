import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    Boolean gameOver = false;

    // Counter for keeping track of user guesses
    static int counter;

    public static void main(String[] args) {

        GameMode.gameModeMenu();
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        // create Random object
        Random rand = new Random();
        String character;
        boolean complete = false;
        while (input.hasNext()) {
            character = input.next();
            input.nextLine();
            System.out.println(character);
            counter++;
            HangmanArt.hangmanArt(counter);
        }
    }
}



