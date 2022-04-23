package chapter05.exercises.ex5_23_Diamond_Printing_Program;

public class DiamondPrinting {
   public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j >= 1; j--) {
            if (j > i) {
               System.out.print(' ');
            } else {
               System.out.print('*');
            }
         }

         for (int j = 1; j < i; j++) {
            System.out.print('*');
         }

         System.out.println();
      }

      for (int i = 4; i >= 1; i--) {
         for (int j = 5; j >= 1; j--) {
            if (j > i) {
               System.out.print(' ');
            } else {
               System.out.print('*');
            }
         }

         for (int j = i - 1; j >= 1; j--) {
            System.out.print('*');
         }

         System.out.println();
      }
   }
}
