package chapter06.exercises.ex6_38_Computer_Assisted_Instruction_Difficulty_Levels;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionLevels {
		public static void main(String[] args) {
				while (true) {
						int level = chooseLevel();
						int studentAnswers = startQuiz(level);
						displayPerformance(studentAnswers);
				}
		}

		private static int startQuiz(int level) {
				Scanner input = new Scanner(System.in);
				int correctAnswers = 0;

				for (int i = 0; i < 10; i++) {
						int result = howMuchIsIt(level);
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
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the level of difficulty (1-5): ");

				return input.nextInt();
		}

		public static int howMuchIsIt(int level) {
				SecureRandom randomNumbers = new SecureRandom();
				int number1 = randomNumbers.nextInt((int) Math.pow(10, level)) + 1;
				int number2 = randomNumbers.nextInt((int) Math.pow(10, level)) + 1;

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
