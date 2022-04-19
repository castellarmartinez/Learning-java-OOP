package chapter04.exercises.ex4_21_Find_the_Largest_Number;

import java.util.Scanner;

public class FindLargestNumber {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int counter = 1;
      int largest = 0;

      while (counter <= 10) {
         System.out.print("Enter the items sold by this salesperson: ");
         int number = input.nextInt();

         if (number > largest) {
            largest = number;
         }

         counter++;
      }

      System.out.print("The salesperson who sold the most items, sold " + largest);
   }
}
