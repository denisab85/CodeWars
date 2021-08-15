package kata_55f8a9c06c018a0d6e000132;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * <p>
 * If the function is passed a valid PIN string, return true, else return false.
 * <p>
 * Examples
 * <p>
 * "1234"   -->  true
 * <p>
 * "12345"  -->  false
 * <p>
 * "a234"   -->  false
 */
public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("((\\d{6})|(\\d{4}))");
    }

}
