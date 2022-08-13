import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {

    Boolean gameOver = false;
    static Random rand = new Random();

    // Counter for keeping track of user guesses
//    static int counter;
//    static String[] letters;
//    static String[] letters2;
//    static String[] letters3;
//    static String[] letters_copy;
//    static String[] letters_copy2;
//    static String[] letters_copy3;
//    static String word;
//    static String word2;
//    static String word3;
    static boolean complete = false;
    //static String[] guessed_letters;
//    static ArrayList<String> guessed_letters = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException {

        Sounds.backgroundMusic();
        while (!complete) {
            GameMode.gameModeMenu();
//                String[] wordsFULL = BeginnerLevel.beginnerLevel();
//                String[] wordsFULL2 = IntermediateLevel.intermediateLevel();
//                String[] wordsFULL3 = HardLevel.hardLevel();
//
//
//            word = BeginnerLevel.words[rand.nextInt(3)];
//            List<String> list = new ArrayList<String>(Arrays.asList(IntermediateLevel.words2));
//            list.remove(word);
//            BeginnerLevel.words = list.toArray(new String[0]);
//            System.out.println(Arrays.toString(BeginnerLevel.words));
//
//            word2 = IntermediateLevel.words2[rand.nextInt(3)];
//            List<String> list2 = new ArrayList<String>(Arrays.asList(IntermediateLevel.words2));
//            list2.remove(word2);
//            IntermediateLevel.words2 = list2.toArray(new String[0]);
//            System.out.println(Arrays.toString(IntermediateLevel.words2));
//
//        word3 = HardLevel.words3[rand.nextInt(3)];
//        List<String> list3 = new ArrayList<String>(Arrays.asList(HardLevel.words3));
//        list3.remove(word3);
//        HardLevel.words3 = list3.toArray(new String[0]);
//        System.out.println(Arrays.toString(HardLevel.words3));

        // get input from user
//        Scanner input = new Scanner(System.in);


//        letters = word.split("");
//        letters2 = word2.split("");
//        letters3 = word3.split("");
//        letters_copy = letters.clone();
//        letters_copy2 = letters2.clone();
//        letters_copy3 = letters3.clone();

//        for (int i=0; i < letters.length; i++) {
//            //letters[i] = "_ ";
//            System.out.print("_ ");
//            letters_copy[i] = "_ ";
//            //letters[i] = "_ ";
//        }
//            for (int i=0; i < letters2.length; i++) {
//                //letters[i] = "_ ";
//                System.out.print("_ ");
//                letters_copy2[i] = "_ ";
//                //letters[i] = "_ ";
//            }
//            for (int i=0; i < letters3.length; i++) {
//                //letters[i] = "_ ";
//                System.out.print("_ ");
//                letters_copy3[i] = "_ ";
//                //letters[i] = "_ ";
//            }
//        System.out.print("\n");
//
//        System.out.print("Enter your guess: ");

        // create Random object
        //Random rand = new Random();
//        String character;
//
//        while (input.hasNext()) {
//            character = input.next();
//
//            input.nextLine();
            //guessed_letters[counter] = character;
            //for (int i=0; i < guessed_letters.length; i++) {
            //    System.out.print(i);
            //}

            // Boolean data validation method that is passed a word and the users chosen letter.
//            if (DataValidation.checkForLetter(word, character)) {
//
//                HangmanArt.hangmanArt(counter);
//                int index = word.indexOf(character);
//                letters_copy[index] = character;
//                guessed_letters.add(character);
//                for (int i = 0; i < letters.length; i++) {
//
//                    if (letters[i].equalsIgnoreCase(character)) {
//                        //letters[i] = character;
//                        letters[i] = character;
//                        letters_copy[i] = character;
//                        //System.out.print(letters_copy[i] + " ");
//                    } else {
//                        //letters[i] = "_ ";
//                        //System.out.print("_ ");
//                        continue;
//                    }
//
//
//                }
//                for (int i = 0; i < letters.length; i++) {
//                    System.out.print(letters_copy[i] + " ");
//                }
//                System.out.print("Guessed Letters: ");
//                for (int i = 0; i < guessed_letters.size(); i++) {
//                    System.out.print(guessed_letters.get(i) + " ");
//                }
//            } else {
//                //add letter to ArrayList of guesseed letters
//                guessed_letters.add(character);
//
//                counter++; // increment counter
//
//                // getting hangman art based on counter value.
//                HangmanArt.hangmanArt(counter);
//
//
//                for (int i = 0; i < letters.length; i++) {
//                    //letters[i] = "_ ";
//                    System.out.print("_ ");
//
//                }
//                System.out.print("Guessed Letters: ");
//                for (int i = 0; i < guessed_letters.size(); i++) {
//                    System.out.print(guessed_letters.get(i) + " ");
//                }
//
//            }
//            String completeWord = "";
//            for (int i = 0; i < letters_copy.length; i++) {
//                if (letters_copy[i] != "_ ") {
//                    completeWord += letters_copy[i];
//                }
//
//
//            }
//            if (completeWord.length() == word.length()) {
//                System.out.println("\n--------------");
//                System.out.println("WINNER !!!!!!!");
//                Sounds.winnerSound();
//                System.out.println("--------------");
                //System.exit(0);
//                System.out.println("Play again?\n Y for yes, N for no\n");
//                String answer = input.next();
//                if (Objects.equals(answer, "Y")) {
//                    complete = false;
//                }
//                if (Objects.equals(answer, "N")) {
//                    complete = true;
//                }
            }
        }

        }




