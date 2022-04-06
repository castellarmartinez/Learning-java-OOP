package chapter02.exercises.ex2_16_Comparing_Integers;

import java.util.Scanner;

public class ComparingIntegers {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter two numbers and I tell you which is larger.");
      System.out.print("Enter the first number: ");
      int firstNumber = input.nextInt();
      System.out.print("Enter the second number: ");
      int secondNumber = input.nextInt();

      if (firstNumber > secondNumber) {
         System.out.println(firstNumber + " is larger");
      }

      if (firstNumber < secondNumber) {
         System.out.println(secondNumber + " is larger");
      }

      if (firstNumber == secondNumber) {
         System.out.println("These numbers are equal");
      }
   }

}
