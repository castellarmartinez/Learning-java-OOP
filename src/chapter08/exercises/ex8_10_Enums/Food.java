package chapter08.exercises.ex8_10_Enums;

public enum Food {
		APPLE("Fruit", 130),
		BANANA("Fruit", 200),
		CARROT("Vegetable", 50);

		private final String type;
		private final int numberOfCalories;

		Food(String type, int numberOfCalories) {
				this.type = type;
				this.numberOfCalories = numberOfCalories;
		}

		public String getType() {
				return type;
		}

		public int getNumberOfCalories() {
				return numberOfCalories;
		}
}
