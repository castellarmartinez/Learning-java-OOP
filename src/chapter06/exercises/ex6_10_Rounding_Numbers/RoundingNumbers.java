package chapter06.exercises.ex6_10_Rounding_Numbers;

import java.util.Scanner;

public class RoundingNumbers {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				double number;

				System.out.print("Enter a number and I'll round it for you: ");
				number = input.nextDouble();

				System.out.printf("%f rounded to the integer part: %.0f%n", number,
												roundToInteger(number));
				System.out.printf("%f rounded to the tenths: %.1f%n", number,
												roundToTenths(number));
				System.out.printf("%f rounded to the hundredths: %.2f%n", number,
												roundToHundredths(number));
				System.out.printf("%f rounded to the thousandths: %.3f%n", number,
												roundToThousandths(number));
		}

		private static double roundToInteger(double number) {
				return Math.floor(number + 0.5);
		}

		private static double roundToTenths(double number) {
				return Math.floor(number * 10 + 0.5) / 10;
		}

		private static double roundToHundredths(double number) {
				return Math.floor(number * 100 + 0.5) / 100;
		}

		private static double roundToThousandths(double number) {
				return Math.floor(number * 1000 + 0.5) / 1000;
		}
}
