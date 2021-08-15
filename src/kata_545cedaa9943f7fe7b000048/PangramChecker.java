package kata_545cedaa9943f7fe7b000048;

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