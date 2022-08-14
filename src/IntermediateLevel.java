import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IntermediateLevel {
    static boolean complete = false;
    static String[] words2;


    public static void intermediateLevel() throws FileNotFoundException {
        String word2;
        String[] letters2;
        String[] letters_copy2;
        ArrayList<String> guessed_letters = new ArrayList<String>();

        Random rand = new Random();
        File level2Words = new File("Level2Words.txt");
        Scanner level2Reader = new Scanner(level2Words);
        if (level2Reader.hasNextLine()) {
            String level2Data = level2Reader.nextLine();
            // Selecting random word from Level1Words.txt
            words2 = level2Data.split("\\s+");
            word2 = words2[rand.nextInt(3)];
            letters2 = word2.split("");
            letters_copy2 = letters2.clone();


            List<String> list2 = new ArrayList<String>(Arrays.asList(words2));
            list2.remove(word2);
            words2 = list2.toArray(new String[0]);
            System.out.println(Arrays.toString(words2));

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
            int counter = 0;

            while (input.hasNext()) {
                character = input.next();

                input.nextLine();



                if (DataValidation.checkForLetter(word2, character)) {

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
                            //letters[i] = "_ ";
                            //System.out.print("_ ");
                            continue;
                        }


                    }
                    for (int i = 0; i < letters2.length; i++) {
                        System.out.print(letters_copy2[i] + " ");
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


                    for (int i = 0; i < letters2.length; i++) {
                        //letters[i] = "_ ";
                        System.out.print("_ ");

                    }
                    System.out.print("Guessed Letters: ");
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


