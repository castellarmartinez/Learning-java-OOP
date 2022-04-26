package chapter06.exercises.ex6_19_Displaying_A_Square_Of_Any_Character;

public class SquareOfAnyCharacter {
   private static char character;

   public static void squareOfAsterisks(int side) {
      for (int i = 0; i < side; i++) {
         for (int j = 0; j < side; j++) {
            System.out.print(character + " ");
         }

         System.out.println();
      }
   }

   public static void fillCharacter(char characterEntered) {
      character = characterEntered;
   }
}
