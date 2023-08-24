package chapter06.exercises.ex6_21_Beautifying_Strings;

import java.util.Scanner;

public class BeautifyingStrings {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				String theString;

				System.out.print("Enter an string and I'll will beautify it: ");
				theString = input.nextLine();

				System.out.println("The beautified string is: " + beautifyString(theString));
		}

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

				return String.valueOf(firstChar).toUpperCase().concat(theString.substring(1));
		}

		public static String beautifyString(String theString) {
				return checkForCapitalizedAtBeginning(checkForFullStop(theString));
		}
}
