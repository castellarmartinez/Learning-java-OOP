package chapter07.exercises;


import java.security.SecureRandom;

public class KnightsTourBruteForceCompleteTour {
   static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
   static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
   static final char[][] board = new char[8][8];
   static int currentRow = 0;
   static int currentColumn = 0;
   static int numberOfMovements = 0;
   static int[] lengthTours = new int[64];

   public static void main(String[] args) {

      while (numberOfMovements < 63) {
         numberOfMovements = 0;
         runTour();
         lengthTours[numberOfMovements]++;
      }

      displayFrequency();
   }

   private static void runTour() {
      SecureRandom random = new SecureRandom();
      initializeBoard();

      while (canMove()) {
         int moveNumber = random.nextInt(8);

         moveKnight(moveNumber);
      }
   }

   static private void initializeBoard() {
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            board[i][j] = '0';
         }
      }
   }

   private static boolean canMove() {
      for (int i = 0; i < 8; i++) {
         int newRowPosition = currentRow + vertical[i];
         int newColumnPosition = currentColumn + horizontal[i];

         if (isInsideBoard(newRowPosition, newColumnPosition) &&
                 !isPositionTaken(newRowPosition, newColumnPosition)) {
            return true;
         }
      }

      return false;
   }

   private static boolean isInsideBoard(int rowPosition, int columnPosition) {
      if (rowPosition < 0 || rowPosition > 7) {
         return false;
      }

      if (columnPosition < 0 || columnPosition > 7) {
         return false;
      }

      return true;
   }

   private static boolean isPositionTaken(int rowPosition, int columnPosition) {
      return (board[rowPosition][columnPosition] != '0');
   }

   private static void moveKnight(int moveNumber) {
      int newRowPosition = currentRow + vertical[moveNumber];
      int newColumnPosition = currentColumn + horizontal[moveNumber];

      if (!isInsideBoard(newRowPosition, newColumnPosition) ||
              isPositionTaken(newRowPosition, newColumnPosition)) {
         return;
      }

      markPosition(newRowPosition, newColumnPosition);

      currentRow = newRowPosition;
      currentColumn = newColumnPosition;
   }

   private static void markPosition(int newRowPosition, int newColumnPosition) {
      board[currentRow][currentColumn] = '*';
      board[newRowPosition][newColumnPosition] = 'K';
      numberOfMovements++;
   }

   private static void displayFrequency() {
      System.out.printf("%10s%12s%n%n", "Tour length", "Frequency");

      for (int i = 0; i < 64; i++) {
         System.out.printf("%10d%12d%n", i, lengthTours[i]);
      }
   }
}
