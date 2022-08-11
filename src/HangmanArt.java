public class HangmanArt {
    // The total amount of tries a user can have before "GAME OVER"
    private static int maxGuesses = 7;

    // passing the number of guesses to the hangmanArt method
    public static void hangmanArt(int guessess) {
        if (guessess == maxGuesses) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  / \\  |");
            System.out.println("_______|");
        } else if (guessess == 6) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  /    |");
            System.out.println("_______|");
        } else if (guessess == 5) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (guessess == 4) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (guessess == 3) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (guessess == 2) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (guessess == 1) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (guessess == 0) {
            System.out.println("   _____");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        }/* else if (maxGuesses == 8) {
            System.out.println("        ");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 9) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 10) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("_______|");
        } else if (maxGuesses == 11) {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("_______ ");
        } else {
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("        ");
        }*/
    }
}
