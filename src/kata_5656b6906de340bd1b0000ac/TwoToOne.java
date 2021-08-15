package kata_5656b6906de340bd1b0000ac;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        SortedSet<String> result = new TreeSet<>();
        result.addAll(Arrays.asList(s1.split("")));
        result.addAll(Arrays.asList(s2.split("")));
        return String.join("", result);
    }

}