package chapter08.exercises.ex8_14_Static_Methods;

import java.security.SecureRandom;

public class IntegerSetTest {
   public static void main(String[] args) {
      IntegerSet mySet = new IntegerSet();
      IntegerSet yourSet = new IntegerSet();

      insertRandomValues(mySet);
      insertRandomValues(yourSet);

      System.out.println("My set:");
      System.out.println(mySet);

      System.out.println("\nYour set:");
      System.out.println(yourSet);

      System.out.println("\nUnion between the two sets:");
      System.out.println(IntegerSet.union(mySet, yourSet));

      System.out.println("\nIntersection between the two sets:");
      System.out.println(IntegerSet.intersection(mySet, yourSet));

      removeRandomValues(mySet);
      removeRandomValues(yourSet);

      System.out.println("\nAfter deleting random values:");

      System.out.println("\nMy set:");
      System.out.println(mySet);

      System.out.println("\nYour set:");
      System.out.println(yourSet);
   }

   public static void insertRandomValues(IntegerSet set) {
      final SecureRandom random = new SecureRandom();

      for (int i = 0; i < set.getSet().length; i++) {
         if (random.nextInt(2) % 2 == 0) {
            set.insertElement(i);
         }
      }
   }

   public static void removeRandomValues(IntegerSet set) {
      final SecureRandom random = new SecureRandom();

      for (int i = 0; i < set.getSet().length; i++) {
         if (random.nextInt(2) % 2 == 0) {
            set.deleteElement(i);
         }
      }
   }
}
