package chapter07.exercises.ex7_16_Using_Enhanced_For_Stament;

public class UsingEnhancedForStatement {
		public static void main(String[] args) {
				for (String number : args) {
						System.out.printf("%5d", Integer.parseInt(number));
				}
		}
}
