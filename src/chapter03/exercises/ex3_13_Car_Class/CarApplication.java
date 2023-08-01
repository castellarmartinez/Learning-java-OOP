package chapter03.exercises.ex3_13_Car_Class;

public class CarApplication {
		public static void main(String[] args) {
				Car car1 = new Car("Optra", "2008", 12_000);
				Car car2 = new Car("Corolla", "2005", 15_000);

				System.out.printf("The price of the %s is %.2f%n", car1.getModel(),
												car1.getPrice());
				System.out.printf("The price of the %s is %.2f%n", car2.getModel(),
												car2.getPrice());

				System.out.printf("Applying a 5%% discount on the price of the %s%n",
												car1.getModel());
				car1.setPrice(car1.getPrice() * 0.95);

				System.out.printf("Applying a 7%% discount on the price of the %s%n",
												car2.getModel());
				car2.setPrice(car2.getPrice() * 0.93);

				System.out.printf("The new price of the %s is %.2f%n", car1.getModel(),
												car1.getPrice());
				System.out.printf("The new price of the %s is %.2f%n", car2.getModel(),
												car2.getPrice());
		}
}
