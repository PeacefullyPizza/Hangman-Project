import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HangmanGame {
    static String word;
    static String[] words;
    Boolean gameOver = false;
    // Counter for keeping track of user guesses
    static int counter;

    public static void main(String[] args) {

        gameModeMenu();
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        // Calling the method for determining the difficulty


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
            /*if (DataValidation.checkForLetter(word, character)) {
                System.out.println("   _____");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("_______|");
            }*/
        }
    }

    // get input for level selection
    private static void gameModeMenu() {
        System.out.println("---------------------LEVELS----------------------");
        System.out.println("Beginner: 1 | Intermediate: 2 | Hard: 3 | EXIT: 4");
        System.out.println("Please select the difficulty level(1,2,3) or 4 to Exit: ");

        int userSelection = 0;
        Random rand = new Random();
        Scanner levelSelection = new Scanner(System.in);
        if (levelSelection.hasNextInt()) {
            userSelection = levelSelection.nextInt();
            levelSelection.nextLine();
            System.out.println(userSelection);
        }

        try {
            switch (userSelection) {
                // Reading level 1 words from file
                case 1 -> {
                    File level1Words = new File("Level1Words.txt");
                    Scanner level1Reader = new Scanner(level1Words);
                    while (level1Reader.hasNextLine()) {
                        String level1Data = level1Reader.nextLine();
                        // Selecting random word from Level1Words.txt
                        words = level1Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        System.out.println(word);
                    }
                    level1Reader.close();
                }
                // Reading level 2 words from file
                case 2 -> {
                    File level2Words = new File("Level2Words.txt");
                    Scanner level2Reader = new Scanner(level2Words);
                    while (level2Reader.hasNextLine()) {
                        String level2Data = level2Reader.nextLine();
                        // Selecting random word from Level2Words.txt
                        words = level2Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        System.out.println(word);
                    }
                    level2Reader.close();
                }
                // Reading level 3 words from file
                case 3 -> {
                    File level3Words = new File("Level3Words.txt");
                    Scanner level3Reader = new Scanner(level3Words);
                    while (level3Reader.hasNextLine()) {
                        String level3Data = level3Reader.nextLine();
                        // Selecting random word from Level3Words.txt
                        words = level3Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        System.out.println(word);
                    }
                    level3Reader.close();
                }
                // Terminates the program
                case 4 -> {
                    System.exit(0);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Sorry the file could not be found!");
            e.printStackTrace();
        }
    }
}

