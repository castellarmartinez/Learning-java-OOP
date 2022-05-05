### Sieve of Eratosthenes

A prime number is any integer greater than 1 that’s evenly divisible only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates as
follows:

a) Create a primitive-type **_boolean_** array with all elements initialized to true. Array elements
with prime indices will remain true. All other array elements will eventually be
set to **_false_**.\
b) Starting with array index 2, determine whether a given element is **_true_**. If so, loop
through the remainder of the array and set to **_false_** every element whose index is a multiple
of the index for the element with value true. Then continue the process with the
next element with value true. For array index 2, all elements beyond element 2 in the
array that have indices which are multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to
**_false_**; for array index 3, all elements beyond element 3 in the array that have indices
which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to **_false_**; and so on.

When this process completes, the array elements that are still **_true_** indicate that the index is a
prime number. These indices can be displayed. Write an application that uses an array of 1,000 elements
to determine and display the prime numbers between 2 and 999. Ignore elements 0 and 1.