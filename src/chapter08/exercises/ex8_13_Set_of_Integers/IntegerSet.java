package chapter08.exercises.ex8_13_Set_of_Integers;

import java.security.SecureRandom;

public class IntegerSet {
   private final boolean[] set;

   IntegerSet() {
      final SecureRandom random = new SecureRandom();
      final int setLength = 101;

      set = new boolean[setLength];

      for (int i = 0; i < setLength; i++) {
         set[i] = random.nextInt(2) == 1;
      }
   }

   public boolean[] getSet() {
      return this.set;
   }
   public boolean isInTheSet(int number) {
      return set[number];
   }
}
