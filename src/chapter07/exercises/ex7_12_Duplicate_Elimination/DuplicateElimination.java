package chapter07.exercises.ex7_12_Duplicate_Elimination;

import java.util.Scanner;

public class DuplicateElimination {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int[] numbers = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,};

				System.out.println("Enter numbers in the range 10-100, both inclusive: ");

				for (int i = 0; i < numbers.length; i++) {
						System.out.printf("Number %d: ", i + 1);
						numbers[i] = input.nextInt();
				}

				eliminateDuplicates(numbers);
				displayArray(numbers);
		}

		public static void eliminateDuplicates(int[] numbers) {
				for (int i = 0; i < numbers.length; i++) {
						for (int j = i + 1; j < numbers.length; j++) {
								if (numbers[i] == numbers[j]) {
										numbers[j] = -1;
								}
						}
				}
		}

		public static void displayArray(int[] numbers) {
				System.out.println("The elements of the array are: ");

				for (int number : numbers) {
						if (number != -1) {
								System.out.printf("%5d", number);
						}
				}
		}
}
