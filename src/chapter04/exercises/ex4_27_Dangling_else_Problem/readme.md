### Dangling-else Problem

The Java compiler always associates an _else_ with the immediately
preceding _if_ unless told to do otherwise by the placement of braces ({ and }). This behavior can
lead to what is referred to as the **dangling-else problem**. The indentation of the nested statement

    1 if (x > 5)
    2   if (y > 5)
    3       System.out.println("x and y are > 5");
    4 else
    5   System.out.println("x is <= 5");

appears to indicate that if _x_ is greater than 5, the nested _if_ statement determines whether _y_ is also
greater than 5. If so, the statement outputs the string _"x and y are > 5"_. Otherwise, it appears that
if _x_ is not greater than 5, the _else_ part of the _if…else_ outputs the string _"x is <= 5"_. Beware! This
nested _if…else_ statement does _not_ execute as it appears. The compiler actually interprets the
statement as

    1 if (x > 5)
    2   if (y > 5)
    3       System.out.println("x and y are > 5");
    4   else
    5       System.out.println("x is <= 5");

in which the body of the first _if_ is a _nested_ _if…else_. The outer _if_ statement tests whether x is
greater than 5. If so, execution continues by testing whether y is also greater than 5. If the second
condition is _true_, the proper string—_"x and y are > 5"_—is displayed. However, if the second condition
is false, the string _"x is <= 5"_ is displayed, even though we know that _x_ is greater than 5.
Equally bad, if the outer _if_ statement’s condition is _false_, the inner _if…else_ is skipped and nothing
is displayed. For this exercise, add braces to the preceding code snippet to force the nested
_if…else_ statement to execute as it was originally intended.