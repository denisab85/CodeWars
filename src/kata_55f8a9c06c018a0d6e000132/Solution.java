package kata_55f8a9c06c018a0d6e000132;

public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("((\\d{6})|(\\d{4}))");
    }

}
