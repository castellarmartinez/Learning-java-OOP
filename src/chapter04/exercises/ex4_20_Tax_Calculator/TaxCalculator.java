package chapter04.exercises.ex4_20_Tax_Calculator;

import java.util.Scanner;

class Person {
		private String name;
		public double salary;

		public Person(String name, double salary) {
				this.name = name;
				this.salary = salary;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public double getSalary() {
				return salary;
		}

		public void setSalary(double salary) {
				this.salary = salary;
		}

		public double getTaxesPayment() {
				if (this.salary > 30_000) {
						return this.salary * 0.2;
				}

				return this.salary * 0.15;
		}
}

public class TaxCalculator {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				String name;
				double salary;

				System.out.print("Enter the person's name: ");
				name = input.nextLine();
				System.out.print("Enter the person's salary: ");
				salary = input.nextDouble();

				Person person = new Person(name, salary);

				System.out.printf("%s has to pay $%.2f in taxes", person.getName(), person.getTaxesPayment());
		}
}
