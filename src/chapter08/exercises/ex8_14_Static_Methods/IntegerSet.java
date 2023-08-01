package chapter08.exercises.ex8_14_Static_Methods;

public class IntegerSet {
		private static final int setLength = 101;
		private final boolean[] set;

		IntegerSet() {
				set = new boolean[setLength];

				for (int i = 0; i < setLength; i++) {
						set[i] = false;
				}
		}

		public boolean[] getSet() {
				return this.set;
		}

		public boolean isInTheSet(int number) {
				return set[number];
		}

		public void insertElement(int k) {
				if (k < 0 || k > 100) {
						System.out.println("You can only insert elements in the range 0-100");
						return;
				}

				set[k] = true;
		}

		public void deleteElement(int k) {
				if (k < 0 || k > 100) {
						System.out.println("You can only delete elements in the range 0-100");
						return;
				}

				set[k] = false;
		}

		public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
				IntegerSet unionSet = new IntegerSet();

				for (int i = 0; i < 101; i++) {
						if (set1.getSet()[i] || set2.getSet()[i]) {
								unionSet.insertElement(i);
						}
				}

				return unionSet;
		}

		public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
				IntegerSet intersectionSet = new IntegerSet();

				for (int i = 0; i < 101; i++) {
						if (set1.getSet()[i] && set2.getSet()[i]) {
								intersectionSet.insertElement(i);
						}
				}

				return intersectionSet;
		}

		public String toString() {
				String formattedSet = "Set:";

				for (int i = 0; i < set.length; i++) {
						if (set[i] && formattedSet.equals("Set:")) {
								formattedSet += " " + i;
						} else if (set[i]) {
								formattedSet += ", " + i;
						}
				}

				return formattedSet;
		}
}
