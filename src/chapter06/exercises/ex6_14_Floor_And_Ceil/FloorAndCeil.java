package chapter06.exercises.ex6_14_Floor_And_Ceil;

import java.util.Scanner;

public class FloorAndCeil {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				double x;

				System.out.print("Enter a fractional number: ");
				x = input.nextDouble();

				System.out.printf("The floor rounding of %f is %d%n", x, myFloor(x));
				System.out.printf("The ceil rounding of %f is %d%n%n", x, myCeil(x));
		}

		private static int myFloor(double number) {
				return (int) number;
		}

		private static int myCeil(double number) {
				int rounded = (int) (number);

				if (rounded == number) {
						return rounded;
				}

				return rounded + 1;
		}
}
