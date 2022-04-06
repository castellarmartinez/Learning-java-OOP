package chapter02.exercises.ex2_30_Separating_The_Digits_In_An_Integer;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a five digit number and I'll pull apart the digits.");
      System.out.print("Enter the number: ");
      int number = input.nextInt();

      int digit1 = number % 100000 / 10000;
      int digit2 = number % 10000 / 1000;
      int digit3 = number % 1000 / 100;
      int digit4 = number % 100 / 10;
      int digit5 = number % 10 / 1;

      System.out.printf("%d%3d%3d%3d%3d", digit1, digit2, digit3, digit4, digit5);
   }

}
