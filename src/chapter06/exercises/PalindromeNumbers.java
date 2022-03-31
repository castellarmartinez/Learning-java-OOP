package chapter06.exercises;

public class PalindromeNumbers {
    public static boolean isPalindrome(int number, int digits) {
        boolean isAPalindromeNumber = true;

        for (int i = 0; i < digits / 2; i++) {

            int left = (int) (number % Math.pow(10, digits - i)) /
                    (int) Math.pow(10, digits - i - 1);

            int right = (int) (number % Math.pow(10, i + 1)) /
                    (int) Math.pow(10, i);

            if (left != right) {
                i = digits;
                isAPalindromeNumber = !isAPalindromeNumber;
            }
        }

        return isAPalindromeNumber;
    }
}
