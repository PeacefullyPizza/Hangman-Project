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
                        System.out.print("\nGuessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }

                    }
                    String completeWord = "";
                    for (int i = 0; i < letters_copy2.length; i++) {
                        if (letters_copy2[i] != "_ ") {
                            completeWord += letters_copy2[i];
                        }
                    }
                    if (completeWord.length() == word2.length()) {
                        System.out.println("\n");
                        System.out.println("================");
                        System.out.println("|   *WINNER*   |");
                        System.out.println("================");
                        System.out.println("You win! The word was " + "'"+word2+"'\n");
                        Sounds.winnerSound();
                        System.out.println("Play again?\n Y: to Replay\nN: to EXIT\n");

                        String answer = input.next();

                        if (Objects.equals(answer, "Y")) {
                            IntermediateLevel.intermediateLevel();
                        }else if (Objects.equals(answer, "N")) {
                            writer = new FileWriter(level2Words, false);
                            writer.write("truck juice water");
                            writer.close();
                            complete = true;
                            System.exit(0);
                        }
                    }
                    if (counter == 7) {
                        counter = 0;
                        System.out.println("\n");
                        System.out.println("===================");
                        System.out.println("|   *GAME OVER*   |");
                        System.out.println("===================");
                        Sounds.losingSound();
                        System.out.println("Play again?\n Y: to Replay\nN: to EXIT\n");
                        Scanner i = new Scanner(System.in);
                        String answer = i.next();
                        if (Objects.equals(answer, "Y")) {
                            IntermediateLevel.intermediateLevel();
                        }else if (Objects.equals(answer, "N")) {
                            writer = new FileWriter(level2Words, false);
                            writer.write("truck juice water");
                            writer.close();
                            complete = true;
                            System.exit(0);
                        }
                    }
                }
            }
            writer = new FileWriter(level2Words, false);
            writer.write("truck juice water");
            writer.close();
            System.out.println("All words have been used!\n*RELOADING WORDS*");
            //complete = true;
            counter = 0;
            GameMode.gameModeMenu();
        }
    }
}


