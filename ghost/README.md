# GHOST
GHOST is a simple, competitive multiplayer word game in which players take turns adding characters to a string. Gameplay proceeds as follows:

1. Start with an empty string.
2. A player adds a letter to the string. With each letter added, the string both must be a prefix of at least one complete word, and must not be a complete word itself. (For example, "th" is a valid string because "the" starts with "th", but "the" is not a valid string because "the" is a word.)
3. Play proceeds to the next player, who adds their own letter to the string as in step 2. If the next player thinks that the current string breaks the rules, they may challenge it. If the string does break the rules, the challenge is successful, and the previous player gains a strike. If the string does not break the rules, the challenge is unsuccessful, and the challenger gains a strike instead.
4. Repeat step 3 until a player gains a strike (represented by the letters of the word "GHOST"). When a player gains a strike, go to step 1.

When a player gains 5 strikes, they are eliminated; the last player to be eliminated wins. Players may also forfeit on their turn, which causes them to automatically gain a strike.

Your task is to write a program that plays GHOST. You must implement the interface in GhostPlayer.h. In `readWords()`, your implementation should read the authoritative word list into memory, and `getNextLetter()` should return a valid move for the given string. Your implementation must always challenge invalid strings, and must always forfeit if there is no valid move. You can find `#define`s for these return values in GhostGameHandler.h.

To build and run your code, add a task to the supplied makefile for your class, and add your class to the existing main task. To start a game, call `GhostGameHandler::runGame()` with the following arguments:

1. A path to a file containing a newline-separated list of words
2. A `vector` containing pointers to `GhostPlayer`s that will participate
3. (Optional) A timeout that `GhostGameHandler` will enforce for each call to `getNextLetter()`, in seconds

# Background
For this project, you'll need to know or learn about these topics:

 * file I/O
 * search algorithms and data structures

# Tips
 * The `GhostGameHandler` can be queried about the current state of the game, which you may find helpful in coming up with the optimal move.
 * The included word lists (words.txt and smallwords.txt) only use words with lower case alphabetic characters.
 * Your code's performance is important. If it takes more than 10 seconds to read in the word list, your player will be dropped from the game, and if it crashes or times out while making a move, your player will gain a strike.
 * This project can be viewed as a [constraint satisfaction problem](https://en.wikipedia.org/wiki/Constraint_satisfaction_problem).
 * The included `HumanGhostPlayer` takes moves from `stdin`, so you can play against your implementation for troubleshooting (or fun).

# Extensions
When your GhostPlayer works, try the following:

1. Improve on your strategy. Try to make your `GhostPlayer` always choose the optimal move for the situation.
2. Improve on performance. Use different algorithms and data structures to see if you can get your `GhostPlayer` to make moves faster.
