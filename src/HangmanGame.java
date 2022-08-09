import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class HangmanGame {
    public static final Random RANDOM = new Random();
    // The total amount of tries a user can have before "GAME OVER"
    public static final int failedAttempts = 7;
    private static final int count = 0;

    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);
        try {

            Scanner level1Reader = new Scanner(new FileInputStream("Level1Words.txt"));
            Scanner level2Reader = new Scanner(new FileInputStream("Level2Words.txt"));
            Scanner level3Reader = new Scanner(new FileInputStream("Level3Words.txt"));

            // Reading words from .txt files
            while (level1Reader.hasNextLine() && level2Reader.hasNextLine() && level3Reader.hasNextLine()) {
                String level1Data = level1Reader.nextLine();
                System.out.println(level1Data);
                String level2Data = level2Reader.nextLine();
                System.out.println(level2Data);
                String level3Data = level3Reader.nextLine();
                System.out.println(level3Data);

            }
//            level1Reader.close();
//            while (level2Reader.hasNextLine()) {
//                String level2Data = level2Reader.nextLine();
//                System.out.println(level2Data);
//            }
//            level2Reader.close();
//            while (level3Reader.hasNextLine()) {
//                String level3Data = level3Reader.nextLine();
//                System.out.println(level3Data);
//            }
            level1Reader.close();
            level2Reader.close();
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
