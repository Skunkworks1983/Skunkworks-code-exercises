# Sudoku
Your task is to create a class that represents a sudoku. A sudoku is a logic puzzle consisting of a 9x9 grid of numbers. Each cell of the grid can either be empty or contain an integer from 1 to 9. The grid is also divided into 9 3x3 sub-grids. The puzzle is considered solved when each row, column, and sub-grid contains exactly one of each possible number. Here's an example of a sudoku which follows the rules but is not solved:
```
The first sub-grid contains a 1, and 8 blank cells
-------------------------
| 1     |   2   |     3 | The first row contains a 1, 3 blank cells, a 2, three more blank cells, and a 3 
|       |       |       |
|       |       |       |
-------------------------
|       |       |       |
| 4     |   5   |     6 |
|       |       |       |
-------------------------
|       |       |       |
|       |       |       |
| 7     |   8   |     9 |
-------------------------
The first column contains a 1, 3 blank cells, a 4, three more blank cells, and a 7
```

To complete the exercise, fill in the empty methods in the `Sudoku` class. Each cell should be represented by a single `int` number, with 0 representing an empty cell.

# Background
To do this, you'll need to know or learn about:
 * variables
 * methods
 * arrays
 * classes
 * for/while loops
 * if statements

If you need help, ask a mentor, or try searching [the Java tutorials](https://docs.oracle.com/javase/tutorial/) or [the Skunkworks-code-exercises repository's wiki](https://github.com/Skunkworks1983/Skunkworks-code-exercises/wiki).

# Tips
You only need one variable to contain the entire grid of numbers if you use arrays correctly. This variable will need to be a member of the `Sudoku` class so that all of the methods can have access to it.

# Extensions
1. Create a sudoku solver that takes a `Sudoku` object with a partially-full grid and tries to correctly fill in as many cells as possible.
2. Make a playable sudoku game with a command-line interface. Allow users to set values in the grid, view a print-out of the grid, and ask for a hint.