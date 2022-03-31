package chapter06.exercises;

import java.util.Scanner;

public class HypotenuseCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;

        System.out.print("Enter the first side: ");
        side1 = input.nextDouble();
        System.out.print("Enter the second side: ");
        side2 = input.nextDouble();

        System.out.printf("The hypotenuse of the right triangle is: %.2f%n",
                hypotenuse(side1, side2));
    }

    public static double hypotenuse(double sideA, double sideB) {
        double result = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        return result;
    }
}
