package chapter04.exercises;

import java.util.Scanner;

public class FindLargestNumber {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int counter = 1;
      int largest = Integer.MIN_VALUE;

      while (counter <= 10) {
         System.out.print("Enter the items sold by this salesperson: ");
         int itemsSold = input.nextInt();

         if (itemsSold > largest) {
            largest = itemsSold;
         }

         counter++;
      }

      System.out.print("The salesperson who sold the most items, sold " + largest);
   }
}
