public class HangmanArt {
    // The total amount of tries a user can have before "GAME OVER"
    private static int maxGuesses = 7;

    // passing the number of guesses to the hangmanArt method
    public static void hangmanArt(int guesses) {
        if (guesses == maxGuesses) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  / \\  ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 6) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|  /     ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 5) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|\\  ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 4) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|  /|    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 3) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 2) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 1) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|   O    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        } else if (guesses == 0) {
            System.out.println("_____    ");
            System.out.println("|   |    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|_______|");
            System.out.println("|_______|");
        }
    }
}