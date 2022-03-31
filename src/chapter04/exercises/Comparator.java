package chapter04.exercises;

import java.util.Scanner;

public class Comparator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter two numbers and I'll print 0 if they are equal," +
              "\n1 if the fist number is greater and -1 if it's smaller.");

      System.out.print("Enter the first number: ");
      int firstNumber = input.nextInt();

      System.out.print("Enter the second number: ");
      int secondNumber = input.nextInt();

      if (firstNumber == secondNumber) {
         System.out.println(0);
      } else if (firstNumber > secondNumber) {
         System.out.print(1);
      } else {
         System.out.print(-1);
      }
   }
}
