package chapter04.exercises.ex4_27_Dangling_else_Problem;

public class DanglingElseProblem {
		public static void main(String[] args) {
				int x = 5;
				int y = 7;

				if (x > 5) {
						if (y > 5)
								System.out.println("x and y are > 5");
				} else {
						System.out.println("x is <= 5");
				}
		}
}
