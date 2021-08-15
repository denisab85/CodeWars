package kata_57cebe1dc6fdc20c57000ac9;

import java.util.Arrays;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */
public class Kata {

    public static int findShort(String s) {
        return Arrays.stream(s.split("\\s+")).map(String::length).sorted().findFirst().orElse(0);
    }

}