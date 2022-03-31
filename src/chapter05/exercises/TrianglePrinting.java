package chapter05.exercises;

public class TrianglePrinting {
   public static void main(String[] args) {
      System.out.println("\nFirst pattern: ");

      for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print('*');
         }

         System.out.println();
      }

      System.out.println("\nSecond pattern: ");

      for (int i = 10; i > 0; i--) {
         for (int j = i; j > 0; j--) {
            System.out.print('*');
         }

         System.out.println();
      }

      System.out.println("\nThird pattern: ");

      for (int i = 10; i > 0; i--) {
         for (int j = 10; j > 0; j--) {
            if (j > i) {
               System.out.print(' ');
            } else {
               System.out.print('*');
            }
         }

         System.out.println();
      }

      System.out.println("\nFourth pattern: ");

      for (int i = 1; i <= 10; i++) {
         for (int j = 10; j > 0; j--) {
            if (j > i) {
               System.out.print(' ');
            } else {
               System.out.print('*');
            }
         }

         System.out.println();
      }
   }
}
