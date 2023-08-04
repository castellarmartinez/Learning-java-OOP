package chapter04.exercises.ex4_38_Factorial;

import java.util.Scanner;

public class EstimationOfConstantE {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("How many terms do you want to estimates constant 'e'"
												+ " with?: ");
				int terms = input.nextInt();

				while (terms < 1) {
						System.out.print("You must enter a positive number of terms: ");
						terms = input.nextInt();
				}

				int counter = 0;
				double constantE = 0;

				while(counter < terms) {
						// Formula: e = 1 / 0! + 1 / 1! + ... + 1 / n!
						constantE += 1 / Factorial.getFactorial(counter);
						counter++;
				}

				System.out.printf("The estimation of constant 'e' with %d terms is %.10f"
												, terms, constantE);
		}
}
