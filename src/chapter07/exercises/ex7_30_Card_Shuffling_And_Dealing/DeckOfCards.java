package chapter07.exercises.ex7_30_Card_Shuffling_And_Dealing;// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class DeckOfCards {
   private Card[] deck; // array of Card objects
   private int currentCard; // index of next Card to be dealt (0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
              "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects
      for (int count = 0; count < deck.length; count++)
         deck[count] =
                 new Card(faces[count % 13], suits[count / 13]);
   }

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0;

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];
         deck[first] = deck[second];
         deck[second] = temp;
      }
   }

   // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length)
         return deck[currentCard++]; // return current Card in array
      else
         return null; // return null to indicate that all Cards were dealt
   }

   public String getHandClassification(Card[] hand) {
      if (isAFullHouse(hand)) {
         return "You got a full house!";
      } else if (isAStraight(hand)) {
         return "You got a straight!";
      } else if (isAFlush(hand)) {
         return "You got a flush!";
      } else if (areFourOfAKind((hand))) {
         return "You got four of a kind!";
      } else if (areThreeOfAKind((hand))) {
         return "You got three of a kind!";
      } else if (areTwoPair(hand)) {
         return "You got two pair!";
      } else if (isAPair(hand)) {
         return "You got a pair!";
      }

      return "High card.";
   }

   private boolean isAPair(Card[] hand) {
      int faceCount = getFaceCount(hand);

      return (faceCount == 2);
   }

   private boolean areThreeOfAKind(Card[] hand) {
      int faceCount = getFaceCount(hand);

      return (faceCount == 3);
   }

   private boolean areFourOfAKind(Card[] hand) {
      int faceCount = getFaceCount(hand);

      return (faceCount == 4);
   }

   private int getFaceCount(Card[] hand) {
      ArrayList<String> faces = new ArrayList<>();
      String face = "";
      int faceCount = 0;

      for (Card card: hand) {
         if (faces.contains(card.getFace()) && face.equals("")) {
            face = card.getFace();
            faceCount = 2;
         } else if (face.equals(card.getFace())) {
            faceCount++;
         }

         faces.add(card.getFace());
      }

      return faceCount;
   }

   private boolean areTwoPair(Card[] hand) {
      ArrayList<String> faces = new ArrayList<>();
      String face1 = "";
      String face2 = "";
      int face1Count = 0;
      int face2Count = 0;

      for (Card card: hand) {
         if (faces.contains(card.getFace()) && face1.equals("")) {
            face1 = card.getFace();
            face1Count = 2;
         } else if (face1.equals(card.getFace())) {
            face1Count++;
         } else if (faces.contains(card.getFace()) && face2.equals("")) {
            face2 = card.getFace();
            face2Count = 2;
         } else if (face2.equals(card.getFace())) {
            face2Count++;
         }

         faces.add(card.getFace());
      }

      return (face1Count == 2 && face2Count == 2);
   }

   private boolean isAFlush(Card[] hand) {
      String face = "";

      for (Card card: hand) {
         if (face.equals("")) {
            face = card.getSuit();
         } else if (!face.equals(card.getSuit())) {
            return false;
         }
      }

      return true;
   }

   private boolean isAStraight(Card[] hand) {
      ArrayList<String> faces = new ArrayList<>(
              Arrays.asList("", "Ace", "Deuce", "Three", "Four", "Five", "Six",
                      "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
      int[] numberInFaces = new int[5];

      for (int i = 0; i < 5; i++) {
         numberInFaces[i] = faces.indexOf(hand[i].getFace());
      }

      Arrays.sort(numberInFaces);

      return (numberInFaces[4] - numberInFaces[0] == 4);
   }

   private boolean isAFullHouse(Card[] hand) {
      String face1 = "";
      String face2 = "";
      int face1Count = 0;
      int face2Count = 0;

      for (Card card: hand) {
         if (face1.equals("")) {
            face1 = card.getFace();
            face1Count++;
         } else if (face1.equals(card.getFace())) {
            face1Count++;
         } else if (face2.equals("")) {
            face2 = card.getFace();
            face2Count++;
         } else if (face2.equals(card.getFace())) {
            face2Count++;
         }
      }

      return (face1Count + face2Count == 5) && (face1Count == 3 || face2Count == 3);
   }
} // end class DeckOfCards


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
