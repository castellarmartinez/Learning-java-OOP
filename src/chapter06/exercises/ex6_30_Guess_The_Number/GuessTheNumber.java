package chapter06.exercises.ex6_30_Guess_The_Number;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
   public static void main(String[] args) {
      SecureRandom rand = new SecureRandom();
      Scanner input = new Scanner(System.in);
      int numberToBeGuessed = 1 + rand.nextInt(1000);

      System.out.print("Guess a number between 1 and 1000: ");
      int userGuess = input.nextInt();

      while (userGuess != numberToBeGuessed) {
         if (userGuess > numberToBeGuessed) {
            System.out.print("Too high. Try again: ");
         } else {
            System.out.print("Too low. Try again: ");
         }

         userGuess = input.nextInt();
      }

      System.out.println("Congratulations. You guessed the number!");
   }
}
