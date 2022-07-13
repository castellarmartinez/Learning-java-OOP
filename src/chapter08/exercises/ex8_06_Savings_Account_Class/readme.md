### Savings Account Class

Create class **_SavingsAccount_**. Use a **_static_** variable **_annualInterestRate_** to store the annual 
interest rate for all account holders. Each object of the class contains a **_private_** instance variable
**_savingsBalance_** indicating the amount the saver currently has on deposit.
Provide method **_calculateMonthlyInterest_** to calculate the monthly interest by multiplying the
**_savingsBalance_** by **_annualInterestRate_** divided by 12—this interest should be added to 
**_savingsBalance_**. Provide a **_static_** method **_modifyInterestRate_** that sets the **_annualInterestRate_** to a new
value. Write a program to test class SavingsAccount. Instantiate two **_savingsAccount_** objects, **_saver1_**
and **_saver2_**, with balances of $2000.00 and $3000.00, respectively. Set **_annualInterestRate_** to
4%, then calculate the monthly interest for each of 12 months and print the new balances for both
savers. Next, set the **_annualInterestRate_** to 5%, calculate the next month’s interest and print the
new balances for both savers.