### Class fancyTime

Create class **fancyTime** with the following capabilities:

a) Output the time in multiple formats, such as

    HH:MM:SS a.m. / p.m. (12 hour format)
    HH:MM:SS (24 hour format)
    HH:MM (24 hour format)

b) Use overloaded constructors to create **Date** objects initialized with times of the formats in
part (a). In the first case the constructor should receive three integer values as well as a **string**
representing the meridiem (a.m. or p.m.). In the second case it should receive three integer
values. In the third case it should receive two integer values. You need to create a method
**displayTime** that will output the time in any of the three indicated formats. This method
will take a flag that can assume three values (1, 2, and 3). If the flag is 1, the first time format
is displayed; if 2, the second format is displayed; and if 3, the third format is displayed.