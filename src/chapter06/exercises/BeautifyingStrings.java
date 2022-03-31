package chapter06.exercises;

public class BeautifyingStrings {
   private static String checkForFullStop(String theString) {
      if (theString.endsWith(".")) {
         return theString;
      }

      return theString.concat(".");
   }

   private static String checkForCapitalizedAtBeginning(String theString) {
      char firstChar = theString.charAt(0);

      if (firstChar >= 65 && firstChar <= 90) {
         return theString;
      }

      firstChar -= 32;
      String stringCapitalized = String.valueOf(firstChar).concat(theString.substring(1));

      return stringCapitalized;
   }

   public static String beautifyString(String theString) {
      String stringWithFullStop = checkForFullStop(theString);
      String stringCapitalized = checkForCapitalizedAtBeginning(stringWithFullStop);

      return stringCapitalized;
   }
}
