package kata_5656b6906de340bd1b0000ac;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 * <p>
 * Examples:
 * <p>
 * a = "xyaabbbccccdefww"
 * <p>
 * b = "xxxxyyyyabklmopq"
 * <p>
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * <p>
 * a = "abcdefghijklmnopqrstuvwxyz"
 * <p>
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {
        SortedSet<String> result = new TreeSet<>();
        result.addAll(Arrays.asList(s1.split("")));
        result.addAll(Arrays.asList(s2.split("")));
        return String.join("", result);
    }

}