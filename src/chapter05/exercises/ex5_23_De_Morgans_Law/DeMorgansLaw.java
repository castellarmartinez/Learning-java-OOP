package chapter05.exercises.ex5_23_De_Morgans_Law;

public class DeMorgansLaw {
		public static void main(String[] args) {
				int x = 6;
				int y = 7;
				int a = 4;
				int b = 4;
				int g = 11;
				int i = 13;
				int j = 6;

				System.out.printf("%30s%35s%n%n", "Original expression", "De Morgan's laws");
				System.out.printf("!(%d < 5) && !(%d >= 7) == %b", x, y, !(x < 5) && !(y >= 7));
				System.out.printf("%4s!((%d < 5) || (%d >= 7)) == %b%n", "", x, y, !((x < 5) || (y >= 7)));
				System.out.printf("!(%d == %d) || !(%d != 5) == %b", a, b, g, !(a == b) || !(g != 5));
				System.out.printf("%4s!((%d == %d) && (%d != 5)) == %b%n", "", a, b, g, !((a == b) && (g != 5)));
				System.out.printf("!((%d <= 8) && (%d > 4)) == %b", x, y, !((x <= 8) && (y > 4)));
				System.out.printf("%4s!(%d <= 8) || !(%d > 4) == %b%n", "", x, y, !(x <= 8) || !(y > 4));
				System.out.printf("!((%d > 4) || (%d <= 6)) == %b", x, y, !((i > 4) || (j <= 6)));
				System.out.printf("%4s!(%d > 4) && !(%d <= 6) == %b%n", "", x, y, !(i > 4) && !(j <= 6));
		}
}
