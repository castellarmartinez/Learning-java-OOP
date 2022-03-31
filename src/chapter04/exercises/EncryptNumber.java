package chapter04.exercises;

import java.util.Scanner;

public class EncryptNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a four-digit number: ");
      int number = input.nextInt();


      while (number / 10000 != 0 || number / 1000 == 0) {
         System.out.print("You must enter a four-digit number: ");
         number = input.nextInt();
      }

      int addedSeven = 0;
      int counter = 1;

      while (number > 0) {
         int digit = (number % 10 + 7);
         addedSeven += digit % 10 * counter;
         number /= 10;
         counter *= 10;
      }

      int swapDigits = 0;
      counter = 100;

      while (addedSeven > 0) {
         swapDigits += addedSeven % 10 * counter;
         addedSeven /= 10;
         counter *= 10;

         if (counter == 10000) {
            counter = 1;
         }
      }

      System.out.printf("The encrypted number is: %04d", swapDigits);
   }
}
