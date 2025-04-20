package kata.sixthkyu;

public class ValidPhoneNumber6kyu {
    public static void main(String[] args) {
        String validNumber = "(123) 234-1434";
        String invalidNumber = "(123) 234 1434";
        String invalidNumber2 = "(1231)134 1434";
        System.out.println(validPhoneNumber(validNumber)); // should true
        System.out.println(validPhoneNumber(invalidNumber)); // should false
        System.out.println(validPhoneNumber(invalidNumber2)); // should false
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
    }
}
