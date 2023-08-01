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

				int counter = number;
				double factorial = 1;

				while (counter > 0) {
						factorial *= counter;
						counter--;
				}

				System.out.printf("%d! = %f%n", number, factorial);
		}
}
