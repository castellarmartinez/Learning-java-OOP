### Removing Duplicated Code in Method main

In the **_AccountTest_** class of Fig. 3.9, method
main contains six statements (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each display
an **_Account_** object’s _name_ and _balance_. Study these statements and you’ll notice that they differ
only in the **_Account_** object being manipulated—_account1_ or _account2_. In this exercise, you’ll define
a new _displayAccount_ method that contains _one_ copy of that output statement. The method’s parameter
will be an **_Account_** object and the method will output the object’s _name_ and _balance_. You’ll
then replace the six duplicated statements in main with calls to _displayAccount_, passing as an argument
the specific **_Account_** object to output.

Modify class **_AccountTest_** of Fig. 3.9 to declare method _displayAccount_ (Fig. 3.20) _after_ the
closing right brace of _main_ and _before_ the closing right brace of class **_AccountTest_**. Replace the comment
in the method’s body with a statement that displays _accountToDisplay_’s _name_ and _balance_.

    1 public static void displayAccount(Account accountToDisplay) {
    2 // place the statement that displays
    3 // accountToDisplay's name and balance here
    4 }

    Fig. 3.20 | Method displayAccount to add to class Account.

Recall that _main_ is a _static_ method, so it can be called without first creating an object of the
class in which _main_ is declared. We also declared method _displayAccount_ as a _static_ method.
When main needs to call another method in the same class without first creating an object of that
class, the other method _also_ must be declared _static_.

Once you’ve completed _displayAccount_’s declaration, modify _main_ to replace the statements
that display each **_Account_**’s _name_ and _balance_ with calls to _displayAccount_—each receiving as its
argument the _account1_ or _account2_ object, as appropriate. Then, test the updated **_AccountTest_**
class to ensure that it produces the same output as shown in Fig. 3.9.