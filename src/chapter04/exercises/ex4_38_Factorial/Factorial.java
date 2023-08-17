package chapter04.exercises.ex4_38_Factorial;

import java.util.Scanner;

public class Factorial {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a nonnegative number: ");
				int number = input.nextInt();

				while (number < 0) {
						System.out.print("You must enter a nonnegative number: ");
						number = input.nextInt();
				}

				// If number = 0  or number = 1 then factorial = 1
				double factorial = 1;

				if (number > 1){
						int counter = 1;
						factorial = 1;

						while (counter <= number) {
								factorial *= counter;
								counter++;
						}
				}

				System.out.printf("%d! = %.0f%n", number, factorial);
		}

		public static double getFactorial(int number) {
				if (number == 0 || number == 1) {
						return 1;
				}

				int counter = 1;
				int factorial = 1;

				while (counter <= number) {
						factorial *= counter;
						counter++;
				}

				return factorial;
		}
}
