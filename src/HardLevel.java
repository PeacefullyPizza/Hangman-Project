import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HardLevel {
    static String[] words3;
    public static String[] hardLevel() throws FileNotFoundException {
        String word3;

        Random rand = new Random();
        File level3Words = new File("Level2Words.txt");
        Scanner level3Reader = new Scanner(level3Words);
        if (level3Reader.hasNextLine()) {
            String level3Data = level3Reader.nextLine();
            // Selecting random word from Level1Words.txt
            words3 = level3Data.split("\\s+");
            word3 = words3[rand.nextInt(3)];
        }
        return words3;
    }
}

