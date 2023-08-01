package chapter02.exercises.ex2_16_Comparing_Integers;

import java.util.Scanner;

public class ComparingIntegers {

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter one integer and I tell you whether the number " +
												"and its square are greater than, equal to, not equal\n" +
												"to, or less than the number 100.");
				System.out.print("Enter the integer: ");

				int integer = input.nextInt();
				int square = integer * integer;

				if (integer > 100) {
						System.out.println("The number " + integer + " is greater than 100.");
				}

				if (integer < 100) {
						System.out.println("The number " + integer + " is less than 100.");
				}

				if (integer == 100) {
						System.out.println("The number " + integer + " is equal to 100.");
				}

				if (integer != 100) {
						System.out.println("The number " + integer + " is not equal to 100.");
				}

				if (square > 100) {
						System.out.println("The square of " + integer + " is greater than 100.");
				}

				if (square < 100) {
						System.out.println("The square of " + integer + " is less than 100.");
				}

				if (square == 100) {
						System.out.println("The square of " + integer + " is equal to 100.");
				}

				if (square != 100) {
						System.out.println("The square of " + integer + " is not equal to 100.");
				}
		}

}
