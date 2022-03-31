package chapter04.exercises;

import java.util.Scanner;

public class FindTwoLargestNumbers {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int counter = 1;
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      while (counter <= 10) {
         System.out.print("Enter the items sold by this salesperson: ");
         int itemsSold = input.nextInt();

         if (itemsSold > largest) {
            secondLargest = largest;
            largest = itemsSold;
         } else if (itemsSold != largest && itemsSold > secondLargest) {
            secondLargest = itemsSold;
         }

         counter++;
      }

      System.out.println("The salesperson who sold the most items, sold " +
              largest);
      System.out.println("The salesperson who sold the second most quantity, "
              + "sold " + secondLargest);
   }
}
