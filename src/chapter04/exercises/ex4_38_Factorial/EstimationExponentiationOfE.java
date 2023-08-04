package chapter04.exercises.ex4_38_Factorial;

import java.util.Scanner;

public class EstimationExponentiationOfE {

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("How many terms do you want to estimates constant 'e^x'"
												+ " with?: ");
				int terms = input.nextInt();

				while (terms < 1) {
						System.out.print("You must enter a positive number of terms: ");
						terms = input.nextInt();
				}

				System.out.print("Enter the value of 'x': ");
				int x = input.nextInt();

				int counter = 0;
				double constantE = 0;

				while (counter < terms) {
						// Formula: e^x = x^0 / 0! + x^1 / 1! + ... + x^n / n!
						constantE += Math.pow(x, counter) / Factorial.getFactorial(counter);
						counter++;
				}

				System.out.printf("The estimation of constant 'e^x' with %d terms is %.10f"
												, terms, constantE);
		}
}
