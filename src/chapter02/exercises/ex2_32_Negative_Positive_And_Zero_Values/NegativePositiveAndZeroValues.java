package chapter02.exercises.ex2_32_Negative_Positive_And_Zero_Values;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int positiveCount = 0;
      int negativeCount = 0;
      int zeroCount = 0;
      int numberEntered;

      System.out.print("Enter the first number: ");
      numberEntered = input.nextInt();

      if (numberEntered > 0) {
         positiveCount++;
      }

      if (numberEntered < 0) {
         negativeCount++;
      }

      if (numberEntered == 0) {
         zeroCount++;
      }

      System.out.print("Enter the second number: ");
      numberEntered = input.nextInt();

      if (numberEntered > 0) {
         positiveCount++;
      }

      if (numberEntered < 0) {
         negativeCount++;
      }

      if (numberEntered == 0) {
         zeroCount++;
      }

      System.out.print("Enter the third number: ");
      numberEntered = input.nextInt();

      if (numberEntered > 0) {
         positiveCount++;
      }

      if (numberEntered < 0) {
         negativeCount++;
      }

      if (numberEntered == 0) {
         zeroCount++;
      }

      System.out.print("Enter the fourth number: ");
      numberEntered = input.nextInt();

      if (numberEntered > 0) {
         positiveCount++;
      }

      if (numberEntered < 0) {
         negativeCount++;
      }

      if (numberEntered == 0) {
         zeroCount++;
      }

      System.out.print("Enter the fifth number: ");
      numberEntered = input.nextInt();

      if (numberEntered > 0) {
         positiveCount++;
      }

      if (numberEntered < 0) {
         negativeCount++;
      }

      if (numberEntered == 0) {
         zeroCount++;
      }

      System.out.printf("The number of negative numbers input was %d%n", negativeCount);
      System.out.printf("The number of positive numbers input was %d%n", positiveCount);
      System.out.printf("The number of zero numbers input was %d%n", zeroCount);
   }
}
