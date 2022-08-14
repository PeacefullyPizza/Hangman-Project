import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HardLevel {
   static String[] words3;
   static boolean complete = false;
   static FileWriter writer;
   static int counter;

    public static void hardLevel() throws IOException {
        String word3;
        String[] letters3;
        String[] letters_copy3;
        ArrayList<String> guessed_letters = new ArrayList<String>();

        Random rand = new Random();
        File level3Words = new File("Level3Words.txt");
        Scanner level3Reader = new Scanner(level3Words);
        String level3Data;

        while (!complete) {
        if (level3Reader.hasNextLine()) {
            System.out.println("     |=============================================|");
            System.out.println("     |------------*Hard Level Started*-------------|");
            System.out.println("     |-----------------Good Luck-------------------|");
            System.out.println("     |=============================================|");
//                System.out.println("\nIntermediate Level Started! Good Luck!\n");
            System.out.println("_____    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");

            // getting data from the scanner
            level3Data = level3Reader.nextLine();

            // Selecting random word from Level3Words.txt
            words3 = level3Data.split("\\s+");

            List<String> list3 = new ArrayList<String>(Arrays.asList(words3));

            word3 = words3[rand.nextInt(list3.size())];

            letters3 = word3.split("");
            letters_copy3 = letters3.clone();

            //word3 = words3[rand.nextInt(3)];

            list3.remove(word3);
            words3 = list3.toArray(new String[0]);

            writer = new FileWriter(level3Words, false);
            for (String item : list3) {
                writer.write(item+ " ");
            }
            //writer.write(Arrays.toString(words));

            // Close the file writer.
            writer.close();

            for (int i=0; i < letters3.length; i++) {
                //letters[i] = "_ ";
                System.out.print("_ ");
                letters_copy3[i] = "_ ";
                //letters[i] = "_ ";
            }
            Scanner input = new Scanner(System.in);
            System.out.print("\n");

            System.out.print("Enter your guess: ");
            String character;

            while (input.hasNext()) {


                character = input.next().toLowerCase(Locale.ROOT).substring(0, 1);

                input.nextLine();

                if (DataValidation.checkForLetter(word3, character)) {
                    System.out.println("===================");
                    System.out.println("|    *CORRECT*    |");
                    System.out.println("===================");
                    HangmanArt.hangmanArt(counter);
                    int index = word3.indexOf(character);
                    letters_copy3[index] = character;
                    guessed_letters.add(character);
                    for (int i = 0; i < letters3.length; i++) {

                        if (letters3[i].equalsIgnoreCase(character)) {
                            //letters[i] = character;
                            letters3[i] = character;
                            letters_copy3[i] = character;
                            //System.out.print(letters_copy[i] + " ");
                        } else {
                            //letters[i] = "_ ";
                            //System.out.print("_ ");
                            continue;
                        }
                    }
                    for (int i = 0; i < letters3.length; i++) {
                        System.out.print(letters_copy3[i] + " ");
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

                    for (int i = 0; i < letters3.length; i++) {
                        //letters[i] = "_ ";
                        System.out.print(letters_copy3[i] + " ");
                    }
                    // Printing out the guessed letters to the user.
                    System.out.print("\nGuessed Letters: ");
                    for (int i = 0; i < guessed_letters.size(); i++) {
                        System.out.print(guessed_letters.get(i) + " ");
                    }
                }
                // Adding the correct letters to a separate string until its the same length as the selected word.
                String completeWord = "";
                for (int i = 0; i < letters_copy3.length; i++) {

                    if (letters_copy3[i] != "_ ") {
                        completeWord += letters_copy3[i];
                    }
                }
                // Checking that the completed word is the same length as the selected word.
                if (completeWord.length() == word3.length()) {
                    counter = 0;

                    // Our WINNER message.
                    System.out.println("\n");
                    System.out.println("================");
                    System.out.println("|   *WINNER*   |");
                    System.out.println("================");
                    System.out.println("You win! The word was " + "'"+word3+"'\n");

                    // Our winning sound effect
                    Sounds.winnerSound();
                    System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");

                    String answer = input.next();
                    if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                        HardLevel.hardLevel();
                    }else if (Objects.equals(answer, "N") || Objects.equals(answer, "n")) {
                        writer = new FileWriter(level3Words, false);
                        writer.write("computer controller airplanes artifact saxophone persecution magnificent" +
                                " bachelor luminous heavyweight kilometer bountiful rejected axolotl salmonella" +
                                " vermilion seventeen original rainbow helicopter");
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
                    System.out.println("You win! The word was " + "'"+word3+"'\n");

                    // Losing sound effect (hope you enjoy!)
                    Sounds.losingSound();

                    // Ask the user if they want to play again.
                    System.out.println("Play again?\nY: to Replay\nN: to EXIT\n");
                    Scanner i = new Scanner(System.in);
                    String answer = i.next();

                    // If the user wants to play again, start the level over.
                    if (Objects.equals(answer, "Y") || Objects.equals(answer, "y")) {
                        HardLevel.hardLevel();
                        // If the user doesn't want to play again, rewrite the words to the file, and terminate program.
                    }else if (Objects.equals(answer, "N") || Objects.equals(answer, "n")) {
                        writer = new FileWriter(level3Words, false);
                        writer.write("computer controller airplanes artifact saxophone persecution magnificent" +
                                " bachelor luminous heavyweight kilometer bountiful rejected axolotl salmonella" +
                                " vermilion seventeen original rainbow helicopter");
                        writer.close();
                        complete = true;
                        System.exit(0);
                    }
            }
        }
    }
            // If the user runs out of words to use, write all the words back to the file, reset counter, and send them
            // back to the menu to choose another option.
            writer = new FileWriter(level3Words, false);
            writer.write("computer controller airplanes artifact saxophone persecution magnificent bachelor" +
                    " luminous heavyweight kilometer bountiful rejected axolotl salmonella vermilion" +
                    " seventeen original rainbow helicopter");
            writer.close();
            System.out.println("*INITIALIZATION*\n*RELOADING WORDS*");
            counter = 0;
            //complete = true;
            GameMode.gameModeMenu();
        }
    }
}

