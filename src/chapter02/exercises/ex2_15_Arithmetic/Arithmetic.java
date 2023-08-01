package chapter02.exercises.ex2_15_Arithmetic;

import java.util.Scanner;

public class Arithmetic {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter the first number: ");
				int number1 = input.nextInt();
				System.out.print("Enter the second number: ");
				int number2 = input.nextInt();

				System.out.printf("The square of %d is %d%n", number1,
												number1 * number1);
				System.out.printf("The square of %d is %d%n", number2,
												number2 * number2);
				System.out.printf("The sum of the squares of %d and %d is %d%n",
												number1, number2, number1 * number1 + number2 * number2);
				System.out.printf("The difference of the squares of %d and %d is %d%n",
												number1, number2, number1 * number1 - number2 * number2);
		}
}
