package chapter05.exercises.ex5_17_Students_Grades;

import java.util.Scanner;

public class StudentGrades {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int aCount = 0;
				int bCount = 0;
				int cCount = 0;
				int dCount = 0;

				for (int i = 0; i < 5; i++) {
						System.out.print("Enter the student number and the grade (e. g: Student 3 A): ");
						input.next();
						char grade = input.next().charAt(0);

						switch (grade) {
								case 'A':
										aCount++;
										break;
								case 'B':
										bCount++;
										break;
								case 'C':
										cCount++;
										break;
								case 'D':
										dCount++;
										break;
								default:
										System.out.println("Wrong grade");
										break;
						}
				}

				System.out.println("Student who earned an A: " + aCount);
				System.out.println("Student who earned a B: " + bCount);
				System.out.println("Student who earned a C: " + cCount);
				System.out.println("Student who earned a D: " + dCount);
		}
}
