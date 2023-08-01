package chapter07.exercises.ex7_15_Command_Line_Arguments;

public class CommandLineArguments {
		public static void main(String[] args) {
				int max = Integer.parseInt(args[0]);
				int min = Integer.parseInt(args[0]);
				int average = 0;

				for (int i = 0; i < args.length; i++) {
						int current = Integer.parseInt(args[i]);

						if (current > max) {
								max = current;
						}
						if (current < min) {
								min = current;
						}
				}

				average = max - min;
				System.out.printf("The average between the maximum and minimum is: %d",
												average);
		}
}
