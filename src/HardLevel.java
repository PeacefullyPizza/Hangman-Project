import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HardLevel {
   static String[] words3;
   static boolean complete = false;

    public static void hardLevel() throws FileNotFoundException {
        String word3;
        String[] letters3;
        String[] letters_copy3;
        ArrayList<String> guessed_letters = new ArrayList<String>();

        Random rand = new Random();
        File level3Words = new File("Level3Words.txt");
        Scanner level3Reader = new Scanner(level3Words);
        if (level3Reader.hasNextLine()) {
            String level3Data = level3Reader.nextLine();
            // Selecting random word from Level1Words.txt
            words3 = level3Data.split("\\s+");
            word3 = words3[rand.nextInt(3)];
            letters3 = word3.split("");
            letters_copy3 = letters3.clone();



            word3 = words3[rand.nextInt(3)];
            List<String> list3 = new ArrayList<String>(Arrays.asList(words3));
            list3.remove(word3);
            words3 = list3.toArray(new String[0]);
            System.out.println(Arrays.toString(words3));

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
            int counter = 0;

            while (input.hasNext()) {
                character = input.next();

                input.nextLine();



                if (DataValidation.checkForLetter(word3, character)) {

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


                    for (int i = 0; i < letters3.length; i++) {
                        //letters[i] = "_ ";
                        System.out.print("_ ");

                    }
                    System.out.print("Guessed Letters: ");
                    for (int i = 0; i < guessed_letters.size(); i++) {
                        System.out.print(guessed_letters.get(i) + " ");
                    }

                }
                String completeWord = "";
                for (int i = 0; i < letters_copy3.length; i++) {
                    if (letters_copy3[i] != "_ ") {
                        completeWord += letters_copy3[i];
                    }


                }
                if (completeWord.length() == word3.length()) {
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

