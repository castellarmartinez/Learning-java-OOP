package chapter07.exercises.ex7_11_One_Dimensional_Array;

import java.security.SecureRandom;

public class OneDimensionalArrayOperations {
		public static void main(String[] args) {
				int[] counts = generateIntArray(21);
				int[] bonus = generateIntArray(20);
				int[] bestScores = generateIntArray(10);

				System.out.println("Original array counts:");
				displayArray(counts);
				System.out.println("Original array bonus:");
				displayArray(bonus);
				System.out.println("Original array bestScore:");
				displayArray(bestScores);

				for (int i = 10; i <= 20; i++) {
						counts[i] = 0;
				}

				System.out.println("Array counts:");
				displayArray(counts);

				for (int i = 0; i < 20; i++) {
						bonus[i] *= 2;
				}

				System.out.println("Array bonus:");
				displayArray(bonus);

				System.out.println("Array bestScores:");
				displayArray(bestScores);
		}

		private static int[] generateIntArray(int elements) {
				SecureRandom random = new SecureRandom();
				int[] array = new int[elements];

				for (int i = 0; i < elements; i++) {
						array[i] = random.nextInt(100) + 1;
				}

				return array;
		}

		public static void displayArray(int[] array) {
				for (int i = 0; i < array.length; i++) {
						System.out.println(array[i]);
				}
		}
}
