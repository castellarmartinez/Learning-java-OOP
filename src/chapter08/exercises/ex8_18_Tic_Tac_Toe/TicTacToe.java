package chapter08.exercises.ex8_18_Tic_Tac_Toe;


public class TicTacToe {
   private final int files = 3;
   private final int columns = 3;
   private enum Cells {X, O, EMPTY};
   private final Cells[][] board = new Cells[files][columns];

   public TicTacToe() {
      for (int i = 0; i < files; i++) {
         for (int j = 0; j < columns; j++) {
            board[i][j] = Cells.EMPTY;
         }
      }
   }


}
