### Clock Class

Create a class called **_Clock_** that includes three instance variables—an hour
(type _int_), a minute (type _int_) and a second (type _int_). Provide a constructor that initializes the
three instance variables and assumes that the values provided are correct. Provide a **_set_** and a **_get_**
method for each instance variable. The **_set_** method should set the value of all three variables to 0 if
the value of _hour_ is more than 23, the value of _minute_ is more than 59, and the value of _second_ is
more than 59. Provide a method _displayTime_ that display the time in an “hh:mm:ss” format. Write
a test app named _ClockTest_ that demonstrates class **_Clock_**’s capabilities.