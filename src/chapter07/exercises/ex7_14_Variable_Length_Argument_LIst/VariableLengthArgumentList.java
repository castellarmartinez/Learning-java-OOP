package chapter07.exercises.ex7_14_Variable_Length_Argument_LIst;

public class VariableLengthArgumentList {
		public static void main(String[] args) {
				double sum = 0;

				for (int i = 0; i < args.length; i++) {
						sum += Integer.parseInt(args[i]);
				}

				System.out.printf("The average of the integers entered as argument list:"
												+ " %.1f", (sum / args.length));
		}
}
