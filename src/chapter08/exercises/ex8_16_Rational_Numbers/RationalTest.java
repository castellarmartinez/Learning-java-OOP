package chapter08.exercises.ex8_16_Rational_Numbers;

public class RationalTest {
		public static void main(String[] args) {
				Rational number1 = new Rational();
				Rational number2 = new Rational(7, 5);
				Rational number3 = new Rational(7, 23);

				System.out.println("Number 1: " + number1);
				System.out.println("Number 1 in floating-point: " + number1.floatingFormat(3));

				System.out.println("\nNumber 2: " + number2);
				System.out.println("Number 2 in floating-point: " + number2.floatingFormat(4));

				System.out.println("\nNumber 3: " + number3);
				System.out.println("Number 3 in floating-point: " + number3.floatingFormat(5));

				System.out.println("\nSum of number2 and number3: " + Rational.add(number2, number3));
				System.out.println("Sum of number2 and number3: " + Rational.add(number2, number3).floatingFormat(3));

				System.out.println("\nSubtract of number2 and number3: " + Rational.subtract(number2, number3));
				System.out.println("Subtract of number2 and number3: " + Rational.subtract(number2, number3).floatingFormat(3));

				System.out.println("\nMultiplication of number2 and number3: " + Rational.multiply(number2, number3));
				System.out.println("Multiplication of number2 and number3: " + Rational.multiply(number2, number3).floatingFormat(3));

				System.out.println("\nDivision of number2 and number3: " + Rational.divide(number2, number3));
				System.out.println("Division of number2 and number3: " + Rational.divide(number2, number3).floatingFormat(3));
		}
}
