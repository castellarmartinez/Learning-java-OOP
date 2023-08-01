package chapter04.exercises.ex4_37_Distance_between_two_points;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter two points and I'll tell you if they are" +
												" located on a line perpendicular to an axis.");

				System.out.print("Enter x1: ");
				int x1 = input.nextInt();

				System.out.print("Enter y1: ");
				int y1 = input.nextInt();

				System.out.print("Enter x2: ");
				int x2 = input.nextInt();

				System.out.print("Enter y2: ");
				int y2 = input.nextInt();

				if (x1 == x2) {
						System.out.print("The points are located on a line perpendicular" +
														" to the x-axis.");
				} else if (y1 == y2) {
						System.out.print("The points are located on a line perpendicular" +
														" to the y-axis.");
				} else {
						System.out.print("The points are not located on a line " +
														"perpendicular to any axis.");
				}
		}
}
