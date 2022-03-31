package chapter07.exercises;


import java.security.SecureRandom;

public class EightQueensBruteForceA {
   static int queensOnBoard = 0;
   static final char[][] board = new char[8][8];

   public static void main(String[] args) {
      SecureRandom random = new SecureRandom();
      int tries = 0;
      int initialRow = random.nextInt(8);
      int initialColumn = random.nextInt(8);

      initializeBoard();
      setQueen(initialRow, initialColumn);
      queensOnBoard++;
      tries++;

      while (canPlaceQueens()){
         tries++;
         int newRow = random.nextInt(8);
         int newColumn = random.nextInt(8);

         if (!positionValid(newRow, newColumn)) {
            continue;
         }

         setQueen(newRow, newColumn);
         queensOnBoard++;
      }

      displayBoard();

      System.out.println("The program run " + tries + " attempts.");
      System.out.println("Total number of queens on board: " +
              queensOnBoard);
   }

   static private boolean canPlaceQueens() {
      for (int row = 0; row < 8; row++) {
         for (int column = 0; column < 8; column++) {
            if (positionValid(row, column)) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean positionValid(int bestRow, int bestColumn) {
      if (queensOnTheSameRow(bestRow, bestColumn)) {
         return false;
      }

      if (queensOnTheSameColumn(bestRow, bestColumn)) {
         return false;
      }

      if (queensOnTheSameForwardDiagonal(bestRow, bestColumn)) {
         return false;
      }

      if (queensOnTheSameReverseDiagonal(bestRow, bestColumn)) {
         return false;
      }

      return true;
   }

   private static boolean queensOnTheSameColumn(int row, int column) {

      for (int i = 0; i < 8; i++) {

         if (board[row][column] == 'Q') {
            return true;
         }

         row++;

         if (row == 8) { row = 0; }
      }

      return false;
   }

   private static boolean queensOnTheSameRow(int row, int column) {

      for (int i = 0; i < 8; i++) {

         if (board[row][column] == 'Q') {
            return true;
         }

         column++;

         if (column == 8) { column = 0; }
      }

      return false;
   }

   private static boolean queensOnTheSameForwardDiagonal(int row, int column) {

      for (int i = 0; i < 8; i++) {

         if (board[row][column] == 'Q') {
            return true;
         }

         row--;
         column++;

         if (row < 0) {
            row = --column;
            column = 0;
         }

         if (column > 7) {
            column = ++row;
            row = 7;
         }
      }

      return false;
   }

   private static boolean queensOnTheSameReverseDiagonal(int row, int column) {

      for (int i = 0; i < 8; i++) {

         if (board[row][column] == 'Q') {
            return true;
         }

         row++;
         column++;

         if (row > 7) {
            row = 7 - (--column);
            column = 0;
         }

         if (column > 7) {
            column = 7 - (--row);
            row = 0;
         }
      }

      return false;
   }

   private static void setQueen(int row, int column) {
      board[row][column] = 'Q';
   }

   static private void initializeBoard() {
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            board[i][j] = '0';
         }
      }
   }

   static private void displayBoard() {
      System.out.print(" ");

      for (int i = 0; i < 8; i++) {
         System.out.printf("%4d", i);
      }

      System.out.print("\n  ");

      for (int k = 0; k < 33; k++) {
         System.out.print("-");
      }

      for (int i = 0; i < 8; i++) {
         System.out.printf("%n%d |", i);

         for (int j = 0; j < 8; j++) {
            System.out.printf("%2c |", board[i][j]);
         }

         System.out.print("\n  ");

         for (int k = 0; k < 33; k++) {
            System.out.print("-");
         }
      }

      System.out.printf("%n%n");
   }
}
