package chapter05.exercises.ex5_13_The_Sum_of_a_Series;

import java.util.Scanner;

public class SumOfASeries {
		public static void main(String[] args) {
				int range = 100;

				System.out.println("\tn\tsummation");

				for (int i = 1; i <= range; i++) {
						long summation = 0;

						for (int j = 1; j <= i; j++) {
								summation += j;
						}

						System.out.println("\t" + i + "\t" + summation);
				}

				System.out.println("  n  accumulated product");

				for (int i = 1; i <= range; i++) {
						long productSequence = 1;

						for (int j = 1; j <= i; j++) {
								productSequence *= j;
						}

						System.out.println("\t" + i + "\t" + productSequence);
				}
		}
}
