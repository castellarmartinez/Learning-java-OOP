package chapter05.exercises;

import java.util.Scanner;

public class StudentGrades {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int ACount = 0;
      int BCount = 0;
      int CCount = 0;
      int DCount = 0;

      for (int i = 0; i < 5; i++) {
         System.out.print("Enter the student number and the grade (e. g: 3 A): ");
         input.nextInt();
         char grade = input.next().charAt(0);

         switch (grade) {
            case 'A':
               ACount++;
               break;
            case 'B':
               BCount++;
               break;
            case 'C':
               CCount++;
               break;
            case 'D':
               DCount++;
               break;
            default:
               System.out.println("Wrong grade");
               break;
         }
      }

      System.out.println("Student who earned an A: " + ACount);
      System.out.println("Student who earned a B: " + BCount);
      System.out.println("Student who earned a C: " + CCount);
      System.out.println("Student who earned a D: " + DCount);
   }
}
