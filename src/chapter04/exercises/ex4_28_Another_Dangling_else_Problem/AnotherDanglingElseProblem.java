package chapter04.exercises.ex4_28_Another_Dangling_else_Problem;

public class AnotherDanglingElseProblem {
		public static void main(String[] args) {
				int x = 9;
				int y = 11;

				if (x < 10)
						if (y > 10)
								System.out.println("*****");
						else
								System.out.println("#####");
				System.out.println("$$$$$");

				if (x < 10) {
						if (y > 10)
								System.out.println("*****");
				}	else {
						System.out.println("#####");
						System.out.println("$$$$$");
				}

				x = 11;
				y = 9;

				if (x < 10)
						if (y > 10)
								System.out.println("*****");
						else
								System.out.println("#####");
				System.out.println("$$$$$");

				if (x < 10) {
						if (y > 10)
								System.out.println("*****");
				}	else {
						System.out.println("#####");
						System.out.println("$$$$$");
				}
		}
}
