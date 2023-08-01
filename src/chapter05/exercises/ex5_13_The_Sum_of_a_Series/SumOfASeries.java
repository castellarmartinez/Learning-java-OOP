package chapter05.exercises.ex5_13_The_Sum_of_a_Series;

import java.util.Scanner;

public class SumOfASeries {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				long summation = 0;
				long productSequence = 1;

				System.out.print("Enter a number between 1-100 and I'll calculate " +
												"the summation from 1-n: ");

				final int number = input.nextInt();

				for (int i = 1; i <= number; i++) {
						summation += i;
						productSequence *= i;
				}

				System.out.println("The summation from 1 to " + number + " is: " +
												summation);
				System.out.println("The product sequence from 1 to " + number + " is: "
												+ productSequence);
		}
}
