package chapter02.exercises.ex2_28_Diameter_Circumference_And_Area_Of_A_Circle;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int radius;

				System.out.print("Enter the radius of a circle as an integer" +
												"\nand I'll print the diameter, Circumference and Area: ");
				radius = input.nextInt();

				System.out.printf("%nThe diameter is %d%nThe circumference is %.2f%n" +
																				"The area is %.2f%n",
												2 * radius,
												2 * Math.PI * radius,
												Math.PI * Math.pow(radius, 2));
		}
}
