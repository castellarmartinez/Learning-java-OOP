package chapter06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {
   public static void main(String[] args) {
      SecureRandom rand = new SecureRandom();
      Scanner input = new Scanner(System.in);

      int numberToBeGuessed = 1 + rand.nextInt(1000);

      System.out.print("Guess a number between 1 and 1000: ");
      int userGuess = input.nextInt();
      int numberOfGuesses = 1;

      while (userGuess != numberToBeGuessed) {
         if (userGuess > numberToBeGuessed) {
            System.out.print("Too high. Try again: ");
         } else {
            System.out.print("Too low. Try again: ");
         }

         userGuess = input.nextInt();
         numberOfGuesses++;
      }

      displayMessage(numberOfGuesses);
   }

   private static void displayMessage(int numberOfGuesses) {
      if (numberOfGuesses < 10) {
         System.out.println("Either you know the secret\n" +
                 "or you got lucky!");
      } else if (numberOfGuesses == 10) {
         System.out.println("Aha! You know the secret!");
      } else {
         System.out.println("You should be able to do better!");
      }
   }
}
