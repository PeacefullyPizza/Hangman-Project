import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class IntermediateLevel {
    static String[] words2;
    public static String[] intermediateLevel() throws FileNotFoundException {
        String word2;

        Random rand = new Random();
        File level2Words = new File("Level2Words.txt");
        Scanner level2Reader = new Scanner(level2Words);
        if (level2Reader.hasNextLine()) {
            String level2Data = level2Reader.nextLine();
            // Selecting random word from Level1Words.txt
            words2 = level2Data.split("\\s+");
            word2 = words2[rand.nextInt(3)];
        }
        return words2;
    }
}

