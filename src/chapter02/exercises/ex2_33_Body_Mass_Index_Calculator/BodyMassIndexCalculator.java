package chapter02.exercises.ex2_33_Body_Mass_Index_Calculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int weight;
      int height;
      int bmi;

      System.out.print("Enter the weight in kilograms: ");
      weight = input.nextInt();
      System.out.print("Enter the height in centimeters: ");
      height = input.nextInt();

      bmi = weight * 10_000 / (height * height);
      System.out.printf("The body mass index is %d%n", bmi);
      System.out.println("\nUnderweight = < 18.5\nNormal weight = 18.5–24.9\n" +
              "Overweight = 25–29.9\nObesity = bmi of 30 or greater");
   }
}
