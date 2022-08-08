import java.util.Scanner;

public class HangmanGame {
    private static int count = 0;


    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);

        while (count < 7)
            System.out.println("Guess a letter in the word!");

        //Nicks test commit
        System.out.println("Hello");
    }

    // method for displaying ASCII ART
    public static void hangmanArt() {
        if (count == 1) {
            System.out.println("Sorry! Wrong guess, please try again!");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
    }
}
