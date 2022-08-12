import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    Boolean gameOver = false;

    // Counter for keeping track of user guesses
    static int counter;
    static int incorrect_guesses;
    static String[] letters;
    static String[] letters_copy;

    public static void main(String[] args) {

        String word = GameMode.gameModeMenu();
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("   _____");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("_______|");

        letters = word.split("");
        letters_copy = letters;

        for (int i=0; i < letters.length; i++) {
            //letters[i] = "_ ";
            System.out.print("_ ");

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
            System.out.println(character);
            if (DataValidation.checkForLetter(word, character)) {

                HangmanArt.hangmanArt(counter);
                int index = word.indexOf(character);

                for (int i=0; i < letters.length; i++) {
                    if (letters[i].equals(character)){
                        letters[i] = character;
                        System.out.print(letters[index] + " ");
                    } else {
                        //letters[i] = "_ ";
                        System.out.print("_ ");
                    }


                }
            }
            else {
                incorrect_guesses++;
                counter++;
                HangmanArt.hangmanArt(counter);
                for (int i=0; i < letters.length; i++) {
                    letters[i] = "_ ";
                    System.out.print(letters[i]);

                }
            }

        }
    }
}



