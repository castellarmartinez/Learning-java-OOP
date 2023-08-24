package chapter06.exercises.ex6_19_Displaying_A_Square_Of_Any_Character;

import java.util.Scanner;

public class SquareOfAnyCharacter {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int numberOfAsterisks;
				char fillCharacter;

				System.out.print("Enter a number and I'll draw an square with that number: ");
				numberOfAsterisks = input.nextInt();
				System.out.print("Now enter the character the square will be composed: ");
				fillCharacter = input.next().charAt(0);

				squareOfAsterisks(numberOfAsterisks, fillCharacter);
		}

		public static void squareOfAsterisks(int side, char character) {
				for (int i = 0; i < side; i++) {
						for (int j = 0; j < side; j++) {
								System.out.print(character + " ");
						}

						System.out.println();
				}
		}
}
