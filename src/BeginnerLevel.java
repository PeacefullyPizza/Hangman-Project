import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class BeginnerLevel {
    static String[] words;
    public static String[] beginnerLevel() throws FileNotFoundException {
        String word;

        Random rand = new Random();
            File level1Words = new File("Level1Words.txt");
            Scanner level1Reader = new Scanner(level1Words);
            if (level1Reader.hasNextLine()) {
                String level1Data = level1Reader.nextLine();
                // Selecting random word from Level1Words.txt
                words = level1Data.split("\\s+");
                word = words[rand.nextInt(3)];
            }
        return words;
    }
    }

