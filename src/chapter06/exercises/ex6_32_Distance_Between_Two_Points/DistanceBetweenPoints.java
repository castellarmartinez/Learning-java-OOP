package chapter06.exercises.ex6_32_Distance_Between_Two_Points;

import java.util.Scanner;

public class DistanceBetweenPoints {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the coordinates of the first point.\n" +
              "X1: ");
      double x1 = input.nextDouble();

      System.out.print("Y1: ");
      double y1 = input.nextDouble();

      System.out.print("Enter the coordinates of the second point.\n" +
              "X2: ");
      double x2 = input.nextDouble();

      System.out.print("Y2: ");
      double y2 = input.nextDouble();

      System.out.printf("The distance between the points (%.2f, %.2f) and " +
              "(%.2f, %.2f) is %.2f", x1, y1, x2, y2, distance(x1, y1, x2, y2));
   }

   public static double distance(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
   }
}
