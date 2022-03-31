package chapter06.exercises;// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
   private static Scanner input = new Scanner(System.in);

   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();

   // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   private static int bankBalance = 1000;

   // plays one game of craps
   public static void main(String[] args) {
      do {
         System.out.printf("Your current balance is %d. Enter a wager: ",
                 bankBalance);
         int wager = input.nextInt();

         while (!validWager(wager)) {
            System.out.printf("Your current balance is $%d. Enter a valid wager: ",
                    bankBalance);
            wager = input.nextInt();
         }

         playGame(wager);
      } while (bankBalance > 0 && keepPlaying());
   }

   public static boolean keepPlaying() {
      System.out.printf("Do you want to keep playing the game? (%s)\n",
              chatter());
      System.out.print("1) Keep playing.\n2) Withdraw.\nOption: ");
      int option = input.nextInt();

      while (option != 1 && option != 2) {
         System.out.print("Invalid option.\n1) Keep playing.\n2) Withdraw." +
                 "\nOption: ");
         option = input.nextInt();
      }

      return option == 1;
   }

   public static void playGame(int wager) {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int sumOfDice = rollDice(); // first roll of the dice

      // determine game status and point based on first roll
      switch (sumOfDice) {
         case SEVEN: // win with 7 on first roll
         case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll
         case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
         default: // did not win or lose, so remember point
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point
            System.out.printf("Point is %d%n", myPoint);
            break;
      }

      // while game is not complete
      while (gameStatus == Status.CONTINUE) { // not WON or LOST
         sumOfDice = rollDice(); // roll dice again

         // determine game status
         if (sumOfDice == myPoint) { // win by making point
            gameStatus = Status.WON;
         } else {
            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
               gameStatus = Status.LOST;
            }
         }
      }

      // display won or lost message
      if (gameStatus == Status.WON) {
         System.out.println("Player wins");
         bankBalance += wager;
      } else {
         System.out.println("Player loses");
         bankBalance -= wager;
      }

      System.out.printf("Your new balance is: $%d%n", bankBalance);
   }

   // roll dice, calculate sum and display results
   public static int rollDice() {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

      return sum;
   }

   public static boolean validWager(int wager) {
      return wager > 0 && wager <= bankBalance;
   }

   public static String chatter() {
      int option = randomNumbers.nextInt(3);
      String message = "";

      switch (option) {
         case 0:
            message = "Oh, you're going for broke, huh?";
            break;
         case 1:
            message = "Aw c'mon, take a chance!";
            break;
         case 2:
            message = "You're up big. Now's the time to cash " +
                    "in your chips!";
      }

      return message;
   }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
