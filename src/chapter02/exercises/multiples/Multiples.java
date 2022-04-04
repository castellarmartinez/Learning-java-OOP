package chapter02.exercises.multiples;

import java.util.Scanner;

public class Multiples {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number1;
      int number2;

      System.out.println("Enter two integers and I will tell you if" +
              " the first is a multiple of the second.");
      System.out.print("Your first integer: ");
      number1 = input.nextInt();
      System.out.print("Your second integer: ");
      number2 = input.nextInt();

      if (number1 % number2 == 0) {
         System.out.println("The first number is a multiple of the second.");
      }

      if (number1 % number2 != 0) {
         System.out.println("The first number is not a multiple of the second.");
      }
   }
}
