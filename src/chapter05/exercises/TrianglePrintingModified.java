package chapter05.exercises;

public class TrianglePrintingModified {
   public static void main(String[] args) {
      System.out.println("\nFirst pattern: ");

      for (int i = 1; i <= 10; i++) {
         //First triangle
         for (int j = 1; j <= 10; j++) {
            if (j <= i) {
               System.out.print('*');
            } else {
               System.out.print(' ');
            }
         }

         System.out.print("  ");

         //Second triangle
         for (int j = 10; j >= 1; j--) {
            if (j >= i) {
               System.out.print('*');
            } else {
               System.out.print(' ');
            }
         }

         System.out.print("  ");

         //Third triangle
         for (int j = 1; j <= 10; j++) {
            if (j < i) {
               System.out.print(' ');
            } else {
               System.out.print('*');
            }
         }

         System.out.print("  ");

         //Fourth triangle
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
