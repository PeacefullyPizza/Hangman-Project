import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GameMode {
    public static String gameModeMenu() {


        System.out.println("██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗");
        System.out.println("██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║");
        System.out.println("███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║");
        System.out.println("██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║");
        System.out.println("██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("     |==================================================|");
        System.out.println("     |---------------------LEVELS-----------------------|");
        System.out.println("     |==================================================|");
        System.out.println("     |         Please select a difficulty level         |");
        System.out.println("     |                  Beginner: 1                     |");
        System.out.println("     |                Intermediate: 2                   |");
        System.out.println("     |                    Hard: 3                       |");
        System.out.println("     |                    EXIT: -1                      |");
        System.out.println("     |==================================================|");

        String word = null;
        String[] words;


        int userSelection = 0;
        Random rand = new Random();
        Scanner levelSelection = new Scanner(System.in);
        if (levelSelection.hasNextInt()) {
            userSelection = levelSelection.nextInt();
            levelSelection.nextLine();
            System.out.println(userSelection);
        }

        try {
            switch (userSelection) {
                // Reading level 1 words from file
                case 1 -> {
                    File level1Words = new File("Level1Words.txt");
                    Scanner level1Reader = new Scanner(level1Words);
                    while (level1Reader.hasNextLine()) {
                        String level1Data = level1Reader.nextLine();
                        // Selecting random word from Level1Words.txt
                        words = level1Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        /*letters = word.split("");
                        for (int i=0; i < letters.length; i++) {
                            letters[i] = "_ ";
                            System.out.print(letters[i]);

                        }
                        System.out.print("\n");*/

                    }
                    level1Reader.close();
                }
                // Reading level 2 words from file
                case 2 -> {
                    File level2Words = new File("Level2Words.txt");
                    Scanner level2Reader = new Scanner(level2Words);
                    while (level2Reader.hasNextLine()) {
                        String level2Data = level2Reader.nextLine();
                        // Selecting random word from Level2Words.txt
                        words = level2Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        System.out.println(word);
                    }
                    level2Reader.close();
                }
                // Reading level 3 words from file
                case 3 -> {
                    File level3Words = new File("Level3Words.txt");
                    Scanner level3Reader = new Scanner(level3Words);
                    while (level3Reader.hasNextLine()) {
                        String level3Data = level3Reader.nextLine();
                        // Selecting random word from Level3Words.txt
                        words = level3Data.split("\\s+");
                        word = words[rand.nextInt(3)];
                        System.out.println(word);
                    }
                    level3Reader.close();
                }
                // Terminates the program
                case 4 -> {
                    System.exit(0);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Sorry the file could not be found!");
            e.printStackTrace();
        }
        return word;
    }
}
