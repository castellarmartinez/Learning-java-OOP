package chapter05.exercises;

import java.util.Scanner;

public class DiamondPrintingModified {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int size;
      int half;

      System.out.print("Enter an odd number: ");
      size = input.nextInt();
      half = (size + 1) / 2;

      for (int i = 1; i <= half; i++) {

         for (int j = half - 1; j >= i; j--) {
            System.out.print(' ');
         }

         for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print('*');
         }

         System.out.println();
      }

      for (int i = half + 1; i <= size; i++) {

         for (int j = i; j > half; j--) {
            System.out.print(' ');
         }

         for (int j = 2 * (size - i) + 1; j >= 1; j--) {
            System.out.print('*');
         }

         System.out.println();
      }
   }
}
