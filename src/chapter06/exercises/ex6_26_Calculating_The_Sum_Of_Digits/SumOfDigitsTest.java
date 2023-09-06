package chapter06.exercises.ex6_26_Calculating_The_Sum_Of_Digits;

import java.util.Scanner;

public class SumOfDigitsTest {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int number;

				System.out.print("Enter a number and I'll tell you the sum of its digits: ");
				number = input.nextInt();

				System.out.printf("The sum of its digits is: %d", sum(number));
		}

		public static int sum(int number) {
				int i = 1;
				int sum = 0;

				while (number / i > 0) {
						sum += (number % (10 * i)) / i;
						i *= 10;
				}

				return sum;
		}
}
