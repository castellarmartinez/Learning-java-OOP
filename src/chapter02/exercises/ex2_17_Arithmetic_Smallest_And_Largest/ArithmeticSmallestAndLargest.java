package chapter02.exercises.ex2_17_Arithmetic_Smallest_And_Largest;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int integer1;
				int integer2;
				int integer3;
				int sum;
				int average;
				int product;
				int largest;
				int smallest;

				System.out.println("Enter three integers and I will tell you the" +
												" sum, average, product, smallest and the largest number.");
				System.out.print("Enter the first integer: ");
				integer1 = input.nextInt();
				System.out.print("Enter the second integer: ");
				integer2 = input.nextInt();
				System.out.print("Enter the third integer: ");
				integer3 = input.nextInt();

				sum = integer1 + integer2 + integer3;
				average = sum / 3;
				product = integer1 * integer2 * integer3;

				largest = integer1;
				smallest = integer1;

				if (integer2 > largest) largest = integer2;
				if (integer3 > largest) largest = integer3;

				if (integer2 < smallest) smallest = integer2;
				if (integer3 < smallest) smallest = integer3;

				System.out.printf("The sum is %d%nThe average is %d%n" +
																				"The product is %d%nThe largest number is %d%n" +
																				"The smallest number is %d%n",
												sum, average, product, largest, smallest);
		}
}
