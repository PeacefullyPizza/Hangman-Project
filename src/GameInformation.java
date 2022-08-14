import java.util.InputMismatchException;
import java.util.Scanner;

public class GameInformation {

    public static void gameInformation() {
        System.out.println("██╗███╗   ██╗███████╗ ██████╗ ██████╗ ███╗   ███╗ █████╗ ████████╗██╗ ██████╗ ███╗   ██╗");
        System.out.println("██║████╗  ██║██╔════╝██╔═══██╗██╔══██╗████╗ ████║██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║");
        System.out.println("██║██╔██╗ ██║█████╗  ██║   ██║██████╔╝██╔████╔██║███████║   ██║   ██║██║   ██║██╔██╗ ██║");
        System.out.println("██║██║╚██╗██║██╔══╝  ██║   ██║██╔══██╗██║╚██╔╝██║██╔══██║   ██║   ██║██║   ██║██║╚██╗██║");
        System.out.println("██║██║ ╚████║██║     ╚██████╔╝██║  ██║██║ ╚═╝ ██║██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║");
        System.out.println("╚═╝╚═╝  ╚═══╝╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝");
        System.out.println("|=================================================================================|");
        System.out.println("|                                  *GAME INSTRUCTIONS*                            |");
        System.out.println("|                          You have a total of 7 Incorrect Guesses                |");
        System.out.println("|                      When 7 Incorrect Guesses are reach it's GAME OVER          |");
        System.out.println("|                                                                                 |");
        System.out.println("| Creators: Nicholas O'Quinn                                                      |");
        System.out.println("|           Dylan Owens                                                           |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                      *OPTIONS*                                  |");
        System.out.println("|                                   1: to Main Menu                               |");
        System.out.println("|                                    -1: to EXIT                                  |");
        System.out.println("|=================================================================================|");


        Scanner levelSelection = new Scanner(System.in);
        int userSelection = 0;
        if (levelSelection.hasNextInt()) {
            userSelection = levelSelection.nextInt();
            levelSelection.nextLine();
        }


        try {
            // Reading level 1 words from file
            if (userSelection == 1) {

                GameMode.gameModeMenu();
            }
            // Reading level 2 words from file
            else if (userSelection == -1) {

                System.exit(0);
            }
        } catch (InputMismatchException inputMismatchException) {
            inputMismatchException.printStackTrace();
        }

    }
}
