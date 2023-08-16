package chapter06.exercises.ex6_9_Rounding_Numbers;

import java.util.Scanner;

public class RoundingNumbers {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a number: ");
				double numberEntered = input.nextDouble();

				System.out.printf("The number entered is %f%n", numberEntered);
				roundToInteger(numberEntered);
		}

		private static void roundToInteger(double number) {
				double roundedNumber = Math.floor(number + 0.5);
				System.out.printf("The nearest integer is %.0f%n", roundedNumber);
		}
}
