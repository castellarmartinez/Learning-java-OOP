### Craps Game Modification

Modify the craps program of Fig. 6.8 to allow wagering. Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
is less than or equal to **bankBalance**, and if it’s not, have the user reenter wager until a valid **wager**
is entered. Then, run one game of craps. If the player wins, increase bankBalance by **wager** and display
the new **bankBalance**. If the player loses, decrease **bankBalance** by **wager**, display the new **bankBalance**, check whether **bankBalance**
has become zero and, if so, display the message **"Sorry. You busted!"** As the game progresses, display various messages to create some “chatter,” such as **"Oh,
you're going for broke, huh?"** or **"Aw c'mon, take a chance!"** or **"You're up big. Now's the time
to cash in your chips!"**. Implement the “chatter” as a separate method that randomly chooses the
string to display.