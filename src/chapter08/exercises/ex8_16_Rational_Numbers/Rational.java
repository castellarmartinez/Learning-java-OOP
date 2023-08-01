package chapter08.exercises.ex8_16_Rational_Numbers;

public class Rational {
		private int numerator;
		private int denominator;

		public Rational() {
				this(1, 1);
		}

		public Rational(int numerator, int denominator) {
				this.numerator = numerator;
				this.denominator = denominator;
		}

		public static Rational add(Rational number1, Rational number2) {
				int numerator = number1.numerator * number2.denominator + number1.denominator * number2.numerator;
				int denominator = number1.denominator * number2.denominator;

				return new Rational(numerator, denominator);
		}

		public static Rational subtract(Rational number1, Rational number2) {
				int numerator = number1.numerator * number2.denominator - number1.denominator * number2.numerator;
				int denominator = number1.denominator * number2.denominator;

				return new Rational(numerator, denominator);
		}

		public static Rational multiply(Rational number1, Rational number2) {
				int numerator = number1.numerator * number2.numerator;
				int denominator = number1.denominator * number2.denominator;

				return new Rational(numerator, denominator);
		}

		public static Rational divide(Rational number1, Rational number2) {
				int numerator = number1.numerator * number2.denominator;
				int denominator = number1.denominator * number2.numerator;

				return new Rational(numerator, denominator);
		}

		public String toString() {
				return String.format("%d/%d", numerator, denominator);
		}

		public String floatingFormat(int precision) {
				return String.format("%." + precision + "f", (double) numerator / denominator);
		}
}
