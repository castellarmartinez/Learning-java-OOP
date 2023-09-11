package chapter07.exercises.ex7_14_Variable_Length_Argument_LIst;

public class VariableLengthArgumentList {
		public static void main(String[] args) {
				System.out.printf("The average of the integers [1, 3, 4, 5] is:"
												+ " %.1f%n", average(1, 3, 4, 5));
				System.out.printf("The average of the integers [5, 3, 3, 7, 8] is:"
												+ " %.1f%n", average(5, 3, 3, 7, 8));
				System.out.printf("The average of the integers [3, 5, 6, 39, 0] is:"
												+ " %.1f%n", average(3, 5, 6, 39, 0));
				System.out.printf("The average of the integers [9, 9, 9, 8, 8, 8, 4, 4, 4] is:"
												+ " %.1f%n", average(9, 9, 9, 8, 8, 8, 4, 4, 4));
				System.out.printf("The average of the integers [8, 6, 4] is:"
												+ " %.1f%n", average(8, 6, 4));
		}

		public static double average(int ...values) {
				double sum = 0;

				for (int value: values) {
						sum += value;
				}

				return sum / values.length;
		}
}
