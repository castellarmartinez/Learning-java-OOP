### Modifying the Internal Data Representation of a Class

It would be perfectly reasonable for the **_Time2_** class of Fig. 8.5 to represent the time internally as the number of seconds since midnight
rather than the three integer values **_hour_**, **_minute_** and **_second_**. Clients could use the same **_public_** 
methods and get the same results. Modify the **_Time2_** class of Fig. 8.5 to implement the time as the number of seconds since midnight and show that no change is visible to the clients of the class.