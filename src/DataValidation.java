public class DataValidation {
    public static boolean checkForLetter(String word, String letter) {
        String[] tokenized_word = word.split("");
        return word.contains(letter);
    }

}
