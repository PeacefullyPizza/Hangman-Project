import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BeginnerLevel {

    // initialization of static variables
    static String[] words;
    static boolean complete = false;
    static int counter;
    static FileWriter writer;

    // Beginner Level
    public static void beginnerLevel() throws IOException {

        String word;
        String[] letters;
        String[] letters_copy;
        ArrayList<String> guessed_letters = new ArrayList<>();  // Array List for guessed letter.
        Random rand = new Random();
        File level1Words = new File("Level1Words.txt");
        Scanner level1Reader = new Scanner(level1Words);
        String level1Data;

        while (!complete) {
            if (level1Reader.hasNextLine()) {
                //Beginner Level banner
                System.out.println("     |============================================|");
                System.out.println("     |----------*Beginner Level Started*----------|");
                System.out.println("     |------------------Good Luck-----------------|");
                System.out.println("     |============================================|");
                // First empty Hangman art.
                System.out.println("_____    ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|_______|");
                System.out.println("|_______|");
                System.out.println("Word length:");

                // getting data from the scanner
                level1Data = level1Reader.nextLine();

                // I don't believe this is needed but unsure at the moment.
                // Was also thinking the same thing -do
                if (level1Data == "") {
                    level1Data = "dog eye cat";
                }

                // Selecting random word from Level1Words.txt
                words = level1Data.split("\\s+");

                //Storing the words in an array list
                List<String> list = new ArrayList<>(Arrays.asList(words));

                // Once the words are in the list, THEN get the word randomly. Random number is based on size of list.
                word = list.get(rand.nextInt(list.size()));

                // Split the word into list of specific letters
                letters = word.split("");
                letters_copy = letters.clone();

                //Remove the word from the list
                list.remove(word);
                words = list.toArray(new String[0]);

                // Two print statements for testing purposes that should be commented out for final version.
                System.out.println(Arrays.toString(words));
                System.out.println(list);

                // Writing the modified list back to the text file
                writer = new FileWriter(level1Words, false);
                for (String item : list) {
                    writer.write(item + " ");
                }

                // Close the file writer.
                writer.close();

                //print out the randomly chosen word in blank spaces for the user
                for (int i = 0; i < letters.length; i++) {

                    System.out.print("_ ");
                    letters_copy[i] = "_ ";
                }

                // Creating scanner
                Scanner input = new Scanner(System.in);
                System.out.print("\nEnter your guess: ");
                String character;

                // Execute the rest of program is there is a letter entered.
                while (input.hasNext()) {

                    // Storing the user's input in a variable, making lowercase, and making sure any words
                    // that may have been entered are now only the first letter in that word.
                    character = input.next().toLowerCase(Locale.ROOT).substring(0, 1);

                    input.nextLine();

                    // If the users input is in the word, execute code below.
                    if (DataValidation.checkForLetter(word, character)) {
                        System.out.println("===================");
                        System.out.println("|    *CORRECT*    |");
                        System.out.println("===================");
                        HangmanArt.hangmanArt(counter);
                        int index = word.indexOf(character);
                        letters_copy[index] = character;
                        guessed_letters.add(character);
                        for (int i = 0; i < letters.length; i++) {

                            if (letters[i].equalsIgnoreCase(character)) {
                                //letters[i] = character;
                                letters[i] = character;
                                letters_copy[i] = character;
                                //System.out.print(letters_copy[i] + " ");
                            } else {
                                letters[i] = "_ ";
                                //System.out.print("_ ");
                                continue;
                            }

                        }
                        for (int i = 0; i < letters.length; i++) {
                            System.out.print(letters_copy[i] + " ");
                        }
                        System.out.print("\nGuessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }
                    } else {
                        //add letter to ArrayList of guessed letters
                        guessed_letters.add(character);

                        counter++; // increment counter

                        // getting hangman art based on counter value.
                        HangmanArt.hangmanArt(counter);

                        for (int i = 0; i < letters.length; i++) {
                            //letters[i] = "_ ";
                            System.out.print(letters_copy[i] + " ");

                        }
                        System.out.print("\nGuessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }
                    }
                    String completeWord = "";
                    for (int i = 0; i < letters_copy.length; i++) {
                        if (letters_copy[i] != "_ ") {
                            completeWord += letters_copy[i];
                        }
                    }

                    if (completeWord.length() == word.length()) {
                        counter = 0;
                        System.out.println("\n");
                        System.out.println("================");
                        System.out.println("|   *WINNER*   |");
                        System.out.println("================");
                        System.out.println("You win! The word was " + "'"+word+"'\n");
                        Sounds.winnerSound();
                        System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");

                        String answer = input.next();
                        if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                            BeginnerLevel.beginnerLevel();
                        } else if (Objects.equals(answer, "N") || Objects.equals(answer, "n")) {
                            writer = new FileWriter(level1Words, false);
                            writer.write("dog eye cat plum box cake rope hill pen flow bear tray knee dig bike " +
                                    "red blue zoom tap");
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
                        System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");
                        Scanner i = new Scanner(System.in);

                        String answer = i.next();
                        if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                            BeginnerLevel.beginnerLevel();
                        }else if (Objects.equals(answer, "N") || Objects.equals(answer, "n")) {
                            writer = new FileWriter(level1Words, false);
                            writer.write("dog eye cat plum box cake rope hill pen flow bear tray knee dig" +
                                    " bike red blue zoom tap");
                            writer.close();
                            complete = true;
                            System.exit(0);
                        }
                    }
                }
            }
            writer = new FileWriter(level1Words, false);
            writer.write("dog eye cat plum box cake rope hill pen flow bear tray knee dig\" +\n" +
                    "                                    \" bike red blue zoom tap");
            writer.close();
            System.out.println("All words have been used!\n*RELOADING WORDS*");
            //complete = true;
            //System.exit(0);
            counter = 0;
            GameMode.gameModeMenu();
        }
    }
}

