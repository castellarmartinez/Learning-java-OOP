package chapter02.exercises.ex2_26_Multiples;

import java.util.Scanner;

public class Multiples {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number1;
      int number2;

      System.out.println("Enter two integers and I will tell you if" +
              " he first number tripled is a multiple of the second number doubled.");
      System.out.print("Your first integer: ");
      number1 = input.nextInt();
      System.out.print("Your second integer: ");
      number2 = input.nextInt();

      if ((number1 * 3) % (number2 * 2) == 0) {
         System.out.println("The first number tripled is a multiple of the second number doubled.");
      }

      if ((number1 * 3) % (number2 * 2) != 0) {
         System.out.println("The first number tripled is not a multiple of the second number doubled.");
      }
   }
}
