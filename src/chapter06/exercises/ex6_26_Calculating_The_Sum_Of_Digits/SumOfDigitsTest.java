package chapter06.exercises.ex6_26_Calculating_The_Sum_Of_Digits;

import java.util.Scanner;

public class SumOfDigitsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number and I'll tell you the sum of its digits: ");
        number = input.nextInt();

        System.out.printf("The sum of its digits is: %d", SumOfDigits.sum(number));
    }
}
