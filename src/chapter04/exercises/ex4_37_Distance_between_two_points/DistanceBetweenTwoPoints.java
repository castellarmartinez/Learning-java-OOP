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

				System.out.println(getLocation(x1, y1, x2, y2));
		}

		public static String getLocation(int x1, int y1, int x2, int y2) {
				if (x1 == x2) {
						return "The points are located on a line perpendicular to the x-axis.";
				}

				if (y1 == y2) {
						return "The points are located on a line perpendicular to the y-axis.";
				}

				return "The points are not located on a line perpendicular to any axis.";
		}
}
