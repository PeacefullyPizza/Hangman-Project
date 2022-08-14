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
            System.out.println("     |==================================================|");
            System.out.println("     |------Hard Level Started! Good Luck!------|");
            System.out.println("     |==================================================|");
//                System.out.println("\nIntermediate Level Started! Good Luck!\n");
            System.out.println("_____    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");

            level3Data = level3Reader.nextLine();
            // Selecting random word from Level1Words.txt
            words3 = level3Data.split("\\s+");

            List<String> list3 = new ArrayList<String>(Arrays.asList(words3));

            word3 = words3[rand.nextInt(list3.size())];

            letters3 = word3.split("");
            letters_copy3 = letters3.clone();



            //word3 = words3[rand.nextInt(3)];

            list3.remove(word3);
            words3 = list3.toArray(new String[0]);
            System.out.println(Arrays.toString(words3));
            System.out.println(list3);

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
                character = input.next().toLowerCase(Locale.ROOT);

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
                        System.out.print(letters_copy3[i] + " ");
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
                    counter = 0;
                    System.out.println("\n--------------");
                    System.out.println("WINNER !!!!!!!");
                    Sounds.winnerSound();
                    System.out.println("--------------");
                    System.out.println("Play again?\n Y for yes, N for no\n");
                    String answer = input.next();
                    if (Objects.equals(answer, "Y")) {

                        HardLevel.hardLevel();
                    }
                    if (Objects.equals(answer, "N")) {
                        writer = new FileWriter(level3Words, false);
                        writer.write("computer controller airplanes");
                        writer.close();
                        complete = true;
                        System.exit(0);
                    }
                }
                if (counter == 7) {
                    counter = 0;
                    System.out.println("GAME OVER");
                    Sounds.losingSound();
                    System.out.println("Play again?\n Y for yes, N for no\n");
                    Scanner i = new Scanner(System.in);

                    String answer = i.next();
                    if (Objects.equals(answer, "Y")) {
                        HardLevel.hardLevel();
                    }
                    if (Objects.equals(answer, "N")) {

                        writer = new FileWriter(level3Words, false);
                        writer.write("computer controller airplanes");
                        writer.close();
                        complete = true;
                        System.exit(0);
                    }


            }
        }
    }
            writer = new FileWriter(level3Words, false);
            writer.write("computer controller airplane");
            writer.close();
            System.out.println("You ran out of words!");
            counter = 0;
            //complete = true;
            GameMode.gameModeMenu();
}}}

