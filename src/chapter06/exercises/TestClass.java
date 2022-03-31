package chapter06.exercises;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringNumber;
        int number;
        int digits;

        System.out.print("Enter a number and I'll tell you if it is a palindrome: ");
        stringNumber = input.next();
        number = Integer.parseInt(stringNumber);
        digits = stringNumber.length();

        System.out.printf("It is %s that the entered number is a palindrome.%n",
                PalindromeNumbers.isPalindrome(number, digits));

        System.out.print("Enter a temperature in celsius degrees: ");
        int temperature = input.nextInt();
        sportsRecommender(temperature);
    }

    public static void sportsRecommender(int celsiusTemp) {
        if (celsiusTemp >= 20 && celsiusTemp <= 30) {
            System.out.println("It’s lovely weather for sports today!");
        }
        else if (celsiusTemp >= 10 && celsiusTemp <= 40) {
            System.out.println("It’s reasonable weather for sports today.");
        }
        else {
            System.out.println("Please exercise with care today, watch out " +
                    "for the weather!");
        }
    }
}
