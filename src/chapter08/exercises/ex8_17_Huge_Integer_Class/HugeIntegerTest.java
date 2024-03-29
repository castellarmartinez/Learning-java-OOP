package chapter08.exercises.ex8_17_Huge_Integer_Class;

public class HugeIntegerTest {
		public static void main(String[] args) {
				HugeInteger number1 = new HugeInteger();
				HugeInteger number2 = new HugeInteger();
				HugeInteger number3 = new HugeInteger();
				HugeInteger number4 = new HugeInteger();

				number1.parse("530814840448604045064506015");
				number2.parse("456645656410984564546545674");
				number3.parse("530814840448604045064506015");

				System.out.printf("Number1 is equal to number2? %b%n", number1.isEqualTo(number2));
				System.out.printf("Number1 is not equal to number2? %b%n", number1.isNotEqualTo(number2));
				System.out.printf("Number1 is greater than to number2? %b%n", number1.isGreaterThan(number2));
				System.out.printf("Number1 is less than to number2? %b%n", number1.isLessThan(number2));
				System.out.printf("Number1 is greater than or equal to number2? %b%n", number1.isGreaterThanOrEqualTo(number2));
				System.out.printf("Number1 is less than or equal to number2? %b%n", number1.isLessThanOrEqualTo(number2));
				System.out.printf("Number1 is equal to number3? %b%n", number1.isEqualTo(number3));
				System.out.printf("Number1 is greater than to number3? %b%n", number1.isGreaterThan(number3));
				System.out.printf("Number2 is zero? %b%n", number2.isZero());
				System.out.printf("Number4 is zero? %b%n", number4.isZero());
		}
}

