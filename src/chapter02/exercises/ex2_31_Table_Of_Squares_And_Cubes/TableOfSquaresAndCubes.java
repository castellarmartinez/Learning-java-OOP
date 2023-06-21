package chapter02.exercises.ex2_31_Table_Of_Squares_And_Cubes;

public class TableOfSquaresAndCubes {
   public static void main(String[] args) {
      String stringArgument = "%-8d%-8d%-5d%n";

      System.out.printf("%-8s%-8s%-5s%n", "number", "square", "cube");
      System.out.printf(stringArgument, 0, (int) Math.pow(0, 2), (int) Math.pow(0, 3));
      System.out.printf(stringArgument, 1, (int) Math.pow(1, 2), (int) Math.pow(1, 3));
      System.out.printf(stringArgument, 2, (int) Math.pow(2, 2), (int) Math.pow(2, 3));
      System.out.printf(stringArgument, 3, (int) Math.pow(3, 2), (int) Math.pow(3, 3));
      System.out.printf(stringArgument, 4, (int) Math.pow(4, 2), (int) Math.pow(4, 3));
      System.out.printf(stringArgument, 5, (int) Math.pow(5, 2), (int) Math.pow(5, 3));
      System.out.printf(stringArgument, 6, (int) Math.pow(6, 2), (int) Math.pow(6, 3));
      System.out.printf(stringArgument, 7, (int) Math.pow(7, 2), (int) Math.pow(7, 3));
      System.out.printf(stringArgument, 8, (int) Math.pow(8, 2), (int) Math.pow(8, 3));
      System.out.printf(stringArgument, 9, (int) Math.pow(9, 2), (int) Math.pow(9, 3));
      System.out.printf(stringArgument, 10, (int) Math.pow(10, 2), (int) Math.pow(10, 3));
   }
}
