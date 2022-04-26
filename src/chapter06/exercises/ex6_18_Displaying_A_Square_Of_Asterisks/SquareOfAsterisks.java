package chapter06.exercises.ex6_18_Displaying_A_Square_Of_Asterisks;

public class SquareOfAsterisks {
   public static void squareOfAsterisks(int side) {
      for (int i = 0; i < side; i++) {
         for (int j = 0; j < side; j++) {
            System.out.print("* ");
         }

         System.out.println();
      }
   }
}
