package chapter05.exercises.ex5_29_The_Twelve_Days_Of_Christmas_Song;

public class TheTwelveDaysOfChristmas {
		public static void main(String[] args) {
				for (int i = 1; i <= 12; i++) {

						switch (i) {

								case 12:
										System.out.println("On the Twelfth day of Christmas");
										break;
								case 11:
										System.out.println("On the Eleventh day of Christmas");
										break;
								case 10:
										System.out.println("On the Tenth day of Christmas");
										break;
								case 9:
										System.out.println("On the Ninth day of Christmas");
										break;
								case 8:
										System.out.println("On the Eighth day of Christmas");
										break;
								case 7:
										System.out.println("On the Seventh day of Christmas");
										break;
								case 6:
										System.out.println("On the Sixth day of Christmas");
										break;
								case 5:
										System.out.println("On the Fifth day of Christmas");
										break;
								case 4:
										System.out.println("On the Fourth day of Christmas");
										break;
								case 3:
										System.out.println("On the Third day of Christmas");
										break;
								case 2:
										System.out.println("On the Second day of Christmas");
										break;
								case 1:
										System.out.println("\nOn the First day of Christmas");
										break;
								default:
										System.out.println("The program should not enter here.");
										break;
						}

						System.out.println("My good friends brought to me");

						switch (i) {

								case 12:
										System.out.println("All their good wishes,");
								case 11:
										System.out.println("Gifts for one and all,");
								case 10:
										System.out.println("Some mistletoe,");
								case 9:
										System.out.println("A guardian angel,");
								case 8:
										System.out.println("Gold and silver tinsel,");
								case 7:
										System.out.println("Candles a-glowing,");
								case 6:
										System.out.println("Little silver bells,");
								case 5:
										System.out.println("A shining star,");
								case 4:
										System.out.println("Four colored lights,");
								case 3:
										System.out.println("Three boughs of holly,");
								case 2:
										System.out.println("Two candy canes\n" +
																		"And a song for the Christmas tree.\n");
										break;
								case 1:
										System.out.println("A song and a Christmas tree.\n");
										break;
								default:
										System.out.println("The program should not enter here.");
										break;
						}
				}
		}
}
