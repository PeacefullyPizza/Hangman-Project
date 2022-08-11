public class HangmanArt {
    // The total amount of tries a user can have before "GAME OVER"
    private static int maxGuesses = 7;

    public static void hangmanArt() {
        if (maxGuesses == 0) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  / \\  |");
            System.out.println("_______|");
        } else if (maxGuesses == 1) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  /    |");
            System.out.println("_______|");
        } else if (maxGuesses == 2) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 3) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 4) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 5) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 6) {
            System.out.println("   _____");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 7) {
            System.out.println("   _____");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("_______|");
        } else if (maxGuesses == 8) {
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
        }
    }
}
