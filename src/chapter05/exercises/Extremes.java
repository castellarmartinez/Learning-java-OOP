package chapter05.exercises;

import java.util.Scanner;

public class Extremes {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int maxNumber = Integer.MIN_VALUE;
      int minNumber = Integer.MAX_VALUE;
      int sumExtremes;

      System.out.print("How many integers do you want to enter? ");
      final int values = input.nextInt();

      for (int i = 0; i < values; i++) {
         System.out.print("Enter the number " + i + ": ");
         int currentNumber = input.nextInt();

         if (currentNumber < minNumber) {
            minNumber = currentNumber;
         } else if (currentNumber > maxNumber) {
            maxNumber = currentNumber;
         }
      }

      sumExtremes = minNumber + maxNumber;

      System.out.println("The minimum number is: " + minNumber);
      System.out.println("The maximum number is: " + maxNumber);
      System.out.println("The sum between the extremes is: " + sumExtremes);
   }
}
