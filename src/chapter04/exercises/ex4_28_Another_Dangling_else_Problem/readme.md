### Another Dangling-else Problem

Based on the **dangling-else** discussion in Exercise 4.27,
state the output for each of the following code segments when _x_ is 9 and _y_ is 11 and when _x_ is 11
and _y_ is 9. We eliminated the indentation from the following code to make the problem more challenging.
[_Hint_: Apply the indentation conventions you’ve learned.]

a)

    1 if (x < 10)
    2 if (y > 10)
    3 System.out.println("*****");
    4 else
    5 System.out.println("#####");
    6 System.out.println("$$$$$");

b)

    7 if (x < 10) {
    8 if (y > 10)
    9 System.out.println("*****");
    10 }
    11 else {
    12 System.out.println("#####");
    13 System.out.println("$$$$$");
    14 }

