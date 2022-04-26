package chapter06.exercises.ex6_35_Computer_Assisted_Instruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      while (true) {
         int result = howMuchIsIt();
         int answer = input.nextInt();

         while (result != answer) {
            System.out.print("No. Please try again. ");
            answer = input.nextInt();
         }

         System.out.println("Very good!");
      }
   }

   public static int howMuchIsIt() {
      SecureRandom randomNumbers = new SecureRandom();
      int number1 = randomNumbers.nextInt(10) + 1;
      int number2 = randomNumbers.nextInt(10) + 1;

      System.out.printf("How much is %d times %d? ", number1, number2);

      return number1 * number2;
   }
}
