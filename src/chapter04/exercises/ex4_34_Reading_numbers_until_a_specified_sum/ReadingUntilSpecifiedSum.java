package chapter04.exercises.ex4_34_Reading_numbers_until_a_specified_sum;

import java.util.Scanner;

public class ReadingUntilSpecifiedSum {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a number: ");

				int initialValue = input.nextInt();
				int sum = 0;

				System.out.print("Now, keep entering values and I'll tell you when" +
												"\nthe sum of those values is equal or greater than the" +
												"\ninitial value entered: ");

				int currentValue = input.nextInt();
				sum += currentValue;

				while (sum < initialValue) {
						System.out.print("Enter another value: ");

						currentValue = input.nextInt();
						sum += currentValue;
				}

				System.out.println("You did the sum.");
		}
}
