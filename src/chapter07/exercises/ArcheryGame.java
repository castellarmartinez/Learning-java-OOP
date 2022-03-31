package chapter07.exercises;

import java.security.SecureRandom;

public class ArcheryGame {
   public static void main(String[] args) {
      int[][] playerScores = new int[4][3];

      System.out.printf("%n%15s%15s%15s%15s%15s%n%n", "Player number",
              "First chance", "Second chance", "Third chance", "Total score");

      for (int i = 0; i < playerScores.length; i++) {
         System.out.printf("%15d", i + 1);

         for (int j = 0; j < playerScores[i].length; j++) {
            shootBow(playerScores, i, j);
            System.out.printf("%15d", playerScores[i][j]);
         }

         System.out.printf("%15d%n", getTotalScore(playerScores, i));
      }
   }

   private static void shootBow(int[][] score, int player, int chance) {
      SecureRandom myRandom = new SecureRandom();
      score[player][chance] = myRandom.nextInt(10) + 1;
   }

   private static int getTotalScore(int[][] score, int player) {
      int total = 0;

      for (int i = 0; i < score[player].length; i++) {
         total += score[player][i];
      }

      return total;
   }
}
