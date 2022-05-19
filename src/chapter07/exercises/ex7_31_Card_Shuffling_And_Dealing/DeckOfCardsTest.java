package chapter07.exercises.ex7_31_Card_Shuffling_And_Dealing;// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

import java.util.Arrays;

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      Card[] firstHand = new Card[5];
      Card[] secondHand = new Card[5];
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order

      // print all 52 Cards in the order in which they are dealt
      for (int i = 0; i < 5; i++) {
         // deal and display a Card
         firstHand[i] = myDeckOfCards.dealCard();
         secondHand[i] = myDeckOfCards.dealCard();
      }

      System.out.println("Player 1: ");
      printHand(firstHand);
      System.out.println("Player 2: ");
      printHand(secondHand);

      printBestHand(firstHand, secondHand);
   }

   public static void printHand(Card[] hand) {
      for (Card card : hand) {
         System.out.printf("%-19s", card);
      }

      System.out.printf("%n%n");
   }

   public static void printBestHand(Card[] handOne, Card[] handTwo) {
      int scoreOne = getHandScore(handOne);
      int scoreTwo = getHandScore(handTwo);

      if (scoreOne > scoreTwo) {
         System.out.println("Player 1 has the best hand.");
      } else if (scoreOne < scoreTwo) {
         System.out.println("Player 2 has the best hand.");
      } else {
         System.out.println("The hands are tied.");
      }
   }

   public static int getHandScore(Card[] hand) {
      DeckOfCards myDeckOfCards = new DeckOfCards();

      String[] handNames = {
              "",
              "High card.",
              "You got a pair!",
              "You got two pair!",
              "You got three of a kind!",
              "You got a straight!",
              "You got a flush!",
              "You got a full house!",
              "You got four of a kind!"
      };
      String nameOfThisHand = myDeckOfCards.getHandClassification(hand);

      return Arrays.asList(handNames).indexOf(nameOfThisHand);
   }
} // end class DeckOfCardsTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
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
