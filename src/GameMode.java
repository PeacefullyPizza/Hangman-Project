import java.io.FileNotFoundException;
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
        System.out.println("     |---------------------LEVELS-----------------------|");
        System.out.println("     |==================================================|");
        System.out.println("     |                   Beginner: 1                    |");
        System.out.println("     |                 Intermediate: 2                  |");
        System.out.println("     |                     Hard: 3                      |");
        System.out.println("     |                     EXIT: -1                     |");
        System.out.println("     |==================================================|");
        System.out.println("Please select a difficulty level:");
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
                System.out.println("     |==================================================|");
                System.out.println("     |----------Hard Level Started! Good Luck!----------|");
                System.out.println("     |==================================================|");
//                System.out.println("\nHard Level Started! Good Luck!\n");
                System.out.println("_____    ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|_______|");
                System.out.println("|_______|");
                HardLevel.hardLevel();
            }
            // Terminates the program
            else if (userSelection == -1) {
                System.exit(0);
            }

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Sorry the file could not be found!");
            e.printStackTrace();

        } catch (InputMismatchException exception) {
            System.err.println("Please enter a digit!");
            exception.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
