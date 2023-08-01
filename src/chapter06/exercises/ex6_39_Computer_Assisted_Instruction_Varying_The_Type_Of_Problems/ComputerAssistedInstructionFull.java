package chapter06.exercises.ex6_39_Computer_Assisted_Instruction_Varying_The_Type_Of_Problems;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionFull {
		private static Scanner input = new Scanner(System.in);

		public static void main(String[] args) {
				while (true) {
						int level = chooseLevel();
						int operation = chooseOperation();
						int studentAnswers = startQuiz(level, operation);
						displayPerformance(studentAnswers);
				}
		}

		private static int chooseOperation() {
				System.out.print("What operation would you practice: " +
												"\n1) Addition.\n2) Subtraction.\n3) Multiplication.\n4) Division." +
												"\n5) Mix. \nOption: ");

				return input.nextInt();
		}

		private static int startQuiz(int level, int operation) {
				int correctAnswers = 0;

				for (int i = 0; i < 10; i++) {
						int result = howMuchIsIt(level, operation);
						int answer = input.nextInt();

						if (result == answer) {
								displayCorrectAnswer();
								correctAnswers++;
						}

						while (result != answer) {
								displayWrongAnswer();
								answer = input.nextInt();
						}
				}

				return correctAnswers;
		}

		private static int chooseLevel() {
				System.out.print("Enter the level of difficulty (1-5): ");
				return input.nextInt();
		}

		public static int howMuchIsIt(int level, int operation) {
				SecureRandom randomNumbers = new SecureRandom();
				int number1 = randomNumbers.nextInt((int) Math.pow(10, level)) + 1;
				int number2 = randomNumbers.nextInt((int) Math.pow(10, level)) + 1;

				if (operation == 5) {
						operation = randomNumbers.nextInt(4) + 1;
				}

				switch (operation) {
						case 1:
								System.out.printf("How much is %d plus %d? ", number1, number2);
								return number1 + number2;
						case 2:
								System.out.printf("How much is %d minus %d? ", number1, number2);
								return number1 - number2;
						case 3:
								System.out.printf("How much is %d times %d? ", number1, number2);
								return number1 * number2;
						case 4:
								System.out.printf("How much is %d divided  by %d? ", number1, number2);
								return number1 / number2;
						default:
								return 0;
				}
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

		private static void displayPerformance(int studentAnswers) {
				double percentage = studentAnswers / 10.0 * 100;

				if (percentage < 75) {
						System.out.println("Please ask your teacher for extra help.\n");
				} else {
						System.out.println("Congratulations, you are ready to go to the " +
														"next level!\n");
				}
		}

}
