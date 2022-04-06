package chapter07.exercises.ex7_30_Card_Shuffling_And_Dealing;// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      Card[] myHand = new Card[5];
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order

//       print all 52 Cards in the order in which they are dealt
      for (int i = 0; i < 5; i++) {
         // deal and display a Card
         myHand[i] = myDeckOfCards.dealCard();
         System.out.printf("%-19s", myHand[i]);
      }

      System.out.printf("%n%-19s", myDeckOfCards.getHandClassification(myHand));
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
