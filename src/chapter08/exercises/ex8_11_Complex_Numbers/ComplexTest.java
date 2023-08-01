package chapter08.exercises.ex8_11_Complex_Numbers;

public class ComplexTest {
		public static void main(String[] args) {
				Complex complex1 = new Complex(7, 8);
				Complex complex2 = new Complex(-2, 3);

				System.out.println("First complex number:");
				complex1.print();
				System.out.println("Second complex number:");
				complex2.print();

				System.out.println("\nSum of the two complex number:");
				Complex.add(complex1, complex2).print();
				System.out.println("Difference of the two complex number:");
				Complex.subtract(complex1, complex2).print();
		}
}
