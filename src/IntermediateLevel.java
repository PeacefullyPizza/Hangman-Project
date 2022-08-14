import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class IntermediateLevel {
    static boolean complete = false;
    static String[] words2;
    static int counter;
    static FileWriter writer;
    static String[] words_copy;


    public static void intermediateLevel() throws IOException {

        String word2;
        String[] letters2;
        String[] letters_copy2;
        ArrayList<String> guessed_letters = new ArrayList<String>();

        Random rand = new Random();
        File level2Words = new File("Level2Words.txt");
        Scanner level2Reader = new Scanner(level2Words);
        String level2Data;
        while (!complete) {
            if (level2Reader.hasNextLine()) {
                System.out.println("     |================================================|");
                System.out.println("     |----------*Intermediate Level Started*----------|");
                System.out.println("     |-------------------Good Luck--------------------|");
                System.out.println("     |================================================|");
                System.out.println("_____    ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|_______|");
                System.out.println("|_______|");
                level2Data = level2Reader.nextLine();

                // Selecting random word from Level1Words.txt
                words2 = level2Data.split("\\s+");

                List<String> list2 = new ArrayList<String>(Arrays.asList(words2));

                word2 = words2[rand.nextInt(list2.size())];
                words_copy = words2;

                letters2 = word2.split("");
                letters_copy2 = letters2.clone();

                list2.remove(word2);
                words2 = list2.toArray(new String[0]);
                // print statements for testing purposes that should be commented out for final version.
                System.out.println(Arrays.toString(words2));

                writer = new FileWriter(level2Words, false);
                for (String item : list2) {
                    writer.write(item+ " ");
                }
                writer.close();

                for (int i = 0; i < letters2.length; i++) {
                    //letters[i] = "_ ";
                    System.out.print("_ ");
                    letters_copy2[i] = "_ ";
                    //letters[i] = "_ ";
                }
                Scanner input = new Scanner(System.in);
                System.out.print("\n");

                System.out.print("Enter your guess: ");
                String character;

                while (input.hasNext()) {

                    character = input.next().toLowerCase(Locale.ROOT).substring(0, 1);

                    input.nextLine();

                    if (DataValidation.checkForLetter(word2, character)) {
                        System.out.println("===================");
                        System.out.println("|    *CORRECT*    |");
                        System.out.println("===================");
                        HangmanArt.hangmanArt(counter);
                        int index = word2.indexOf(character);
                        letters_copy2[index] = character;
                        guessed_letters.add(character);
                        for (int i = 0; i < letters2.length; i++) {

                            if (letters2[i].equalsIgnoreCase(character)) {
                                //letters[i] = character;
                                letters2[i] = character;
                                letters_copy2[i] = character;
                                //System.out.print(letters_copy[i] + " ");
                            } else {
                                letters2[i] = "_ ";
                                //System.out.print("_ ");
                                continue;
                            }
                        }
                        for (int i = 0; i < letters2.length; i++) {
                            System.out.print(letters_copy2[i] + " ");
                        }
                        System.out.print("\nGuessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }
                    } else {
                        //add letter to ArrayList of guesseed letters
                        guessed_letters.add(character);

                        counter++; // increment counter

                        // getting hangman art based on counter value.
                        HangmanArt.hangmanArt(counter);

                        for (int i = 0; i < letters2.length; i++) {
                            //letters[i] = "_ ";
                            System.out.print(letters_copy2[i] + " ");
                        }
                        // Printing out the guessed letters to the user.
                        System.out.print("\nGuessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }
                    }
                    // Adding the correct letters to a separate string until its the same length as the selected word.
                    String completeWord = "";
                    for (int i = 0; i < letters_copy2.length; i++) {
                        if (letters_copy2[i] != "_ ") {
                            completeWord += letters_copy2[i];
                        }
                    }
                    // Checking that the completed word is the same length as the selected word.
                    if (completeWord.length() == word2.length()) {
                        counter = 0;

                        // Our WINNER message.
                        System.out.println("\n");
                        System.out.println("================");
                        System.out.println("|   *WINNER*   |");
                        System.out.println("================");
                        System.out.println("You win! The word was " + "'"+word2+"'\n");

                        // Our winning sound effect
                        Sounds.winnerSound();
                        System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");

                        String answer = input.next();
                        if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                            IntermediateLevel.intermediateLevel();
                        }else if (Objects.equals(answer, "N") || (Objects.equals(answer, "n"))) {
                            writer = new FileWriter(level2Words, false);
                            writer.write("truck juice water yellow fuzzy zombie jumbo across coffee global number" +
                                    " permit remote unique wonder click friend level radio steel");
                            writer.close();
                            complete = true;
                            System.exit(0);
                        }
                    }
                    // If the counter reaches MAX GUESSES then print game over message and ask for user input.
                    if (counter == 7) {
                        // Setting the counter back to zero so you get the correct ASCII art starting over.
                        counter = 0;
                        // Our GAME OVER message
                        System.out.println("\n");
                        System.out.println("===================");
                        System.out.println("|   *GAME OVER*   |");
                        System.out.println("===================");

                        // Losing sound effect (hope you enjoy!)
                        Sounds.losingSound();

                        // Ask the user if they want to play again.
                        System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");
                        Scanner i = new Scanner(System.in);
                        String answer = i.next();

                        // If the user wants to play again, start the level over.
                        if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                            IntermediateLevel.intermediateLevel();

                            // If the user doesn't want to play again, rewrite the words to the file, and terminate program.
                        }else if (Objects.equals(answer, "N") || Objects.equals(answer, "n")) {
                            writer = new FileWriter(level2Words, false);
                            writer.write("truck juice water yellow fuzzy zombie jumbo across coffee global " +
                                    "number permit remote unique wonder click friend level radio steel");
                            writer.close();
                            complete = true;
                            System.exit(0);
                        }
                    }
                }
            }
            // If the user runs out of words to use, write all the words back to the file, reset counter, and send them
            // back to the menu to choose another option.
            writer = new FileWriter(level2Words, false);
            writer.write("truck juice water yellow fuzzy zombie jumbo across coffee global number permit remote " +
                    "unique wonder click friend level radio steel");
            writer.close();
            System.out.println("*INITIALIZATION*\n*RELOADING WORDS*");
            //complete = true;
            counter = 0;
            GameMode.gameModeMenu();
        }
    }
}


