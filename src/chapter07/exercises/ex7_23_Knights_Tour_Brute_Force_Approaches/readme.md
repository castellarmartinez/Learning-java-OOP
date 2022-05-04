### Knight’s Tour: Brute-Force Approaches

In part (c) of Exercise 7.22, we developed a solution to the Knight’s Tour problem. The approach used, called the “accessibility heuristic,” generates
many solutions and executes efficiently.

As computers continue to increase in power, we’ll be able to solve more problems with sheer
computer power and relatively unsophisticated algorithms. Let’s call this approach “brute-force”
problem solving.

a) Use random-number generation to enable the knight to walk around the chessboard (in
its legitimate L-shaped moves) at random. Your application should run one tour and
display the final chessboard. How far did the knight get?

b) Most likely, the application in part (a) produced a relatively short tour. Now modify
your application to attempt 1,000 tours. Use a one-dimensional array to keep track of
the number of tours of each length. When your application finishes attempting the
1,000 tours, it should display this information in neat tabular format. What was the best
result?

c) Most likely, the application in part (b) gave you some “respectable” tours, but no full
tours. Now let your application run until it produces a full tour. [_Caution_: This version
of the application could run for hours on a powerful computer.] Once again, keep a table
of the number of tours of each length, and display this table when the first full tour
is found. How many tours did your application attempt before producing a full tour?
How much time did it take?

d) Compare the brute-force version of the Knight’s Tour with the accessibility-heuristic
version. Which required a more careful study of the problem? Which algorithm was
more difficult to develop? Which required more computer power? Could we be certain
(in advance) of obtaining a full tour with the accessibility-heuristic approach? Could we
be certain (in advance) of obtaining a full tour with the brute-force approach? Argue the
pros and cons of brute-force problem solving in general.