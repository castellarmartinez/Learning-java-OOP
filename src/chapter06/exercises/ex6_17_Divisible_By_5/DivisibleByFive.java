package chapter06.exercises.ex6_17_Divisible_By_5;

import java.util.Scanner;

public class DivisibleByFive {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int testNumber;

				System.out.print("Enter a number and I'll tell you if is " +
												"divisible by 5: ");
				testNumber = input.nextInt();

				System.out.printf("It is %b that %d is divisible by 5.",
												isDivisible(testNumber), testNumber);
		}

		public static boolean isDivisible(int number) {
				int remainder = number % 5;

				return (remainder == 0 ? true : false);
		}
}
