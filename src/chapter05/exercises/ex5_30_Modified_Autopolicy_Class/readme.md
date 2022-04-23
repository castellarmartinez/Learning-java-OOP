### Modified AutoPolicy Class

Modify class **_AutoPolicy_*+ in Fig. 5.11 to validate the two-letter
state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
and VT for Vermont. In **_AutoPolicy_** method **_setState_**, use the logical OR (||) operator
(Section 5.9) to create a compound condition in an **_if…else_** statement that compares the method’s
argument with each two-letter code. If the code is incorrect, the **_else_** part of the **_if…else_** statement
should display an error message. In later chapters, you’ll learn how to use exception handling to indicate
that a method received an invalid argument.