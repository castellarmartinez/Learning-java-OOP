package chapter02.exercises.ex2_29_Integer_Value_Of_A_Character;

public class IntegerValueOfACharacter {
   public static void main(String[] args) {
      String stringArgument = "The character %c has the value %d%n";

      System.out.printf(stringArgument, 'A', ((int) 'A'));
      System.out.printf(stringArgument, 'B', ((int) 'B'));
      System.out.printf(stringArgument, 'C', ((int) 'C'));
      System.out.printf(stringArgument, 'a', ((int) 'a'));
      System.out.printf(stringArgument, 'b', ((int) 'b'));
      System.out.printf(stringArgument, 'c', ((int) 'c'));
      System.out.printf(stringArgument, '0', ((int) '0'));
      System.out.printf(stringArgument, '1', ((int) '1'));
      System.out.printf(stringArgument, '2', ((int) '2'));
      System.out.printf(stringArgument, '$', ((int) '$'));
      System.out.printf(stringArgument, '*', ((int) '*'));
      System.out.printf(stringArgument, '+', ((int) '+'));
      System.out.printf(stringArgument, '/', ((int) '/'));
      System.out.printf(stringArgument, ' ', ((int) ' '));
   }
}
