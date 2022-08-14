import java.util.Objects;
import java.util.Scanner;

public class HangmanArt {
    static boolean complete = false;

    // passing the number of guesses to the hangmanArt method
    public static void hangmanArt(int guesses) {
        // The total amount of tries a user can have before "GAME OVER"
        int maxGuesses = 7;
        if (guesses == maxGuesses) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  / \\  ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\n----------");


        } else if (guesses == 6) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  /     ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nCareful! \nYou have 1 guess remaining!");


        } else if (guesses == 5) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nYou have 2 guesses remaining!");


        } else if (guesses == 4) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nYou have 3 guesses remaining!");


        } else if (guesses == 3) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nYou have 4 guesses remaining!");


        } else if (guesses == 2) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nYou have 5 guesses remaining!");


        } else if (guesses == 1) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\nYou have 6 guesses remaining!");
        }
        else if (guesses == 0) {
            System.out.println("_____    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        }
    }
}