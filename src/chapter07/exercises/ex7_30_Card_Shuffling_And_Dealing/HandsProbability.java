package chapter07.exercises.ex7_30_Card_Shuffling_And_Dealing;

public class HandsProbability {
   static int rounds = 1_000_000_000;

   public static void main(String[] args) {
      Card[] myHand = new Card[5];
      int[] hands = new int[8];

      for (int i = 0; i < rounds; i++) {
         DeckOfCards myDeckOfCards = new DeckOfCards();
         myDeckOfCards.shuffle();

         for (int j = 0; j < 5; j++) {
            myHand[j] = myDeckOfCards.dealCard();
         }

         String hand = myDeckOfCards.getHandClassification(myHand);
         addHand(hand, hands);
      }

      displayHands(hands);
   }

   private static void addHand(String hand, int[] hands) {

      switch (hand) {
         case "You got four of a kind!" -> hands[0]++;
         case "You got a full house!" -> hands[1]++;
         case "You got a flush!" -> hands[2]++;
         case "You got a straight!" -> hands[3]++;
         case "You got three of a kind!" -> hands[4]++;
         case "You got two pair!" -> hands[5]++;
         case "You got a pair!" -> hands[6]++;
         case "High card." -> hands[7]++;
      }

   }


   private static void displayHands(int[] hands) {
      System.out.printf("%16s%8d%8.3f%%%n", "Four of a kind:", hands[0],
              getPercentage(hands[0]));
      System.out.printf("%16s%8d%8.3f%%%n","Full house:", hands[1],
              getPercentage(hands[1]));
      System.out.printf("%16s%8d%8.3f%%%n","Flush:", hands[2],
              getPercentage(hands[2]));
      System.out.printf("%16s%8d%8.3f%%%n","Straight:", hands[3],
              getPercentage(hands[3]));
      System.out.printf("%16s%8d%8.3f%%%n","Three of a kind:", hands[4],
              getPercentage(hands[4]));
      System.out.printf("%16s%8d%8.3f%%%n","Two pair:", hands[5],
              getPercentage(hands[5]));
      System.out.printf("%16s%8d%8.3f%%%n","One pair:", hands[6],
              getPercentage(hands[6]));
      System.out.printf("%16s%8d%8.3f%%%n","High card:", hands[7],
              getPercentage(hands[7]));
   }

   public static double getPercentage(int count) {
      return count * 100.0 / rounds;
   }
}
