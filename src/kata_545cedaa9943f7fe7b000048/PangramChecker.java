package kata_545cedaa9943f7fe7b000048;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * <p>
 * Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class PangramChecker {
    public boolean check(String sentence) {
        boolean result = true;
        boolean[] alphabet = new boolean[26];
        for (byte ch : sentence.toUpperCase().getBytes()) {
            if (ch >= 'A' && ch <= 'Z') {
                alphabet[ch - 'A'] = true;
            }
        }
        for (boolean b : alphabet) {
            result &= b;
        }
        return result;
    }
}