package kata_54bf1c2cd5b56cc47f0007a1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Count the number of Duplicates
 * <p>
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * <p>
 * Example
 * <p>
 * "abcde" -> 0 # no characters repeats more than once
 * <p>
 * "aabbcde" -> 2 # 'a' and 'b'
 * <p>
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * <p>
 * "indivisibility" -> 1 # 'i' occurs six times
 * <p>
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * <p>
 * "aA11" -> 2 # 'a' and '1'
 * <p>
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Map<String, Long> counted = Arrays.stream(text.toLowerCase().split("")).sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return Math.toIntExact(counted.values().stream().filter(v -> v > 1).count());
    }

}