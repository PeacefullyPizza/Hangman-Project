import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class HangmanGame {
    private static final int count = 0;

    public static final Random RANDOM = new Random();

    // The total amount of tries a user can have before "GAME OVER"
    public static final int failedAttempts = 7;

    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);
        try {
            File level1Words = new File("Level1Words.txt");
            File level2Words = new File("Level2Words.txt");
            File level3Words = new File("Level3Words.txt");
            Scanner level1Reader = new Scanner(level1Words);
            Scanner level2Reader = new Scanner(level2Words);
            Scanner level3Reader = new Scanner(level3Words);
            while (level1Reader.hasNextLine()) {
                String level1Data = level1Reader.nextLine();
                System.out.println(level1Data);
            }
            level1Reader.close();
            while (level2Reader.hasNextLine()) {
                String level2Data = level2Reader.nextLine();
                System.out.println(level2Data);
            }
            level2Reader.close();
            while (level3Reader.hasNextLine()) {
                String level3Data = level3Reader.nextLine();
                System.out.println(level3Data);
            }
            level3Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

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
