package chapter06.exercises.ex6_36_Computer_Assisted_Instruction_Reducing_Student_Fatigue;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionFatigue {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				while (true) {
						int result = howMuchIsIt();
						int answer = input.nextInt();

						while (result != answer) {
								displayWrongAnswer();
								answer = input.nextInt();
						}

						displayCorrectAnswer();
				}
		}

		public static int howMuchIsIt() {
				SecureRandom randomNumbers = new SecureRandom();
				int number1 = randomNumbers.nextInt(10) + 1;
				int number2 = randomNumbers.nextInt(10) + 1;

				System.out.printf("How much is %d times %d? ", number1, number2);

				return number1 * number2;
		}

		public static void displayCorrectAnswer() {
				SecureRandom randomNumbers = new SecureRandom();
				int option = randomNumbers.nextInt(4) + 1;

				switch (option) {
						case 1:
								System.out.println("Very good!");
								break;
						case 2:
								System.out.println("Excellent!");
								break;
						case 3:
								System.out.println("Nice work!");
								break;
						case 4:
								System.out.println("Keep up the good work!");
								break;
						default:
								break;
				}
		}

		public static void displayWrongAnswer() {
				SecureRandom randomNumbers = new SecureRandom();
				int option = randomNumbers.nextInt(4) + 1;

				switch (option) {
						case 1:
								System.out.println("No. Please try again.");
								break;
						case 2:
								System.out.println("Wrong. Try once more.");
								break;
						case 3:
								System.out.println("Don't give up!");
								break;
						case 4:
								System.out.println("No. Keep trying.");
								break;
						default:
								break;
				}
		}
}
