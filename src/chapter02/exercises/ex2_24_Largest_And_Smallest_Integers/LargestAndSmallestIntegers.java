package chapter02.exercises.ex2_24_Largest_And_Smallest_Integers;

import java.util.Scanner;

public class LargestAndSmallestIntegers {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter five numbers and I tell you which is the largest"
              + " and which is the smallest.");
      System.out.print("Enter the first number: ");
      int firstNumber = input.nextInt();
      System.out.print("Enter the second number: ");
      int secondNumber = input.nextInt();
      System.out.print("Enter the third number: ");
      int thirdNumber = input.nextInt();
      System.out.print("Enter the fourth number: ");
      int fourthNumber = input.nextInt();
      System.out.print("Enter the fifth number: ");
      int fifthNumber = input.nextInt();

      int smallest = firstNumber;
      int largest = firstNumber;

      if (secondNumber < smallest) {
         smallest = secondNumber;
      }

      if (thirdNumber < smallest) {
         smallest = thirdNumber;
      }

      if (fourthNumber < smallest) {
         smallest = fourthNumber;
      }

      if (fifthNumber < smallest) {
         smallest = fifthNumber;
      }

      if (secondNumber > largest) {
         largest = secondNumber;
      }

      if (thirdNumber > largest) {
         largest = thirdNumber;
      }

      if (fourthNumber > largest) {
         largest = fourthNumber;
      }

      if (fifthNumber > largest) {
         largest = fifthNumber;
      }

      System.out.println("The largest number entered is " + largest);
      System.out.println("The smallest number entered is " + smallest);
   }

}
