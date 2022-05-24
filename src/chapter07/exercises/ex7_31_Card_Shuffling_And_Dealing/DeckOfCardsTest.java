package chapter07.exercises.ex7_31_Card_Shuffling_And_Dealing;// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

import java.util.ArrayList;
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

   public static void tiebreaker(Card[] handOne, Card[] handTwo) {
      ArrayList<String> facesHandOne = new ArrayList<>();
      ArrayList<String> facesHandTwo = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
         facesHandOne.add(handOne[i].getFace());
         facesHandTwo.add(handTwo[i].getFace());
      }

      System.out.println(getHigherHand(facesHandOne, facesHandTwo));
   }

   public static String getHigherHand(ArrayList<String> facesHandOne,
                                      ArrayList<String> facesHandTwo) {
      ArrayList<String> faces = new ArrayList<>(
              Arrays.asList("", "Ace", "Deuce", "Three", "Four", "Five", "Six",
                      "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
      int higherCardHandOne = 0;
      int higherCardHandTwo = 0;

      for (int i = 0; i < 5; i++) {
         int faceHandOne = faces.indexOf(facesHandOne.get(i));
         int faceHandTwo = faces.indexOf(facesHandTwo.get(i));

         if (faceHandOne > higherCardHandOne) {
            higherCardHandOne = faceHandOne;
         }

         if (faceHandTwo > higherCardHandTwo) {
            higherCardHandTwo = faceHandTwo;
         }
      }

      if (higherCardHandOne > higherCardHandTwo) {
         return "Player 1 has the best hand.";
      } else if (higherCardHandOne < higherCardHandTwo) {
         return "Player 2 has the best hand.";
      } else {
         facesHandOne.remove(faces.get(higherCardHandOne));
         facesHandTwo.remove(faces.get(higherCardHandOne));

         return getHigherHand(facesHandOne, facesHandTwo);
      }
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
