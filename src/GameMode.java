import java.io.IOException;
import java.util.*;

public class GameMode {
    public static void gameModeMenu() throws InputMismatchException{

        System.out.println("██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗");
        System.out.println("██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║");
        System.out.println("███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║");
        System.out.println("██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║");
        System.out.println("██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("     |==================================================|");
        System.out.println("     |----------------------LEVELS----------------------|");
        System.out.println("     |==================================================|");
        System.out.println("     |                    *OPTIONS*                     |");
        System.out.println("     |                    Beginner: 1                   |");
        System.out.println("     |                  Intermediate: 2                 |");
        System.out.println("     |                      Hard: 3                     |");
        System.out.println("     |                  Information: 4                  |");
        System.out.println("     |                      EXIT: -1                    |");
        System.out.println("     |==================================================|");

// Determine the level the user selects
        Scanner levelSelection = new Scanner(System.in);
        int userSelection = 0;
        if (levelSelection.hasNextInt()) {
            userSelection = levelSelection.nextInt();
            levelSelection.nextLine();
        }
        try {
            // Reading level 1 words from file
            if (userSelection == 1) {
                BeginnerLevel.beginnerLevel();
            }
            // Reading level 2 words from file
            else if (userSelection == 2) {
                IntermediateLevel.intermediateLevel();
            }
            // Reading level 3 words from file
            else if (userSelection == 3) {
                HardLevel.hardLevel();
            }
            // Information Page
            else if (userSelection == 4) {
                GameInformation.gameInformation();
            }
            // Terminates the program
            else if (userSelection == -1) {
                System.exit(0);
            }
        } catch (IOException ioException) {
            System.err.println("ERROR");
            ioException.printStackTrace();
        }
    }
}
