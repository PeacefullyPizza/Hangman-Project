import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BeginnerLevel {
    static String[] words;
    static boolean complete = false;
    static int counter;
    public static void beginnerLevel() throws FileNotFoundException {
        while (!complete) {
            String word;
            String[] letters;
            String[] letters_copy;
            ArrayList<String> guessed_letters = new ArrayList<String>();


            Random rand = new Random();
            File level1Words = new File("Level1Words.txt");
            Scanner level1Reader = new Scanner(level1Words);
            if (level1Reader.hasNextLine()) {
                String level1Data = level1Reader.nextLine();
                // Selecting random word from Level1Words.txt
                words = level1Data.split("\\s+");
                word = words[rand.nextInt(3)];
                letters = word.split("");
                letters_copy = letters.clone();

                List<String> list = new ArrayList<String>(Arrays.asList(words));
                list.remove(word);
                words = list.toArray(new String[0]);
                System.out.println(Arrays.toString(words));

                for (int i = 0; i < letters.length; i++) {
                    //letters[i] = "_ ";
                    System.out.print("_ ");
                    letters_copy[i] = "_ ";
                    //letters[i] = "_ ";
                }
                Scanner input = new Scanner(System.in);
                System.out.print("\n");

                System.out.print("Enter your guess: ");
                String character;

                while (input.hasNext()) {
                    character = input.next();

                    input.nextLine();


                    if (DataValidation.checkForLetter(word, character)) {

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
                                //letters[i] = "_ ";
                                //System.out.print("_ ");
                                continue;
                            }


                        }
                        for (int i = 0; i < letters.length; i++) {
                            System.out.print(letters_copy[i] + " ");
                        }
                        System.out.print("Guessed Letters: ");
                        for (int i = 0; i < guessed_letters.size(); i++) {
                            System.out.print(guessed_letters.get(i) + " ");
                        }
                    } else {
                        //add letter to ArrayList of guesseed letters
                        guessed_letters.add(character);

                        counter++; // increment counter

                        // getting hangman art based on counter value.
                        HangmanArt.hangmanArt(counter);


                        for (int i = 0; i < letters.length; i++) {
                        //letters[i] = "_ ";
                        System.out.print("_ ");

                    }
                    System.out.print("Guessed Letters: ");
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
                        System.out.println("\n--------------");
                        System.out.println("WINNER !!!!!!!");
                        Sounds.winnerSound();
                        System.out.println("--------------");
                        System.out.println("Play again?\n Y for yes, N for no\n");
                        String answer = input.next();
                        if (Objects.equals(answer, "Y")) {
                            GameMode.gameModeMenu();
                        }
                        if (Objects.equals(answer, "N")) {
                            complete = true;
                        }
                    }
                }
            }
        }
    }
}

