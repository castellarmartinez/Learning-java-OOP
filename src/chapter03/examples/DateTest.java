package chapter03.examples; /**
 * Fecha 20/05/2021
 **/

import java.util.Scanner;

public class DateTest 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Date myDateOfBirth = new Date(18, 06, 1994);
		Date myHappyDate = new Date(15, 11, 2021);
		
		System.out.println("Initial dates: ");
		System.out.printf("Date of birth: %s%n", myDateOfBirth.displayDate());
		System.out.printf("My happy date: %s%n%n", myHappyDate.displayDate());
		
		myHappyDate.setDay(11);
		myHappyDate.setMonth(11);
		
		System.out.println("Modified dates: ");
		System.out.printf("Date of birth: %s%n", myDateOfBirth.displayDate());
		System.out.printf("My happy date: %s%n", myHappyDate.displayDate());
	}

}
