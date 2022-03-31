package chapter04.exercises;

import java.util.Scanner;

public class RightAngledTriangle {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the length of the base of a triangle: ");
      int base = input.nextInt();

      while (base < 1 || base > 10) {
         System.out.println("The length of the base of a triangle must be between 1 and 10: ");
      }

      int counter = 1;

      while (counter <= base) {
         System.out.print("* ");

         if (counter == base) {
            int length = 1;

            while (length < base) {
               System.out.print("* ");
               length++;
            }
         } else if (counter != 1) {
            int space = counter - 2;

            while (space > 0) {
               System.out.print("  ");
               space--;
            }

            System.out.print('*');
         }

         System.out.println();
         counter++;
      }
   }
}
