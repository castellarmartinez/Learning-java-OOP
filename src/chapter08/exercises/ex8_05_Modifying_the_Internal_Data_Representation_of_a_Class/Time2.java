package chapter08.exercises.ex8_05_Modifying_the_Internal_Data_Representation_of_a_Class;// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2 {
		private int secondSinceMidnight;

		// Time2 no-argument constructor:
		// initializes each instance variable to zero
		public Time2() {
				this(0, 0, 0); // invoke constructor with three arguments
		}

		// Time2 constructor: hour supplied, minute and second defaulted to 0
		public Time2(int hour) {
				this(hour, 0, 0); // invoke constructor with three arguments
		}

		// Time2 constructor: hour and minute supplied, second defaulted to 0
		public Time2(int hour, int minute) {
				this(hour, minute, 0); // invoke constructor with three arguments
		}

		// Time2 constructor: hour, minute and second supplied
		public Time2(int hour, int minute, int second) {
				if (hour < 0 || hour >= 24) {
						throw new IllegalArgumentException("hour must be 0-23");
				}

				if (minute < 0 || minute >= 60) {
						throw new IllegalArgumentException("minute must be 0-59");
				}

				if (second < 0 || second >= 60) {
						throw new IllegalArgumentException("second must be 0-59");
				}

				this.secondSinceMidnight = hour * 3_600 + minute * 60 + second;
		}

		// Time2 constructor: another Time2 object supplied
		public Time2(Time2 time) {
				// invoke constructor with three arguments
				this(time.getHour(), time.getMinute(), time.getSecond());
		}

		// Set Methods
		// set a new time value using universal time;
		// validate the data
		public void setTime(int hour, int minute, int second) {
				if (hour < 0 || hour >= 24) {
						throw new IllegalArgumentException("hour must be 0-23");
				}

				if (minute < 0 || minute >= 60) {
						throw new IllegalArgumentException("minute must be 0-59");
				}

				if (second < 0 || second >= 60) {
						throw new IllegalArgumentException("second must be 0-59");
				}

				this.secondSinceMidnight = hour * 3_600 + minute * 60 + second;
		}

		// validate and set hour
		public void setHour(int hour) {
				if (hour < 0 || hour >= 24) {
						throw new IllegalArgumentException("hour must be 0-23");
				}

				int previousHour = getHour();
				secondSinceMidnight -= previousHour * 3_600;
				secondSinceMidnight += hour * 3_600;
		}

		// validate and set minute
		public void setMinute(int minute) {
				if (minute < 0 || minute >= 60) {
						throw new IllegalArgumentException("minute must be 0-59");
				}

				int previousMinute = getMinute();
				secondSinceMidnight -= previousMinute * 60;
				secondSinceMidnight += minute * 60;
		}

		// validate and set second
		public void setSecond(int second) {
				if (second < 0 || second >= 60) {
						throw new IllegalArgumentException("second must be 0-59");
				}

				int previousSecond = getSecond();
				secondSinceMidnight -= previousSecond;
				secondSinceMidnight += second;
		}

		// Get Methods
		// get hour value
		public int getHour() {
				return secondSinceMidnight / 3_600;
		}

		// get minute value
		public int getMinute() {
				return secondSinceMidnight % 3_600 / 60;
		}

		// get second value
		public int getSecond() {
				return secondSinceMidnight % 60;
		}

		// convert to String in universal-time format (HH:MM:SS)
		public String toUniversalString() {
				return String.format(
												"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
		}

		// convert to String in standard-time format (H:MM:SS AM or PM)
		public String toString() {
				return String.format("%d:%02d:%02d %s",
												((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
												getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
		}
}


/**************************************************************************
	* (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
	* Pearson Education, Inc. All Rights Reserved.                           *
	*                                                                        *
	* DISCLAIMER: The authors and publisher of this book have used their     *
	* best efforts in preparing the book. These efforts include the          *
	* development, research, and testing of the theories and programs        *
	* to determine their effectiveness. The authors and publisher make       *
	* no warranty of any kind, expressed or implied, with regard to these    *
	* programs or to the documentation contained in these books. The authors *
	* and publisher shall not be liable in any event for incidental or       *
	* consequential damages in connection with, or arising out of, the       *
	* furnishing, performance, or use of these programs.                     *
	*************************************************************************/
