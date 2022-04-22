package chapter04.exercises.ex4_31_Palindromes;

import java.util.Scanner;

public class Palindromes {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a five-digit integer: ");
      int numberToTest = input.nextInt();

      while (numberToTest > 100000) {
         System.out.print("You must enter a five-digit integer: ");
         numberToTest = input.nextInt();
      }

      int digit1 = numberToTest % 100000 / 10000;
      int digit2 = numberToTest % 10000 / 1000;
      int digit4 = numberToTest % 100 / 10;
      int digit5 = numberToTest % 10 / 1;

      if (digit1 == digit5 && digit2 == digit4) {
         System.out.println("The number is a palindrome.");
      } else {
         System.out.println("The number is NOT a palindrome.");

      }
   }
}
