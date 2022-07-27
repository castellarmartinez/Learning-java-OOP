package chapter08.exercises.ex8_17_Huge_Integer_Class;

public class HugeInteger {
   private final int numberOfDigits = 40;
   private final int[] hugeInteger = new int[numberOfDigits];

   public void parse(String number) {
      if (number.length() > numberOfDigits) {
         throw new IllegalArgumentException("The number cannot have more thant 40 digits");
      }

      for (int i = number.length() - 1; i >= 0; i--) {
         hugeInteger[i] = Character.getNumericValue(number.charAt(i));
      }
   }

   public boolean isEqualTo(HugeInteger number2) {
      for (int i = 0; i < numberOfDigits; i++) {
         if (this.hugeInteger[i] != number2.hugeInteger[i]) {
            return false;
         }
      }

      return true;
   }

   public boolean isNotEqualTo(HugeInteger number2) {
      return !isEqualTo(number2);
   }

   public boolean isGreaterThan(HugeInteger number2) {
      if (isEqualTo(number2)) {
         return false;
      }

      for (int i = 0; i < numberOfDigits; i++) {
         if (this.hugeInteger[i] < number2.hugeInteger[i]) {
            return false;
         }
      }

      return true;
   }

   public boolean isLessThan(HugeInteger number2) {
      return !isEqualTo(number2) && !isGreaterThan(number2);
   }

   public boolean isGreaterThanOrEqualTo(HugeInteger number2) {
      return !isLessThan(number2);
   }

   public boolean isLessThanOrEqualTo(HugeInteger number2) {
      return !isGreaterThan(number2);
   }
}
