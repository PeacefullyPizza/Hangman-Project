import java.util.Objects;
import java.util.Scanner;

public class HangmanArt {
    static boolean complete = false;

    // passing the number of guesses to the hangmanArt method
    public static void hangmanArt(int guesses) {
        // The total amount of tries a user can have before "GAME OVER"
        int maxGuesses = 7;
        if (guesses == maxGuesses) {
//            System.out.println("\nSORRY!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  / \\  ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("\n----------");


        } else if (guesses == 6) {
//            System.out.println("\nSorry! Wrong guess!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  /     ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|             *CAREFUL*             |");
            System.out.println("|   You have 1 guesses remaining!   |");
            System.out.println("=====================================");
            System.out.println("Word length:");



        } else if (guesses == 5) {
//            System.out.println("\nSorry! Wrong guess!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|   You have 2 guesses remaining!   |");
            System.out.println("=====================================");
            System.out.println("Word length:");



        } else if (guesses == 4) {
//            System.out.println("\nSorry! Wrong guess!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|   You have 3 guesses remaining!   |");
            System.out.println("=====================================");
            System.out.println("Word length:");



        } else if (guesses == 3) {
//            System.out.println("\nSorry! Wrong guess!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|    You have 4 guesses remaining!   |");
            System.out.println("=====================================");
            System.out.println("Word length:");



        } else if (guesses == 2) {
//            System.out.println("\nSorry! Wrong guess!");
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|   You have 5 guesses remaining!   |");
            System.out.println("=====================================");
            System.out.println("Word length:");



        } else if (guesses == 1) {
//            System.out.println("\nSorry! Wrong guess!");

            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
            System.out.println("=====================================");
            System.out.println("|   You have 6 guesses remaining!   |");
            System.out.println("=====================================");

            System.out.println("Word length:");

        }
        else if (guesses == 0) {
            System.out.println("_____    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");

            System.out.println("Word length:");

        }
    }
}