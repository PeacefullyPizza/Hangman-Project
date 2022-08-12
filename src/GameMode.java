import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameMode {
    static String[] words;
    public static String[] gameModeMenu() {

        System.out.println("██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗");
        System.out.println("██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║");
        System.out.println("███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║");
        System.out.println("██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║");
        System.out.println("██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("     |==================================================|");
        System.out.println("     |---------------------LEVELS-----------------------|");
        System.out.println("     |==================================================|");
        System.out.println("     |         Please select a difficulty level:        |");
        System.out.println("     |                  Beginner: 1                     |");
        System.out.println("     |                Intermediate: 2                   |");
        System.out.println("     |                    Hard: 3                       |");
        System.out.println("     |                    EXIT: -1                      |");
        System.out.println("     |==================================================|");

        String word = null;

        Formatter output;
        Random rand = new Random();
        int userSelection = 0;


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



                    }
                    level1Reader.close();
                }
                // Reading level 2 words from file
                case 2 -> {
                    //output = new Formatter("Level2Words.txt");
                    File level2Words = new File("Level2Words.txt");
                    Scanner level2Reader = new Scanner(level2Words);
                    //StringBuilder sb = new StringBuilder();
                    while (level2Reader.hasNextLine()) {
                        String words2;
                        String level2Data = level2Reader.nextLine();
                        // Selecting random word from Level2Words.txt
                        //StringBuffer sb = new StringBuffer();
                        //sb.append(level2Reader.nextLine());
                        //words2 = sb.toString();
                        words = level2Data.split("\\s+");

                        //words2 = words.replaceAll("{"+word+"}", "");
                        //List<String> list = new ArrayList<String>(Arrays.asList(words));
                        //list.remove(word);
                        //words = list.toArray(new String[0]);

                        System.out.println(Arrays.toString(words));
                        //System.out.println(list);
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
        return words;
    }
}
