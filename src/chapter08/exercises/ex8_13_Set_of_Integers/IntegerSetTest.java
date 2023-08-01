package chapter08.exercises.ex8_13_Set_of_Integers;

public class IntegerSetTest {
		public static void main(String[] args) {
				IntegerSet mySet = new IntegerSet();
				int testNumber1 = 8;
				int testNumber2 = 17;
				int testNumber3 = 11;

				System.out.printf("Testing if %d is in the set: %b%n",
												testNumber1, mySet.isInTheSet(testNumber1));
				System.out.printf("Testing if %d is in the set: %b%n",
												testNumber2, mySet.isInTheSet(testNumber2));
				System.out.printf("Testing if %d is in the set: %b%n%n",
												testNumber3, mySet.isInTheSet(testNumber3));
				System.out.println("The numbers included in the set are: ");

				for (int i = 0; i < mySet.getSet().length; i++) {
						if (mySet.getSet()[i]) {
								System.out.printf("%d%n", i);
						}
				}
		}
}
