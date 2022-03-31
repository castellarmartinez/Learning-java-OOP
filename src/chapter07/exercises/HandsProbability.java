package chapter07.exercises;

public class HandsProbability {
   public static void main(String[] args) {
      Card[] myHand = new Card[5];
      int[] hands = new int[8];

      for (int i = 0; i < 1_000; i++) {
         DeckOfCards myDeckOfCards = new DeckOfCards();
         myDeckOfCards.shuffle();

         for (int j = 0; j < 5; j++) {
            myHand[j] = myDeckOfCards.dealCard();
         }

         String hand = myDeckOfCards.getHandClassification(myHand);
         addHand(hand, hands, myHand);
      }

      displayHands(hands);
   }

   private static void addHand(String hand, int[] hands, Card[] myHand) {
      switch (hand) {
         case "You got four of a kind!" -> hands[0]++;
         case "You got a full house!" -> hands[1]++;
         case "You got a flush!" -> hands[2]++;
         case "You got a straight!" -> {
            hands[3]++;

            for (Card card: myHand) {
               System.out.printf("%-19s", card);
            }

            System.out.println();
         }
         case "You got three of a kind!" -> hands[4]++;
         case "You got two pair!" -> hands[5]++;
         case "You got a pair!" -> hands[6]++;
         case "High card." -> hands[7]++;
      }
   }


   private static void displayHands(int[] hands) {
      System.out.printf("Four of a kind: %d  %.2f%%%n", hands[0],
              (hands[0] * 100.0 / 1_000_000));
      System.out.printf("Full house: %d  %.2f%%%n", hands[1],
              (hands[1] * 100.0 / 1_000_000));
      System.out.printf("Flush: %d  %.2f%%%n", hands[2],
              (hands[2] * 100.0 / 1_000_000));
      System.out.printf("Straight: %d  %.2f%%%n", hands[3],
              (hands[3] * 100.0 / 1_000_000));
      System.out.printf("Three of a kind: %d  %.2f%%%n", hands[4],
              (hands[4] * 100.0 / 1_000_000));
      System.out.printf("Two pair: %d  %.2f%%%n", hands[5],
              (hands[5] * 100.0 / 1_000_000));
      System.out.printf("One pair: %d  %.2f%%%n", hands[6],
              (hands[6] * 100.0 / 1_000_000));
      System.out.printf("High card: %d  %.2f%%%n", hands[7],
              (hands[7] * 100.0 / 1_000_000));
   }
}
