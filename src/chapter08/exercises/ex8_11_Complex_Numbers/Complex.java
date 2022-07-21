package chapter08.exercises.ex8_11_Complex_Numbers;

public class Complex {
   private final double realPart;
   private final double imaginaryPart;

   Complex() {
      this(0, 0);
   }

   Complex(double realPart, double imaginaryPart) {
      this.realPart = realPart;
      this.imaginaryPart = imaginaryPart;
   }

   public static Complex add(Complex number1, Complex number2) {
      double sumReal = number1.realPart + number2.realPart;
      double sumImaginary = number1.imaginaryPart + number2.imaginaryPart;

      return new Complex(sumReal, sumImaginary);
   }

   public static Complex subtract(Complex number1, Complex number2) {
      double sumReal = number1.realPart - number2.realPart;
      double sumImaginary = number1.imaginaryPart - number2.imaginaryPart;

      return new Complex(sumReal, sumImaginary);
   }

   public void print() {
      System.out.printf("The complex number is: (%.2f, %.2f)%n", realPart, imaginaryPart);
   }
}
