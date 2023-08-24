package chapter06.exercises.ex6_18_Displaying_A_Square_Of_Asterisks;

import java.util.Scanner;

public class SquareOfAsterisks {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int numberOfAsterisks;

				System.out.print("Enter a number and I'll draw an square of asterisks with that number: ");
				numberOfAsterisks = input.nextInt();

				squareOfAsterisks(numberOfAsterisks);
		}

		public static void squareOfAsterisks(int side) {
				for (int i = 0; i < side; i++) {
						for (int j = 0; j < side; j++) {
								System.out.print("* ");
						}

						System.out.println();
				}
		}
}
