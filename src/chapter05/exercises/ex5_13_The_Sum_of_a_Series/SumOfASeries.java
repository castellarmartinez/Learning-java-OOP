package chapter05.exercises.ex5_13_The_Sum_of_a_Series;

import java.util.Scanner;

public class SumOfASeries {
		public static void main(String[] args) {
				int range = 100;

				System.out.println("\tn\tsummation");

				for (int i = 1; i <= range; i++) {
						displaySummation(i);
				}

				System.out.println("  n  accumulated product");

				for (int i = 1; i <= range; i++) {
						displayAccumulatedProduct(i);
				}
		}

		private static void displaySummation(int n) {
				long summation = 0;

				for (int i = 1; i <= n; i++) {
						summation += i;
				}

				System.out.println("\t" + n + "\t" + summation);
		}

		private static void displayAccumulatedProduct(int n) {
				long productSequence = 1;

				for (int i = 1; i <= n; i++) {
						productSequence *= i;
				}

				System.out.println("\t" + n + "\t" + productSequence);
		}
}
