package chapter05.exercises.ex5_19_Calculating_the_value_of_PI;

public class ValueOfPi {
   public static void main(String[] args) {
      int terms = 200000;
      double pi = 0;
      int sign = 1;
      int count = 0;
      boolean found = false;

      System.out.printf("%8s%12s%n%n", "Terms", "Value of pi");

      for (int i = 1; i <= terms; i++) {
         pi += (sign * 4.0 / (i + (i - 1)));
         sign *= -1;

         if (!found) {
            count++;
            boolean hasTheSameBeginning = (int) (Math.abs(pi) * 100000) == 314159;

            if (hasTheSameBeginning) {
               found = !found;
            }
         }

         System.out.printf("%8d%12.8f%n", i, pi);
      }

      System.out.println("There were need " + count + " to get a value" +
              " that begins with 3.14159\n");
   }
}
