import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {

    Boolean gameOver = false;

    // Counter for keeping track of user guesses
    static int counter;
    static int incorrect_guesses;
    static String[] letters;
    static String[] letters_copy;
    //static String[] guessed_letters;
    static ArrayList<String> guessed_letters = new ArrayList<String>();

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Sounds.backgroundMusic();
        String word = GameMode.gameModeMenu();
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("_____    ");
        System.out.println("|   |    ");
        System.out.println("|        ");
        System.out.println("|        ");
        System.out.println("|        ");
        System.out.println("|_______|");
        System.out.println("|_______|");

        letters = word.split("");
        letters_copy = letters.clone();

        for (int i=0; i < letters.length; i++) {
            //letters[i] = "_ ";
            System.out.print("_ ");
            letters_copy[i] = "_ ";
            //letters[i] = "_ ";
        }
        System.out.print("\n");

        System.out.print("Enter your guess: ");

        // create Random object
        //Random rand = new Random();
        String character;
        boolean complete = false;
        while (input.hasNext()) {
            character = input.next();

            input.nextLine();
            //guessed_letters[counter] = character;
            //for (int i=0; i < guessed_letters.length; i++) {
            //    System.out.print(i);
            //}

            // Boolean data validation method that is passed a word and the users chosen letter.
            if (DataValidation.checkForLetter(word, character)) {

                HangmanArt.hangmanArt(counter);
                int index = word.indexOf(character);
                letters_copy[index] = character;
                guessed_letters.add(character);
                for (int i=0; i < letters.length; i++) {

                    if (letters[i].equalsIgnoreCase(character)){
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
                for (int i=0; i < letters.length; i++) {
                    System.out.print(letters_copy[i] + " ");
                }
                System.out.print("Guessed Letters: ");
                for (int i=0; i < guessed_letters.size(); i++) {
                    System.out.print(guessed_letters.get(i) + " ");
                }
            }
            else {
                //add letter to ArrayList of guesseed letters
                guessed_letters.add(character);

                counter++; // increment counter

                // getting hangman art based on counter value.
                HangmanArt.hangmanArt(counter);


                for (int i=0; i < letters.length; i++) {
                    //letters[i] = "_ ";
                    System.out.print("_ ");

                }
                System.out.print("Guessed Letters: ");
                for (int i=0; i < guessed_letters.size(); i++) {
                    System.out.print(guessed_letters.get(i) + " ");
                }

            }
            String completeWord = "";
            for (int i=0; i < letters_copy.length; i++) {
                if(letters_copy[i] != "_ ") {
                    completeWord += letters_copy[i];
                }


            }
            if (completeWord.length() == word.length()) {
                Sounds.winnerSound();
                System.out.println("\n--------------");
                System.out.println("WINNER !!!!!!!");
                System.out.println("--------------");
            }


        }
    }
}



