import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class HangmanGame {
    // The total amount of tries a user can have before "GAME OVER"
    private static int maxGuesses = 7;
    Boolean gameOver = false;
    static String word;
    static String[] words;

    public static void main(String[] args) {
        gameModeMenu();
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        Random rand = new Random();
        String character;
        boolean complete = false;
        if (input.hasNext()) {
            character = input.next();
            input.nextLine();
            System.out.println(character);


//            try {
//                // Reading level 1 words from file
//                File level1Words = new File("Level1Words.txt");
//                Scanner level1Reader = new Scanner(level1Words);
//                while (level1Reader.hasNextLine()) {
//                    String level1Data = level1Reader.nextLine();
//                    // Selecting random word from Level1Words.txt
//                    words = level1Data.split("\\s+");
//                    word = words[rand.nextInt(3)];
//                    System.out.println(word);
//                }
//                level1Reader.close();

//                // Reading level 2 words from file
//                File level2Words = new File("Level2Words.txt");
//                Scanner level2Reader = new Scanner(level2Words);
//                while (level2Reader.hasNextLine()) {
//                    String level2Data = level2Reader.nextLine();
//                    // Selecting random word from Level2Words.txt
//                    words = level2Data.split("\\s+");
//                    word = words[rand.nextInt(3)];
//                    System.out.println(word);
//                }
//                level2Reader.close();

//                // Reading level 3 words from file
//                File level3Words = new File("Level3Words.txt");
//                Scanner level3Reader = new Scanner(level3Words);
//                while (level3Reader.hasNextLine()) {
//                    String level3Data = level3Reader.nextLine();
//                    // Selecting random word from Level3Words.txt
//                    words = level3Data.split("\\s+");
//                    word = words[rand.nextInt(3)];
//                    System.out.println(word);
//                }
//                level3Reader.close();

            // Handle
//            } catch (FileNotFoundException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }
            if (DataValidation.checkForLetter(word, character)) {
                System.out.println("   _____");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("_______|");
            }
        }
    }

    // method for displaying ASCII ART
    public static void hangmanArt() {
        if (maxGuesses == 0) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  / \\  |");
            System.out.println("_______|");
        } else if (maxGuesses == 1) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  /    |");
            System.out.println("_______|");
        } else if (maxGuesses == 2) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 3) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 4) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 5) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 6) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 7) {
            System.out.println("   _____");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 8) {
            System.out.println("        ");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 9) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 10) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("_______|");
        } else if (maxGuesses == 11) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("_______ ");
        } else {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
        }
    }

    // get input for level selection
    private static void gameModeMenu() {
        System.out.println("Please select the difficulty level: ");
        int userSelection = 0;
        Random rand = new Random();
        Scanner levelSelection = new Scanner(System.in);
        if(levelSelection.hasNextInt()){
            userSelection = levelSelection.nextInt();
            levelSelection.nextLine();
            System.out.println(userSelection);
        }


        try {
        switch (userSelection) {
            case 1 -> {

                    // Reading level 1 words from file
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
                case 2 -> {
                    // Reading level 2 words from file
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
                case 3 -> {
                    // Reading level 3 words from file
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
            }
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

