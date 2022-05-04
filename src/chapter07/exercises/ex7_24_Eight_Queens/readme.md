### Eight Queens

Another puzzler for chess buffs is the Eight Queens problem, which asks the
following: Is it possible to place eight queens on an empty chessboard so that no queen is “attacking”
any other (i.e., no two queens are in the same row, in the same column or along the same diagonal)?
Use the thinking developed in Exercise 7.22 to formulate a heuristic for solving the Eight Queens
problem. Run your application. [_Hint_: It’s possible to assign a value to each square of the chessboard
to indicate how many squares of an empty chessboard are “eliminated” if a queen is placed in that
square. Each of the corners would be assigned the value 22, as demonstrated by Fig. 7.31. Once
these “elimination numbers” are placed in all 64 squares, an appropriate heuristic might be as follows:
Place the next queen in the square with the smallest elimination number. Why is this strategy
intuitively appealing?]