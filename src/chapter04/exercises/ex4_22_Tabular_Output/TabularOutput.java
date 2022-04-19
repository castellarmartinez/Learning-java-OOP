package chapter04.exercises.ex4_22_Tabular_Output;

public class TabularOutput {
   public static void main(String[] args) {
      int counter = 1;

      System.out.printf("%-5s%-7s%-7s%-7s%n%n", "N", "N^2", "N^3", "n^4");

      while (counter <= 10) {
         System.out.printf("%-5d%-7d%-7d%-7d%n", counter, (int) Math.pow(counter, 2),
                 (int) Math.pow(counter, 3), (int) Math.pow(counter, 4));

         counter++;
      }
   }
}
