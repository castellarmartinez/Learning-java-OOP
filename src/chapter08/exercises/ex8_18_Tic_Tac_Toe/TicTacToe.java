package chapter08.exercises.ex8_18_Tic_Tac_Toe;


public class TicTacToe {
   private final int files = 3;
   private final int columns = 3;
   private enum Cells {X, O, EMPTY};
   private final Cells[][] board = new Cells[files][columns];
   private boolean playerOne = true;

   public TicTacToe() {
      for (int i = 0; i < files; i++) {
         for (int j = 0; j < columns; j++) {
            board[i][j] = Cells.EMPTY;
         }
      }
   }

   public void makeMove(int file, int column) {
      if (board[file][column] != Cells.EMPTY) {
         System.out.println("The cell is not empty, try another one");
         return;
      }

      String player;

      if (playerOne) {
         board[file][column] = Cells.X;
         player = "Player2";
      } else {
         board[file][column] = Cells.O;
         player = "Player1";
      }

      playerOne = !playerOne;
      displayBoard();
      System.out.println("\n" + player + "'s turn");
   }

   public void displayBoard() {
      for (int i = 0; i < files; i++) {
         System.out.println("\n-------------");
         System.out.print("|");

         for (int j = 0; j < columns; j++) {

            switch (board[i][j]) {
               case EMPTY:
                  System.out.print("   |");
                  break;
               case X:
                  System.out.print(" X |");
                  break;
               case O:
                  System.out.print(" O |");
                  break;
               default:
                  System.out.println("Program should not enter her");
                  break;
            }
         }
      }

      System.out.println("\n-------------");
   }
}
